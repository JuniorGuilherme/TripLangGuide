package com.example.notebookdell.triplangguide;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Notebook Dell on 16/04/2018.
 */

public class Traducoes implements Serializable{
    String pt_br;
    String english;
    String aplicacao;
    static ArrayList<Traducoes> alimentos = new ArrayList<>();
    static ArrayList<Traducoes> numeros = new ArrayList<>();
    static ArrayList<Traducoes> referencia_familiar = new ArrayList<>();
    static ArrayList<Traducoes> expressoes_comuns = new ArrayList<>();


    public void carregarAlimentos(){
        alimentos.add(addTraducao("Maça", "Apple", "Get an apple."));
        alimentos.add(addTraducao("Maracuja", "Passion Fruit", "I want to have some passion fruit juice."));
        alimentos.add(addTraducao("Frango", "Chicken", "Fried chicken, please."));
        alimentos.add(addTraducao("Alcatra", "Rump", "From barbecue, I want rump."));
        alimentos.add(addTraducao("Feijão", "Bean", "Buy 5kg of beans, please."));

    }

    public ArrayList<Traducoes> retornaAlimentos(){
        return alimentos;
    }

    public void carregarNumeros(){
        numeros.add(addTraducao("Um", "One"));
        numeros.add(addTraducao("Dois", "Two"));
        numeros.add(addTraducao("Três", "Three"));
        numeros.add(addTraducao("Quatro", "Four"));
        numeros.add(addTraducao("Cinco", "Five"));
        numeros.add(addTraducao("Seis", "Six"));
        numeros.add(addTraducao("Sete", "Seven"));
        numeros.add(addTraducao("Oito", "Eight"));
        numeros.add(addTraducao("Nove", "Nine"));
        numeros.add(addTraducao("Dez", "Ten"));
    }

    public ArrayList<Traducoes> retornaNumeros(){
        return numeros;
    }

    public void carregarReferenciaFamiliar(){
        referencia_familiar.add(addTraducao("Mãe", "Mon", "Mon, I'm hungry."));
        referencia_familiar.add(addTraducao("Pai", "Dad", "Dad, give me that smartphone?"));
        referencia_familiar.add(addTraducao("Tio", "Uncle", "Uncle, let's take a walk?"));
        referencia_familiar.add(addTraducao("Tia", "Aunt", "My aunt is awesome."));
        referencia_familiar.add(addTraducao("Primo", "Cousin", "My cousin is my best friend."));
        referencia_familiar.add(addTraducao("Prima", "Cousin", "My cousin is very beatiful."));
        referencia_familiar.add(addTraducao("Vó", "Grandmother", "I love my grandmother."));
        referencia_familiar.add(addTraducao("Vô", "Grandfather", "My grandfather taught me how to fish."));
    }

    public ArrayList<Traducoes> retornaReferenciaFamiliar(){
        return referencia_familiar;
    }

    public void carregarExpressoesComuns(){
        expressoes_comuns.add(addTraducao("Pelo amor de Deus!", "For goodness' sake!"));
        expressoes_comuns.add(addTraducao("Não ter a menor idéia.", "To have no clue."));
        expressoes_comuns.add(addTraducao("Nunca ouvi falar.", "Never heard of."));
        expressoes_comuns.add(addTraducao("Deixa pra lá.", "Never mind"));
        expressoes_comuns.add(addTraducao("Melhor impossível.", "As good as it gets."));
        expressoes_comuns.add(addTraducao("Você quem sabe.", "It is up to you."));
        expressoes_comuns.add(addTraducao("Use o tempo que for necessário.", "Take your time."));
        expressoes_comuns.add(addTraducao("Até aqui, tudo bem.", "So far, so good."));
        expressoes_comuns.add(addTraducao("Como assim? O que aconteceu?.", "How come?"));

    }

    public ArrayList<Traducoes> retornaExpressoesComuns(){
        return expressoes_comuns;
    }

    public Traducoes addTraducao(String pt_br, String english, String aplicacao){
        Traducoes t = new Traducoes();
        t.setPt_br(pt_br);
        t.setEnglish(english);
        t.setAplicacao(aplicacao);
        return t;
    }

    public Traducoes addTraducao(String pt_br, String english){
        Traducoes t = new Traducoes();
        t.setPt_br(pt_br);
        t.setEnglish(english);
        return t;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
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

}
