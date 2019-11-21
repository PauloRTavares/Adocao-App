package com.example.adocaoapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.model.Dog;
import java.util.List;

public class DogListAdapter extends RecyclerView.Adapter<DogListAdapter.DogViewHolder> {

    List<Dog> dogs;

    public DogListAdapter(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tela_principal, parent, false);
        return new DogViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {

        Dog dog = dogs.get(position);

        holder.nome.setText(dog.getNome());

    }

    @Override
    public int getItemCount() {
        return dogs.size();
    }

    public class DogViewHolder extends RecyclerView.ViewHolder {

        TextView nome;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNome);
        }
    }

}
