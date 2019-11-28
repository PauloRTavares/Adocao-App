package com.example.adocaoapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.ThePet;
import com.example.adocaoapp.ui.details.DetailsActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    ArrayList<Pet> pets = new ArrayList<>();


    MainContrato.Presenter presenter;
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
        Log.d(TAG, "Log feito pelo Mergulhão no PC do Paulo");
        presenter.callPets(this);

    }



    @Override
    public void showPets(ArrayList<Pet> pets) {
        //ADAPTER DA RECYCLER VIEW

        PetListAdapter adapter = new PetListAdapter(pets, new PetListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pet pet) {

                ThePet.thePet = pet;

                startActivity(new Intent(MainActivity.this, DetailsActivity.class));

            }
        }, this);

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }



}
