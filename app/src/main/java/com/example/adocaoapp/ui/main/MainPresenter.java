package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.PetConsuming;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;

public class MainPresenter implements MainContrato.Presenter {

    @Inject
    MainContrato.View view;
    MainContrato.Model model = new PetConsuming();


    MainPresenter(MainContrato.View view) {
        this.view = view;
    }

    // Escreve os extras na shared e inicia a DetailsActivity

    @Override
    public void callPets() {
        model.requestPets(this);
    }

    @Override
    public void giveBackPets(ArrayList<Pet> pets) {
        view.showPets(pets);
    }

}