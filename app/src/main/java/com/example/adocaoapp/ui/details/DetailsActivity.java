package com.example.adocaoapp.ui.details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.model.ThePet;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    TextView nome, cidade, descricao;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        nome = findViewById(R.id.txtNome);
        cidade = findViewById(R.id.txtLocal);
        descricao = findViewById(R.id.txtDescricao);

        foto = findViewById(R.id.imgDescricao);

        nome.setText(ThePet.thePet.getNome());
        cidade.setText(ThePet.thePet.getCidade());
        descricao.setText(ThePet.thePet.getDescricao());

        Picasso.get().load(ThePet.thePet.getAvatar()).into(foto);
    }
}
