package com.example.adocaoapp.model;




import com.example.adocaoapp.service.JsonPlaceHolderApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RepositorioPets {
    private ArrayList<Pet> pets = new ArrayList<>();


    public ArrayList<Pet> getPets() {

        //Conexao Retrofit2
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://5dd40af58b5e080014dc4e30.mockapi.io/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //JSON
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<List<Pet>> call = jsonPlaceHolderApi.getPets();

        call.enqueue(new Callback<List<Pet>>() {
            @Override
            public void onResponse(Call<List<Pet>> call, Response<List<Pet>> response) {
                List<Pet> pets = response.body();
            }

            @Override
            public void onFailure(Call<List<Pet>> call, Throwable t) {

            }
        });

        //Codigo com Erro

        /*pets.add(new Pet("Doguinho1"));

        pets.add(new Pet("Mergulhao"));

        pets.add(new Pet("Doguinho2"));*/


        return pets;
    }


}
