package com.example.adocaoapp;

import android.app.Application;
import android.content.Context;

import com.example.adocaoapp.di.component.AppComponent;

public class InitApp extends Application {

    AppComponent component;

    InitApp get(Context context){
        return (InitApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    AppComponent getComponent(){
        return component;
    }
}
