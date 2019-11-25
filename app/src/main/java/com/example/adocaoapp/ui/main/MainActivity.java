package com.example.adocaoapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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

        //Instancia do Presenter
        presenter = new MainPresenter(this);

        //Chamr método que chama o Retrofit
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
        }, this);

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
