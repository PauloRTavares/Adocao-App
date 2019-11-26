package com.example.adocaoapp.ui.main;

import android.content.Context;

import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;

public interface MainContrato {

    interface Model{
        void requestPets(MainPresenter presenter);
    }

    interface View {
        void showPets(ArrayList<Pet> pets);
        //void petsReady(ArrayList<Pet> pets);
    }

    interface Presenter {
        void callPets();
        void giveBackPets(ArrayList<Pet> pets);
    }
}
