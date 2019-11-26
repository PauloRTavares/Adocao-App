package com.example.adocaoapp.ui.main;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.PetConsuming;
import com.example.adocaoapp.service.JsonPlaceHolderApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainPresenter implements MainContrato.Presenter {

    private MainContrato.View view;
    private MainContrato.Model model = new PetConsuming();

    public MainPresenter(MainContrato.View view){
        this.view = view;
    }


    @Override
    public void callPets() {
        model.requestPets(this);
    }

    @Override
    public void giveBackPets(ArrayList<Pet> pets) {
        view.showPets(pets);
    }
}