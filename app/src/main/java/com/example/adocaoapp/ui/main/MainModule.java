package com.example.adocaoapp.ui.main;

import com.example.adocaoapp.data.model.MainModel;
import com.example.adocaoapp.data.model.Pet;
import com.example.adocaoapp.data.repository.MainRepository;
import com.example.adocaoapp.data.repository.PetRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    public MainContrato.Presenter provideMainActivityPresenter(MainContrato.Model model){
        return new MainPresenter(model);
    }

    @Provides
    public MainContrato.Model provideMainActivityModel(MainRepository repository){
        return new MainModel(repository);
    }

    @Provides
    public MainRepository provideMainRepository(){
        return new PetRepository();
    }
}

