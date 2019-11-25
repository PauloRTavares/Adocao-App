package com.example.adocaoapp.service;

import com.example.adocaoapp.data.model.Pet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("pets")
    Call<List<Pet>> getPets();
}
