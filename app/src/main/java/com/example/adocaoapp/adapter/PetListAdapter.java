package com.example.adocaoapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.data.model.Pet;

import java.util.List;

public class PetListAdapter extends RecyclerView.Adapter<PetListAdapter.PetViewHolder> {

    List<Pet> pets;
    private final OnItemClickListener onItemClickListener;


    public PetListAdapter(List<Pet> pets, OnItemClickListener onItemClickListener) {
        this.pets = pets;
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{

        void onItemClick(Pet pet);

    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tela_principal, parent, false);
        return new PetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {

        Pet pet = pets.get(position);

        holder.bind(pet, onItemClickListener);

        holder.nome.setText(pet.getNome());

    //  holder.imgPet.setImageBitmap(pet.getPhoto());

    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public class PetViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        ImageView imgPet;

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNome);
            imgPet = itemView.findViewById(R.id.imgPet);
        }

        public void bind(final Pet pet, final OnItemClickListener onItemClickListener){

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    onItemClickListener.onItemClick(pet);

                }
            });

        }
    }

}
