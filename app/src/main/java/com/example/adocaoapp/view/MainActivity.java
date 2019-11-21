package com.example.adocaoapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.DogListAdapter;
import com.example.adocaoapp.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    List<Dog> listaTeste = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaTeste.add(new Dog("Doguinho1"));
        listaTeste.add(new Dog("Doguinho2"));
        listaTeste.add(new Dog("Doguinho3"));
        listaTeste.add(new Dog("Doguinho4"));
        listaTeste.add(new Dog("Doguinho5"));
        listaTeste.add(new Dog("Doguinho6"));
        listaTeste.add(new Dog("Doguinho7"));

        //ADAPTER DA RECYCLER VIEW
        DogListAdapter adapter = new DogListAdapter(listaTeste);

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }
}
