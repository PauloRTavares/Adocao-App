package com.example.adocaoapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
        Log.d("TesteMergulhao", "Log feito pelo Mergulhão no PC do Paulo");
        presenter.callPets();

    }



    @Override
    public void showPets(ArrayList<Pet> pets) {
        PetListAdapter adapter = new PetListAdapter(pets);
        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
