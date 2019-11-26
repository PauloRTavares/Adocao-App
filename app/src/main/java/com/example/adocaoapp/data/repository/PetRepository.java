package com.example.adocaoapp.data.repository;

import com.example.adocaoapp.data.model.Pet;
import com.example.adocaoapp.service.JsonPlaceHolderApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PetRepository implements MainRepository {
    private Pet pet;
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
        return pets;
    }

    @Override
    public Pet getPet() {
        if (pet == null) {
            Pet pet = new Pet(
                    "Dinesh", "Kumar", "",
                    "","", "", "", "", "", "");
            pet.setId(0);
        }
        return pet;
    }

    @Override
    public void savePet(Pet pet) {
        if (pet == null) pet = getPet();
        else this.pet = pet;
    }
}