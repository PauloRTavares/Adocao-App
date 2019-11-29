package com.example.adocaoapp.di;

import android.app.Application;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Application application;

    AppModule(Application application){
        this.application = application;
    }

    @Singleton
    @Provides
    public Application getApplication() {
        return application;
    }

    @Singleton
    @Provides
    public Resources getResources(){
        return application.getResources();
    }
}
