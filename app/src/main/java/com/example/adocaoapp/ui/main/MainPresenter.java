package com.example.adocaoapp.ui.main;

import androidx.annotation.Nullable;

import com.example.adocaoapp.data.model.Pet;
import com.example.adocaoapp.data.repository.PetRepository;

import java.util.ArrayList;
 class MainPresenter implements MainContrato.Presenter {

    @Nullable
    private MainContrato.View view;
    private MainContrato.Model model;

    private PetRepository petRepository = new PetRepository();
    private ArrayList<Pet> petArrayList = new ArrayList<>();

    public MainPresenter(MainContrato.Model model) {
        this.model = model;
    }

    @Override
    public void setView(MainContrato.View view) {
        this.view = view;
    }

    //private PetRepository petRepository = new PetRepository();
    private ArrayList<Pet> petArrayList = new ArrayList<>();

    @Override
    public void callPets() {
        //petArrayList = petRepository.getPet();
        view.showPets(petArrayList);
    }

    //LikeButtonAqui

    //PetSelectedAqui
}
