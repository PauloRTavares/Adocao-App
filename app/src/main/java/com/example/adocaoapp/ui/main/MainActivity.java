package com.example.adocaoapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.ThePets;
import com.example.adocaoapp.ui.details.DetailsActivity;

import java.util.ArrayList;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    ArrayList<Pet> pets = new ArrayList<>();
    Context context;

    @Inject
    MainContrato.Presenter presenter;

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = setContext();
        //presenter = new MainPresenter(this);
        presenter.callPets();

    }

    @Override
    public void showPets(final ArrayList<Pet> pets) {
        //ADAPTER DA RECYCLER VIEW

        PetListAdapter adapter = new PetListAdapter(pets, new PetListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pet pet) {

                ThePets.thePet = pet;

                iniciarDetails();

            }
        }, this);

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }

    @Override
    public void iniciarDetails() {
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public Context setContext() {
        return  this.getApplicationContext();
    }
}
