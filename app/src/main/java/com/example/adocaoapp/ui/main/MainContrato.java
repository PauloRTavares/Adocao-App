package com.example.adocaoapp.ui.main;

import android.content.Context;

import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;

public interface MainContrato {

    interface View {
        void showPets(ArrayList<Pet> pets);
    }

    interface Presenter {
        void callPets();
    }
}
