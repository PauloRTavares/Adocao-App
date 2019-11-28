package com.example.adocaoapp.ui.main;



import android.content.Context;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.PetConsuming;

import java.util.ArrayList;

public class MainPresenter implements MainContrato.Presenter {

    private MainContrato.View view;
    private MainContrato.Model model = new PetConsuming();


    public MainPresenter(MainContrato.View view) {
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