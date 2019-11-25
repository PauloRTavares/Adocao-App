package com.example.adocaoapp.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = PetModule.class)
public interface AppComponent {
    @Component.Factory
    interface Factory {
        public AppComponent create(@BindsInstance Context context);
    }

    PetComponent.Factory petComponent();
}
