package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.service.JsonPlaceHolderApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainPresenter implements MainContrato.Presenter {

    private MainContrato.View view;
    private ArrayList<Pet> petArrayList = new ArrayList<>();


    public MainPresenter(MainContrato.View view) {
        this.view = view;
    }


    @Override
    public void callPets() {
        //petArrayList = repositorioPets.getPets();

        //Conexao Retrofit2
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://5dd40af58b5e080014dc4e30.mockapi.io/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //JSON
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<ArrayList<Pet>> call = jsonPlaceHolderApi.getPets();

        call.enqueue(new Callback<ArrayList<Pet>>() {
            @Override
            public void onResponse(Call<ArrayList<Pet>> call, Response<ArrayList<Pet>> response) {
                ArrayList<Pet> pets = response.body();
                view.showPets(pets);
            }

            @Override
            public void onFailure(Call<ArrayList<Pet>> call, Throwable t) {

            }
        });
    }
}
