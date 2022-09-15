package com.company;

import java.lang.reflect.Array;

public class Student {
    private int vpisna_stevilka;
    private String Ime;
    private String Priimek;
    private Predmet[] index = new Predmet[100];
    private  int stPredmetov;


  public Student (int vpisna_stevilka, String ime, String priimek){
      this.vpisna_stevilka=vpisna_stevilka;
      Ime=ime;
      Priimek=priimek;
      int stPredmetov=0;


  }

    public int getVpisna_stevilka() {
        return vpisna_stevilka;
    }

    public void setVpisna_stevilka(int vpisna_stevilka) {
        this.vpisna_stevilka = vpisna_stevilka;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getPriimek() {
        return Priimek;
    }

    public void setPriimek(String priimek) {
        Priimek = priimek;
    }

    public Predmet[] getIndex() {
        return index;
    }

    public void setIndex(Predmet[] index) {
        this.index = index;
    }

    public int getStPredmetov() {
        return stPredmetov;
    }

    public void setStPredmetov(int stPredmetov) {
        this.stPredmetov = stPredmetov;
    }

    public void dodajPredmet(Predmet a){
      index [stPredmetov] = a;
      stPredmetov++;
    }
    public void neopravljeniPredmeti(){
        for (int i = 0; i <stPredmetov ; i++) {
            if (this.index[i].isOpravil() == false){
                System.out.println(this.index[i].getIme());
            }
        }
    }


    public void opravljenipredmeti(){
        for (int i = 0; i < stPredmetov; i++) {
            if(this.index[i].isOpravil()==true){
                System.out.println(this.index[i].getIme());
            }

        }
    }

    public void indexIzpis(){
        for (int i = 0; i < stPredmetov ; i++) {
            System.out.println(this.index[i].getIme());
        }
    }

    public void popravljanjeOcene(Predmet x, int y){
      x.setOcena(y);
        System.out.println(x.getOcena());
    }

    public void vseOpravljeno(){
      int counter =0;
        for (int i = 0; i < stPredmetov ; i++) {
            if (this.index[i].isOpravil() == false){
                System.out.println("Ni  opravljeno.");
                break;
            }else {
                counter++;
            }
        }
        if (counter==stPredmetov){
            System.out.println("Vse je opravljeno");
        }
    }
}



