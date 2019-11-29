package com.example.adocaoapp.di.module;

import com.example.adocaoapp.InitApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module public class AppModule {
    private InitApp initApp;

    AppModule(InitApp initApp){
        this.initApp = initApp;
    }

    @Provides
    @Singleton
    public InitApp provideInitApp() {
        return initApp;
    }
}
