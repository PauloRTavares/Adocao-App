package com.example.adocaoapp.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.adocaoapp.R;

import com.example.adocaoapp.adapter.PetListAdapter;
import com.example.adocaoapp.data.model.Pet;
import com.example.adocaoapp.di.App;
import java.util.ArrayList;
import javax.inject.Inject;

class ListaActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    List<Pet> listaTeste = new ArrayList<>();

    @Inject
    MainContrato.Presenter presenter;
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
        //Dagger Aqui
        ((App) getApplication()).getComponent().inject(this);

        Log.d(TAG, "Log feito pelo Mergulhão no PC do Paulo");
        //presenter.callPets();

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


    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
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
