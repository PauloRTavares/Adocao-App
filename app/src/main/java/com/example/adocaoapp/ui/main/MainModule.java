package com.example.adocaoapp.ui.main;

public class MainModule {

    MainContrato.View mainView;

    MainModule(MainContrato.View mainView){
        this.mainView = mainView;
    }

    public MainContrato.View getMainView() {
        return mainView;
    }

    //Criar GetInteractor
}
