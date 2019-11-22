package com.example.adocaoapp.model;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.example.adocaoapp.R;
import com.example.adocaoapp.ui.main.MainContrato;


import java.util.ArrayList;

public class RepositorioPets {
    private ArrayList<Pet> pets = new ArrayList<>();
    private MainContrato.Presenter presenter;


    public ArrayList<Pet> getPets() {

        pets.add(
                new Pet("Doguinho1", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

        pets.add(
                new Pet("Mergulhao", BitmapFactory.decodeResource(context.getResources(), R.drawable.mergulhao_resize)));

        pets.add(
                new Pet("Doguinho2", BitmapFactory.decodeResource(context.getResources(), R.drawable.dog)));

        pets.add(
                new Pet("Doguinho3", BitmapFactory.decodeResource(context.getResources(), R.drawable.dog)));

        pets.add(
                new Pet("Doguinho4", BitmapFactory.decodeResource(context.getResources(), R.drawable.dog)));

        pets.add(
                new Pet("Doguinho5", BitmapFactory.decodeResource(context.getResources(), R.drawable.dog)));

        pets.add(
                new Pet("Doguinho6", BitmapFactory.decodeResource(context.getResources(), R.drawable.dog)));

        return pets;
    }


}
