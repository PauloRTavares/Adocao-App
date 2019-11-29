package com.example.adocaoapp.ui.details;

import com.example.adocaoapp.util.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module public class DetailsModule {

    private DetailsContrato.View detailsView;

    @ActivityScope
    public DetailsModule(DetailsContrato.View detailsView){
        this.detailsView = detailsView;
    }

    @ActivityScope
    @Provides
    public DetailsContrato.View getDetailsView() {
        return detailsView;
    }
}