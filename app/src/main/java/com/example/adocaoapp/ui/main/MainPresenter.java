package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.PetConsuming;

import java.util.ArrayList;

//Classe implementará Presenter do MainContrato
public class MainPresenter implements MainContrato.Presenter {

    MainContrato.View view;
    MainContrato.Model model;

    MainPresenter(MainContrato.View view, MainContrato.Model model){
        this.view = view;
        this.model = model;
    }

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