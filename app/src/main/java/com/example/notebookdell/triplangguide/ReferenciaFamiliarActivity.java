package com.example.notebookdell.triplangguide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        final ArrayList<Traducoes> referencia_familiar = (ArrayList<Traducoes>) getIntent().getSerializableExtra("referencia_familiar");

        lvTraducoes.setAdapter(new AdapterTraducao(referencia_familiar, getApplicationContext()));
        tvTitulo.setText("Referencia Familiar");

        lvTraducoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context contexto = getApplicationContext();
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(contexto, referencia_familiar.get(i).getAplicacao().toString() ,duracao);
                toast.show();
            }
        });
    }
}
