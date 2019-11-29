package com.example.adocaoapp.di.module;

import com.example.adocaoapp.model.PetConsuming;
import com.example.adocaoapp.ui.main.MainContrato;
import com.example.adocaoapp.ui.main.MainPresenter;

import dagger.Module;

@Module
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
