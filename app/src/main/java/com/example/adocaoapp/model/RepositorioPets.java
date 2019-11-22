package com.example.adocaoapp.model;




import java.util.ArrayList;

public class RepositorioPets {
    private ArrayList<Pet> pets = new ArrayList<>();


    public ArrayList<Pet> getPets() {

        // Adicionar a chamada retrofit aqui

        pets.add(
                new Pet("Doguinho1"));

        pets.add(
                new Pet("Mergulhao"));

        pets.add(
                new Pet("Doguinho2"));


        return pets;
    }


}
