package com.example.notebookdell.triplangguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Notebook Dell on 16/04/2018.
 */

public class AdapterTraducao extends ArrayAdapter<Traducoes>{
    public AdapterTraducao(ArrayList<Traducoes> traducoes, Context context) {
        super(context, 0, traducoes);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView = LayoutInflater.from(getContext()).inflate(R.layout.item_traducao, viewGroup, false);
        TextView tvFrasePortugues = resultView.findViewById(R.id.tvFrasePortugues);
        TextView tvFraseIngles = resultView.findViewById(R.id.tvFraseIngles);
        Traducoes t = getItem(i);

       tvFraseIngles.setText(t.getEnglish().toString());
       tvFrasePortugues.setText(t.getPt_br().toString());

        if(i % 2 ==0){
            resultView.setBackgroundColor(252235205);
        }


        return resultView;
    }
}
