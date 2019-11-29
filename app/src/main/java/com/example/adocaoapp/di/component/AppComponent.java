package com.example.adocaoapp.di.component;

import android.app.Application;
import android.content.Context;

import com.example.adocaoapp.InitApp;
import com.example.adocaoapp.di.module.AppModule;
import com.example.adocaoapp.di.module.ContextModule;
import com.example.adocaoapp.di.module.PetConsumingModule;
import com.example.adocaoapp.model.PetConsuming;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ContextModule.class, PetConsumingModule.class})
public interface AppComponent {
    void inject(InitApp initApp);
    //Context getContext();
    Application getApplication();
    PetConsuming getPetsInteractor();
}
