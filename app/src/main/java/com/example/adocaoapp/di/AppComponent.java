package com.example.adocaoapp.di;

import android.app.Application;

import com.example.adocaoapp.model.PetConsuming;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface AppComponent {
    Application app();
    PetConsuming petConsuming();
}
