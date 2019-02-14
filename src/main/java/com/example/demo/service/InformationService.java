package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.example.demo.dao.InformationDao;
import com.example.demo.model.Information;
import com.example.demo.nbpClient.NbpApiClient;

import retrofit2.Response;

@Service
public class InformationService {

private InformationDao informationDao;
	
	@Autowired
	public InformationService(InformationDao informationDao) {
		this.informationDao = informationDao;
	}
	
	public Information getInformation(){
		return informationDao.getInformation();
	}
	
	@Scheduled(cron = "0 50 15 * * ?")
	public void saveFromApiNbpInformation() {
		try {
			Response<List<Information>> response = new NbpApiClient().getNbpApi().getInformation().execute();
			if(response.code() == 200) {
				response.body()
					.stream()
					.forEach((information)->informationDao.saveInformation(information));
				System.out.println("Done!");
			}else {
				System.out.println("Else..." + response.code());
			}
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}	
	}
	
}
