package com.example.adocaoapp.data.model;

import com.example.adocaoapp.data.repository.MainRepository;
import com.example.adocaoapp.ui.main.MainContrato;

public class MainModel implements MainContrato.Model {

    private MainRepository repository;

    public MainModel(MainRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createPet(
            String nome, String cidade, String avatar,
            String idade, String peso,String porte,
            String raca, String cor, String sexo, String descricao) {
        repository.savePet(new Pet(nome, cidade, avatar, idade, peso,
                porte, raca, cor, sexo, descricao));


    @Override
    public Pet getPet() {
        return repository.getPet();
    }
}
