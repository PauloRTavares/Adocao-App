package com.example.adocaoapp.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PetConsumingModule {
    public PetConsumingModule(){}

    @Singleton
    @Provides
    PetConsuming getPetConsuming(){
        return new PetConsuming();
    }
}
