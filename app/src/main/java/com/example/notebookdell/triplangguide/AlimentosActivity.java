package com.example.notebookdell.triplangguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlimentosActivity extends AppCompatActivity {
    ListView lvTraducoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos);

        lvTraducoes = findViewById(R.id.lvTraducoes);
        ArrayList<Traducoes> alimentos = getIntent().getParcelableArrayListExtra("alimentos");

        lvTraducoes.setAdapter(new AdapterTraducao(alimentos, getApplicationContext()));
    }
}
