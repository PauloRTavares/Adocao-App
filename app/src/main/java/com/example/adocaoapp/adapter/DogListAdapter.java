package com.example.adocaoapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.model.Pet;

import java.util.List;

public class DogListAdapter extends RecyclerView.Adapter<DogListAdapter.DogViewHolder> {

    List<Pet> pets;

    public DogListAdapter(List<Pet> pets) {
        this.pets = pets;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tela_principal, parent, false);
        return new DogViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {

<<<<<<< HEAD
        Dog dog = dogs.get(position);
        holder.nome.setText(dog.getNome());
=======
        Pet pet = pets.get(position);

        holder.nome.setText(pet.getNome());
        holder.imgPet.setImageBitmap(pet.getPhoto());
>>>>>>> abd5800673ba5fd7e1fe66bfa11d12ba4cfc3776

    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public class DogViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        ImageView imgPet;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNome);
            imgPet = itemView.findViewById(R.id.imgPet);
        }
    }

}
