package com.example.demo.nbpClient;

import java.util.List;

import com.example.demo.model.Information;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NbpApi {

    @GET("exchangerates/tables/a/today?format=json")
    Call<List<Information>> getInformation();
	
}
