package com.example.adocaoapp.ui.main;

import android.content.Context;

import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;

public interface MainContrato {

    interface Model{
        void requestPets(MainPresenter presenter);

    }

    interface View {
        public Context setContext();
        void showPets(ArrayList<Pet> pets);
        void iniciarDetails();


    }


    interface Presenter {
        void writeExtras(ArrayList<String> strings, Context context);
        void limpaPref();

        void callPets();
        void giveBackPets(ArrayList<Pet> pets);
    }
}
