package com.example.notebookdell.triplangguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExpressoesComunsActivity extends AppCompatActivity {
    ListView lvTraducoes;
    TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expressoes_comuns);

        lvTraducoes = findViewById(R.id.lvTraducoes);
        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        ArrayList<Traducoes> alimentos = (ArrayList<Traducoes>) getIntent().getSerializableExtra("expressoes_comuns");

        lvTraducoes.setAdapter(new AdapterTraducao(alimentos, getApplicationContext()));
        tvTitulo.setText("Expressões Comuns");
    }
}
