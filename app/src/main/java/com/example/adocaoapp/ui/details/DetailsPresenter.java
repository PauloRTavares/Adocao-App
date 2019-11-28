package com.example.adocaoapp.ui.details;

import android.content.Context;

import com.example.adocaoapp.model.RepoPreferences;

import java.util.ArrayList;

public class DetailsPresenter implements DetailsContrato.Presenter {
    private DetailsContrato.View view;
    private RepoPreferences repoPreferences;
    private ArrayList<String> sendExtras = new ArrayList<>();

    public DetailsPresenter(DetailsContrato.View view) {
        this.view = view;
    }


    @Override
    public void clickFavorito() {

    }

    @Override
    public void clickAdotar() {

    }

    @Override
    public void readDetails() {
         
         repoPreferences = new RepoPreferences(view.setContext());
         sendExtras = repoPreferences.readExtras();
         view.escreveExtras(sendExtras);

    }


}
