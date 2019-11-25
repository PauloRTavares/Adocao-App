package com.example.adocaoapp.data.repository;

import com.example.adocaoapp.data.model.Pet;

import java.util.ArrayList;

public interface MainRepository {
    //Puxar apenas os valores de um Pet
    Pet getPet();

    //Puxar toda a lista de cadastrados
    ArrayList<Pet> getPets();

    //Salvar (se tiver) os valores do Pet
    void savePet(Pet pet);
}
