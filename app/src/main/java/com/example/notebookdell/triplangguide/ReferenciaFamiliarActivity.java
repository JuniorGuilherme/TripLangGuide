package com.example.notebookdell.triplangguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ReferenciaFamiliarActivity extends AppCompatActivity {
    ListView lvTraducoes;
    TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencia_familiar);

        lvTraducoes = findViewById(R.id.lvTraducoes);
        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        ArrayList<Traducoes> referencia_familiar = (ArrayList<Traducoes>) getIntent().getSerializableExtra("referencia_familiar");

        lvTraducoes.setAdapter(new AdapterTraducao(referencia_familiar, getApplicationContext()));
        tvTitulo.setText("Referencia Familiar");
    }
}
