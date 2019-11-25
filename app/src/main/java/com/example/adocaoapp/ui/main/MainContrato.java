package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.data.model.Pet;

import java.util.ArrayList;

public interface MainContrato {

    interface View {
        void showPets(ArrayList<Pet> pets);
    }

    interface Presenter {
        void setView(View view);
        void callPets();
    }

    interface Model {
        void createPet(String nome, String cidade, String avatar,
                       String idade, String peso, String porte,
                       String raca, String cor, String sexo, String descricao);
        Pet getPet();
    }
}