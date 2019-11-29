package com.example.adocaoapp.di.component;

import com.example.adocaoapp.ui.main.MVPMainModule;
import com.example.adocaoapp.ui.main.MainActivity;
import com.example.adocaoapp.ui.main.MainContrato;
import com.example.adocaoapp.util.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MVPMainModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
    MainContrato.Presenter getMainPresenter();
}
