package com.example.notebookdell.triplangguide;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnAlimentos, btnNumeros, btnExpressoesComuns, btnReferenciaFamiliar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlimentos = findViewById(R.id.btnAlimentos);
        btnExpressoesComuns = findViewById(R.id.btnExpressoesComuns);
        btnNumeros = findViewById(R.id.btnNumeros);
        btnReferenciaFamiliar = findViewById(R.id.btnReferenciaFamiliar);

        btnAlimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Traducoes t = new Traducoes();
                if(t.retornaAlimentos().isEmpty()){
                    t.carregarAlimentos();
                }

                Intent i = new Intent(MainActivity.this, AlimentosActivity.class);
                i.putExtra("alimentos", t.retornaAlimentos());
                startActivity(i);
            }
        });
        btnExpressoesComuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Traducoes t = new Traducoes();
                if(t.retornaExpressoesComuns().isEmpty()){
                    t.carregarExpressoesComuns();
                }

                Intent i = new Intent(MainActivity.this, ExpressoesComunsActivity.class);
                i.putExtra("expressoes_comuns", t.retornaExpressoesComuns());
                startActivity(i);
            }
        });
        btnNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Traducoes t = new Traducoes();
                if(t.retornaNumeros().isEmpty()){
                    t.carregarNumeros();
                }

                Intent i = new Intent(MainActivity.this, NumerosActivity.class);
                i.putExtra("numeros", t.retornaNumeros());
                startActivity(i);
            }
        });
        btnReferenciaFamiliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Traducoes t = new Traducoes();
                if(t.retornaReferenciaFamiliar().isEmpty()){
                    t.carregarReferenciaFamiliar();
                }

                Intent i = new Intent(MainActivity.this, ReferenciaFamiliarActivity.class);
                i.putExtra("referencia_familiar", t.retornaReferenciaFamiliar());
                startActivity(i);
            }
        });
    }
}
