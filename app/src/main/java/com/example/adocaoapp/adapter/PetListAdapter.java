package com.example.adocaoapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.model.Pet;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


public class PetListAdapter extends RecyclerView.Adapter<PetListAdapter.PetViewHolder> {

    ArrayList<Pet> pets;
    private final OnItemClickListener onItemClickListener;
    private Context context;


    public PetListAdapter(ArrayList<Pet> pets, OnItemClickListener onItemClickListener, Context context) {
        this.pets = pets;
        this.onItemClickListener = onItemClickListener;
        this.context = context;
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
        final Pet pet = pets.get(position);
        holder.bind(pet, onItemClickListener);
        holder.nome.setText(pet.getNome());
        Picasso.get().load(pet.getAvatar()).placeholder(R.drawable.loading)
                .error(R.drawable.loading)
                .into(holder.imgPet, new Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError(Exception e) {

                    }
                });


        holder.adopt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Adopt "+pet.getNome(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Add "+pet.getNome()+" to favorites", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public class PetViewHolder extends RecyclerView.ViewHolder {
        TextView nome;
        ImageView imgPet;
        Button adopt;
        ImageButton favorite;

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.txtNome);
            imgPet = itemView.findViewById(R.id.imgPet);
            adopt = itemView.findViewById(R.id.btnAdotar);
            favorite = (ImageButton)itemView.findViewById(R.id.btnFavorito);
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
