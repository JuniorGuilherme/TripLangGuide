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
                i.putParcelableArrayListExtra("alimentos", (ArrayList<? extends Parcelable>) t.retornaAlimentos());
                startActivity(i);
            }
        });
    }
}
