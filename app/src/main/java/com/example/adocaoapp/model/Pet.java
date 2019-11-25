package com.example.adocaoapp.model;

import android.graphics.Bitmap;

public class Pet {
    private int id;
    private String nome;
    private String cidade;
    private String avatar;
    private String idade;
    private String peso;
    private String porte;
    private String raca;
    private String cor;
    private String sexo;
    private String descricao;
    private Boolean favorito;
    private Boolean adotado;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public String getPorte() {
        return porte;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getFavorito(){
        return favorito;
    }

    public Boolean getAdotado(){
        return adotado;
    }
}
