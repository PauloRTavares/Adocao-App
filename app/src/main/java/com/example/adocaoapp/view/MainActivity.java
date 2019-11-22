package com.example.adocaoapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;

import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    List<Pet> listaTeste = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnTestList();

        //ADAPTER DA RECYCLER VIEW
        PetListAdapter adapter = new PetListAdapter(listaTeste);

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        Log.d("TesteMergulhao", "Log feito pelo Mergulhão no pc do Paulo");

    }

    private void addOnTestList(){

        listaTeste.add(
                new Pet("Doguinho1", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

        listaTeste.add(
                new Pet("Mergulhao", BitmapFactory.decodeResource(getResources(), R.drawable.mergulhao_resize)));

        listaTeste.add(
                new Pet("Doguinho2", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

        listaTeste.add(
                new Pet("Doguinho3", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

        listaTeste.add(
                new Pet("Doguinho4", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

        listaTeste.add(
                new Pet("Doguinho5", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

        listaTeste.add(
                new Pet("Doguinho6", BitmapFactory.decodeResource(getResources(), R.drawable.dog)));

    }
}
