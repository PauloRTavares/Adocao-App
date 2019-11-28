package com.example.adocaoapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.example.adocaoapp.R;
import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.model.Pet;
import com.example.adocaoapp.model.RepoPreferences;
import com.example.adocaoapp.ui.details.DetailsActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    ArrayList<Pet> pets = new ArrayList<>();
    ArrayList<String> petsExtras = new ArrayList<>();
    RepoPreferences repoPreferences;
    Context context;

    MainContrato.Presenter presenter;

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = setContext();
        presenter = new MainPresenter(this);
        presenter.limpaPref();
        presenter.callPets();

    }



    @Override
    public void showPets(final ArrayList<Pet> pets) {
        //ADAPTER DA RECYCLER VIEW

        PetListAdapter adapter = new PetListAdapter(pets, new PetListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pet pet) {

                petsExtras.add(String.valueOf(pet.getId()));
                petsExtras.add(pet.getNome());
                petsExtras.add(pet.getCidade());
                petsExtras.add(pet.getAvatar());
                petsExtras.add(pet.getIdade());
                petsExtras.add(pet.getPeso());
                petsExtras.add(pet.getPorte());
                petsExtras.add(pet.getRaca());
                petsExtras.add(pet.getCor());
                petsExtras.add(pet.getSexo());
                petsExtras.add(pet.getDescricao());

                presenter.writeExtras(petsExtras, context);

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
