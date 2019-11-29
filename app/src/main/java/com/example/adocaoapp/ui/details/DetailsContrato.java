package com.example.adocaoapp.ui.details;

import android.content.Context;

public interface DetailsContrato {

    interface View{
       void showToast(String msg);
       Context setContext();
    }

    interface Presenter {
        void clickFavorito();
        void clickAdotar();
    }
}
