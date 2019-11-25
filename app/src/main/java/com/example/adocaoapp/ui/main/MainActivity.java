package com.example.adocaoapp.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;

import java.util.ArrayList;

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
        //INSTÂNCIA DO ADAPTER
        PetListAdapter adapter = new PetListAdapter(pets, new PetListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pet pet) {

                Toast.makeText(MainActivity.this, "Clicou no: "+pet.getNome().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
