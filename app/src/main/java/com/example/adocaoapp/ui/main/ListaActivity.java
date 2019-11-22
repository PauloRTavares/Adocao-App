package com.example.adocaoapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.util.Log;

import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;
import java.util.List;

class ListaActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    List<Pet> listaTeste = new ArrayList<>();
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        Log.d("TesteMergulhao", "Log feito pelo Mergulhão no PC do Paulo");
        // presenter.callPets();

    }


    @Override
    public void showPets(ArrayList<Pet> pets) {
        //ADAPTER DA RECYCLER VIEW
        listaTeste = pets;
        PetListAdapter adapter = new PetListAdapter(pets);

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }


}
