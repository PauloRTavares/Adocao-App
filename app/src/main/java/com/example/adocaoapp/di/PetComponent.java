package com.example.adocaoapp.di;

import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.ui.main.MainActivity;

import dagger.Component;

@Component
public interface PetComponent {
    Pet getPet();
    void inject(MainActivity mainActivity);
}
