package com.example.adocaoapp.di.module;

import com.example.adocaoapp.model.PetConsuming;

import dagger.Module;

@Module public class PetConsumingModule {
    PetConsuming providesPetConsuming(){
        return new PetConsuming();
    }
}
