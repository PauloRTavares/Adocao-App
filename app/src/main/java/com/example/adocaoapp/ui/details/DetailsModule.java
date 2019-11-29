package com.example.adocaoapp.ui.details;

import com.example.adocaoapp.utils.ActivityScope;

import javax.inject.Singleton;

import dagger.Module;

@Module
public class DetailsModule {
    private DetailsContrato.View detailsView;

    public DetailsModule(DetailsContrato.View detailsView){
        this.detailsView = detailsView;
    }

    @ActivityScope
    @Singleton
    public DetailsContrato.View getDetailsView(){
        return detailsView;
    }

}
