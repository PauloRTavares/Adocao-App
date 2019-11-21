package com.example.adocaoapp.model;

import android.graphics.Bitmap;

public class Pet {

    private String nome;
    private Bitmap photo;

    public Pet(String nome, Bitmap photo) {
        this.nome = nome;
        this.photo = photo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bitmap getPhoto() {
        return photo;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }
}
