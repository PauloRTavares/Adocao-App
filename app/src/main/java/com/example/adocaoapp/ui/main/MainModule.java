package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.util.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module public class MainModule {

    private MainContrato.View mainView;

    @ActivityScope
    public MainModule(MainContrato.View mainView){
        this.mainView = mainView;
    }

    @ActivityScope
    @Provides
    public MainContrato.View getMainView() {
        return mainView;
    }

    //Criar GetInteractor
}
