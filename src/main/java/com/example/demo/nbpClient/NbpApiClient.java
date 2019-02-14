package com.example.demo.nbpClient;

import org.springframework.stereotype.Component;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class NbpApiClient {

	private Retrofit retrofit;
	private NbpApi nbpApi;
	
	public NbpApiClient() {

		retrofit = new Retrofit.Builder().baseUrl("http://api.nbp.pl/api/")
				.addConverterFactory(GsonConverterFactory.create()).build();
		nbpApi = retrofit.create(NbpApi.class);
	}

	public NbpApi getNbpApi() {
		return nbpApi;
	}
	
}
