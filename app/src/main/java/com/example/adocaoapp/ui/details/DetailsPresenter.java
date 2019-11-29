package com.example.adocaoapp.ui.details;

import java.util.ArrayList;

public class DetailsPresenter implements DetailsContrato.Presenter {
    private DetailsContrato.View view;
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


}
