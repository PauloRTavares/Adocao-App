package com.example.adocaoapp.model;

import android.util.Log;

import javax.inject.Inject;

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

    //Criando um construtor com as características de meu Pet.
    //Colocar uma injeção do Dagger
    @Inject
    public Pet(String nome, String cidade,String avatar,
               String idade, String peso, String porte,
               String raca, String cor, String sexo, String descricao){
        this.nome = nome;
        this.cidade = cidade;
        this.avatar = avatar;
        this.idade = idade;
        this.peso = peso;
        this.porte = porte;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.descricao = descricao;
    }

    //Teste do Latido
    private static final String TAG = "Pet";
    public void talk(){
        Log.d(TAG, "Au au");
    }

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


    public void setId(int i) {
        this.id = i;
    }
}