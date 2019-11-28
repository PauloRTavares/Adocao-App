package com.example.adocaoapp.ui.details;

import android.content.Context;

import java.util.ArrayList;

public interface DetailsContrato {


    interface View{
       void showToast(String msg);

       public Context setContext();

    }

    interface Presenter {


        void clickFavorito();
        void clickAdotar();
    }



}
