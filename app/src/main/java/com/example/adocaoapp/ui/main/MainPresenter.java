package com.example.adocaoapp.ui.main;

import android.content.Context;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.RepositorioPets;

import java.util.ArrayList;
 class MainPresenter implements MainContrato.Presenter {

    private MainContrato.View view;
    private RepositorioPets repositorioPets = new RepositorioPets();
    private ArrayList<Pet> petArrayList = new ArrayList<>();

    public MainPresenter(MainContrato.View view) {
        this.view = view;
    }

    @Override
    public void callPets() {

        petArrayList = repositorioPets.getPets();
        view.showPets(petArrayList);

    }



 }
