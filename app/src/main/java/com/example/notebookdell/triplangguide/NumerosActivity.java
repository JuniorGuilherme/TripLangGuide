package com.example.notebookdell.triplangguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {
    ListView lvTraducoes;
    TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        lvTraducoes = findViewById(R.id.lvTraducoes);
        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        ArrayList<Traducoes> numeros = (ArrayList<Traducoes>) getIntent().getSerializableExtra("numeros");

        lvTraducoes.setAdapter(new AdapterTraducao(numeros, getApplicationContext()));
        tvTitulo.setText("Numeros");
    }
}
