package com.example.adocaoapp.ui.details;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;

public interface DetailsContrato {


    interface View{
       void showToast(String msg);
       void escreveExtras(ArrayList<String> arrayList);

       public Context setContext();

    }

    interface Presenter {


        void clickFavorito();
        void clickAdotar();
        void readDetails();
    }



}
