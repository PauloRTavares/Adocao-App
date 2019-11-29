package com.example.adocaoapp.di.module;

import android.content.Context;

import dagger.Module;

@Module public class ContextModule {
    private Context context;

    ContextModule(Context context){
        this.context = context;
    }

    public Context provideContext() {
        return context;
    }
}
