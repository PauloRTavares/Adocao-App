package com.example.adocaoapp.di;

import android.app.Application;

import com.example.adocaoapp.ui.main.MainModule;

public class App extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .mainModule(new MainModule())
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}