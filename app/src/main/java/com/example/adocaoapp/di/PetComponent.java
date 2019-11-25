package com.example.adocaoapp.di;

import com.example.adocaoapp.model.Pet;

import dagger.Component;

@Component
public interface PetComponent {
    Pet getPet();
}
