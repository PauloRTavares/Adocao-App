package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.di.AppComponent;
import com.example.adocaoapp.util.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
