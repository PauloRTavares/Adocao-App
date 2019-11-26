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
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContrato.View{

    RecyclerView rv;
    List<Pet> pets = new ArrayList<>();

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
        this.pets = pets;
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
        this.pets = pets;
        //INSTÂNCIA DO ADAPTER
        PetListAdapter adapter = new PetListAdapter(pets, new PetListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pet pet) {
                Toast.makeText(
                        ListActivity.this,
                        R.string.selected + " " + pet.getNome(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        //CONFIGURAÇÃO DA RECYCLER VIEW
        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
