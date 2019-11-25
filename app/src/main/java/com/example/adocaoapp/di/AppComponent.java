package com.example.adocaoapp.di;

import com.example.adocaoapp.ui.main.MainActivity;
import com.example.adocaoapp.ui.main.MainModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, MainModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
