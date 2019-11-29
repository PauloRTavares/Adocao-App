package com.example.adocaoapp;

import android.app.Application;

import com.example.adocaoapp.di.AppComponent;

public class MyApp extends Application {
    private AppComponent appComponent;
    private static MyApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        configureDagger();
    }

    private void configureDagger() {
        //A Implementar
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
