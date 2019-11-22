package com.example.adocaoapp.model;

import android.content.Context;

import android.graphics.BitmapFactory;
import com.example.adocaoapp.R;



import java.util.ArrayList;

public class RepositorioPets {
    private ArrayList<Pet> pets = new ArrayList<>();
    Context context;

    public ArrayList<Pet> getPets() {

       pets.add(
                new Pet("Doguinho1", BitmapFactory.decodeResource(
                        context.getResources(), R.drawable.dog)));

        pets.add(
                new Pet("Mergulhao", BitmapFactory.decodeResource(
                       context.getResources(), R.drawable.mergulhao_resize)));

//        pets.add(
//                new Pet("Doguinho2", BitmapFactory.decodeResource(
//                        presenter.getContext().getResources(), R.drawable.dog)));
//
//        pets.add(
//                new Pet("Doguinho3", BitmapFactory.decodeResource(
//                        presenter.getContext().getResources(), R.drawable.dog)));
//
//        pets.add(
//                new Pet("Doguinho4", BitmapFactory.decodeResource(presenter
//                        .getContext().getResources(), R.drawable.dog)));
//
//        pets.add(
//                new Pet("Doguinho5", BitmapFactory.decodeResource(
//                        presenter.getContext().getResources(), R.drawable.dog)));
//
//        pets.add(
//                new Pet("Doguinho6", BitmapFactory.decodeResource(
//                        presenter.getContext().getResources(), R.drawable.dog)));

        return pets;
    }


}
