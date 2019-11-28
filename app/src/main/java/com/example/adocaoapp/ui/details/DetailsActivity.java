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
import com.example.adocaoapp.ui.main.MainPresenter;

import java.util.ArrayList;


public class DetailsActivity extends AppCompatActivity implements DetailsContrato.View {

    private DetailsContrato.Presenter presenter;
    private ImageButton btnFavorito;
    private Button btnAdotar;
    private TextView nome, cidade, idade, peso, porte, raca, cor, sexo,  descricao;
    private ImageView avatar;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        context = setContext();
        presenter = new DetailsPresenter(this);

        btnFavorito = findViewById(R.id.btnFavorito);
        btnAdotar = findViewById(R.id.btnAdotar);
        nome = findViewById(R.id.txtNome);
        cidade = findViewById(R.id.txtLocal);
        avatar = findViewById(R.id.imgDescricao);
        idade = findViewById(R.id.txtNome);
        cor = findViewById(R.id.txtCor);
        peso = findViewById(R.id.txtPeso);
        porte = findViewById(R.id.txtPorte);
        raca = findViewById(R.id.txtRaca);
        sexo = findViewById(R.id.txtSexo);
        descricao = findViewById(R.id.txtDescricao);

        presenter.readDetails();


    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void escreveExtras(ArrayList<String> arrayList) {

        nome.setText(arrayList.get(1));
        cidade.setText(arrayList.get(2));
        Glide.with(DetailsActivity.this).load(arrayList.get(3))
                .into(avatar);
        idade.setText(arrayList.get(4));
        peso.setText(arrayList.get(5));
        porte.setText(arrayList.get(6));
        raca.setText(arrayList.get(7));
        cor.setText(arrayList.get(8));
        sexo.setText(arrayList.get(9));
        descricao.setText(arrayList.get(10));

      }

    @Override
    public Context setContext() {
        return this.getApplicationContext();
    }


}
