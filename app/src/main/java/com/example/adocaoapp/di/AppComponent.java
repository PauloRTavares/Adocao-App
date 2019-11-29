package com.example.adocaoapp.di;

import android.app.Application;

import com.example.adocaoapp.model.PetConsuming;
import com.example.adocaoapp.model.PetConsumingModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, PetConsumingModule.class})
public interface AppComponent {
    Application app();
    PetConsuming petConsuming();
}
