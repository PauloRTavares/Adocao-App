package com.example.adocaoapp.data.repository;

import com.example.adocaoapp.data.model.Pet;

public interface MainRepository {
    Pet getPet();
    void savePet(Pet pet);
}
