package com.example.notebookdell.triplangguide;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Notebook Dell on 16/04/2018.
 */

public class Traducoes implements Parcelable{
    String pt_br;
    String english;
    static ArrayList<Traducoes> alimentos = new ArrayList<>();
    static ArrayList<Traducoes> numeros;
    static ArrayList<Traducoes> referencia_familiar;
    static ArrayList<Traducoes> expressoes_comuns;

    protected Traducoes(Parcel in) {
        pt_br = in.readString();
        english = in.readString();
    }

    public Traducoes() {

    }

    public void carregarAlimentos(){
        alimentos.add(addTraducao("Maça", "Apple"));
        alimentos.add(addTraducao("Maracuja", "Passion Fruit"));
        alimentos.add(addTraducao("Frango", "Chicken"));
        alimentos.add(addTraducao("Alcatra", "Rump"));
        alimentos.add(addTraducao("Feijão", "Bean"));

    }

    public ArrayList<Traducoes> retornaAlimentos(){
        return alimentos;
    }

    public Traducoes addTraducao(String pt_br, String english){
        Traducoes t = new Traducoes();
        t.setPt_br(pt_br);
        t.setEnglish(english);
        return t;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPt_br() {
        return pt_br;
    }

    public void setPt_br(String pt_br) {
        this.pt_br = pt_br;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(alimentos);
        parcel.writeList(numeros);
        parcel.writeList(referencia_familiar);
        parcel.writeList(expressoes_comuns);
    }

    public static final Creator<Traducoes> CREATOR = new Creator<Traducoes>() {
        @Override
        public Traducoes createFromParcel(Parcel in) {
            return new Traducoes(in);
        }

        @Override
        public Traducoes[] newArray(int size) {
            return new Traducoes[size];
        }
    };
}
