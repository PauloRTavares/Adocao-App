package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.model.PetConsuming;

public class MVPMainModule {
    private MainContrato.View view;

    MVPMainModule(MainContrato.View view){
        this.view = view;
    }

    public MainContrato.View provideView() {
        return view;
    }

    MainContrato.Presenter providePresenter(MainContrato.View view, PetConsuming model){
        return new MainPresenter(view, model);
    }
}
