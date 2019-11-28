package com.example.adocaoapp.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.adocaoapp.ui.details.DetailsContrato;
import java.util.ArrayList;
import java.util.List;


public class RepoPreferences implements DetailsContrato {
    private SharedPreferences sharedPreferences;
    private ArrayList<String> dadosPref = new ArrayList<>();
    private Context context;

    // Cria um contrutor


    public RepoPreferences(Context context) {
        this.context = context;
        // iniciando o objeto SP
        // 1 parametro = Nome do Arquivo
        // 2 parametro = Mode
        sharedPreferences = context.getSharedPreferences("details_pet", Context.MODE_PRIVATE);
    }

    public void writeExtras(ArrayList<String> strings){
        dadosPref = strings;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("id", dadosPref.get(0));
        editor.putString("nome", dadosPref.get(1));
        editor.putString("cidade", dadosPref.get(2));
        editor.putString("avatar",dadosPref.get(3));
        editor.putString("idade", dadosPref.get(4));
        editor.putString("peso", dadosPref.get(5));
        editor.putString("porte", dadosPref.get(6));
        editor.putString("raca", dadosPref.get(7));
        editor.putString("cor",dadosPref.get(8));
        editor.putString("sexo", dadosPref.get(9));
        editor.putString("descricao",dadosPref.get(10));

        editor.commit();
    }

    public ArrayList<String> readExtras(){
        dadosPref.add(sharedPreferences.getString("id", ""));
        dadosPref.add(sharedPreferences.getString("nome", ""));
        dadosPref.add(sharedPreferences.getString("cidade", ""));
        dadosPref.add(sharedPreferences.getString("avatar", ""));
        dadosPref.add(sharedPreferences.getString("idade", ""));
        dadosPref.add(sharedPreferences.getString("peso", ""));
        dadosPref.add(sharedPreferences.getString("porte", ""));
        dadosPref.add(sharedPreferences.getString("raca", ""));
        dadosPref.add(sharedPreferences.getString("cor", ""));
        dadosPref.add(sharedPreferences.getString("sexo", ""));
        dadosPref.add(sharedPreferences.getString("descricao", ""));

        return dadosPref;
    }

    public void cleanPref(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }
}

