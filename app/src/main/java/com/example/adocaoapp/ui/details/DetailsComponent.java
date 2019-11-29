package com.example.adocaoapp.ui.details;

import com.example.adocaoapp.di.AppComponent;
import com.example.adocaoapp.util.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = DetailsModule.class)
public interface DetailsComponent {
    void inject(DetailsActivity activity);
}
