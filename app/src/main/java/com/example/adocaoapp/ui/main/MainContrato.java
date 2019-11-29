package com.example.adocaoapp.ui.main;

import android.content.Context;

import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;

public interface MainContrato {

    interface Model{
        //Chamar o retrofit para encaminhar os dados
        void requestPets(MainPresenter presenter);
    }

    interface View {
        //Ajustar o Contexto
        Context setContext();
        //Exibir a lista
        void showPets(ArrayList<Pet> pets);
        //Troca de Activity e Exibir Detalhes
        void iniciarDetails();
    }


    interface Presenter {
        //Chama o método requestPets da Model
        void callPets();
        //Chama o método showPets da View
        void giveBackPets(ArrayList<Pet> pets);
    }
}
