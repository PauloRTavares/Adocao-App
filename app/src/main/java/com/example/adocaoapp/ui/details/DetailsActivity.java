package com.example.adocaoapp.ui.details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.adocaoapp.R;
import com.example.adocaoapp.model.ThePets;


public class DetailsActivity extends AppCompatActivity implements DetailsContrato.View {

    private DetailsContrato.Presenter presenter;
    private ImageButton btnFavoritoDetails;
    private Button btnAdotarDetails;
    private TextView nome, cidade, idade, peso, porte, raca, cor, sexo,  descricao;
    private ImageView avatar;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        context = setContext();
        presenter = new DetailsPresenter(this);

        btnFavoritoDetails = findViewById(R.id.btnFavorito);
        btnAdotarDetails = findViewById(R.id.btnAdotar);
        nome = findViewById(R.id.txtNome);
        cidade = findViewById(R.id.txtLocal);
        avatar = findViewById(R.id.imgDescricao);
        idade = findViewById(R.id.txtIdade);
        cor = findViewById(R.id.txtCor);
        peso = findViewById(R.id.txtPeso);
        porte = findViewById(R.id.txtPorte);
        raca = findViewById(R.id.txtRaca);
        sexo = findViewById(R.id.txtSexo);
        descricao = findViewById(R.id.txtDescricao);


        nome.setText(ThePets.thePet.getNome());
        cidade.setText(ThePets.thePet.getCidade());
        //avatar.(ThePet.thePet.getNome());
        idade.setText(ThePets.thePet.getIdade());
        Glide.with(this).load(ThePets.thePet.getAvatar())
                .into(avatar);
        cor.setText(ThePets.thePet.getCor());
        peso.setText(ThePets.thePet.getPeso());
        porte.setText(ThePets.thePet.getPorte());
        raca.setText(ThePets.thePet.getRaca());
        sexo.setText(ThePets.thePet.getSexo());
        descricao.setText(ThePets.thePet.getDescricao());


    }

    @Override
    public void showToast(String msg) {

    }


    @Override
    public Context setContext() {
        return this.getApplicationContext();
    }

}
