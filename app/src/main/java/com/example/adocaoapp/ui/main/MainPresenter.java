package com.example.adocaoapp.ui.main;

import android.content.Context;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.RepositorioPets;

import java.util.ArrayList;

public class MainPresenter implements MainContrato.Presenter {

    private MainContrato.View view;
    private RepositorioPets repositorioPets;
        private ArrayList<Pet> petArrayList = new ArrayList<>();


    public MainPresenter(MainContrato.View view, RepositorioPets repositorioPets, ArrayList<Pet> petArrayList) {
        this.view = view;
        this.repositorioPets = repositorioPets;
        this.petArrayList = petArrayList;
    }

    @Override
    public void callPets(Context context) {
        petArrayList = repositorioPets.getPets();

        view.showPets(petArrayList);
    }
}
