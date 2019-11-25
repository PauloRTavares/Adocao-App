package com.example.adocaoapp.ui.main;

import androidx.annotation.Nullable;

import com.example.adocaoapp.data.model.Pet;

import java.util.ArrayList;

public class MainPresenter implements MainContrato.Presenter {
    @Nullable
    private MainContrato.View view;
    private MainContrato.Model model;

    public MainPresenter(MainContrato.Model model) {
        this.model = model;
    }

    public void setView(MainContrato.View view) {
        this.view = view;
    }

    //Botão do Like aqui!

    //Botão do Acesso aos detalhes aqui também!

    //private PetRepository petRepository = new PetRepository();
    private ArrayList<Pet> petArrayList = new ArrayList<>();

    @Override
    public void callPets() {
        //petArrayList = petRepository.getPet();
        view.showPets(petArrayList);
    }
}
