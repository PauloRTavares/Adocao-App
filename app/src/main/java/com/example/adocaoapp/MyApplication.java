package com.example.adocaoapp;

import android.app.Application;
import android.content.Context;

import com.example.adocaoapp.di.AppComponent;
import com.example.adocaoapp.di.AppModule;

public class MyApplication extends Application {
    private AppComponent appComponent;
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initComponents();
    }

    private void initComponents() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule((Application) instance))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();
    }
}
