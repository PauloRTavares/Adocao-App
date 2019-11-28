package com.example.adocaoapp.ui.main;



import android.content.Context;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.PetConsuming;
import com.example.adocaoapp.model.RepoPreferences;
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
    RepoPreferences preferences;


    public MainPresenter(MainContrato.View view) {
        this.view = view;
    }

    // Escreve os extras na shared e inicia a DetailsActivity

    @Override
    public void writeExtras(ArrayList<String> strings, Context context) {

        preferences = new RepoPreferences(context);
        preferences.writeExtras(strings);
        view.iniciarDetails();
    }

    @Override
    public void limpaPref() {
        preferences = new RepoPreferences(view.setContext());
        preferences.cleanPref();
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