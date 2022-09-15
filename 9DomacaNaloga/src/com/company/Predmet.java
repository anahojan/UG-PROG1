package com.company;

public class Predmet {
    private int id;
    private String ime;
    private boolean opravil;
    private int ocena;

    public Predmet (int id, String ime, boolean opravil, int ocena){
        this.id=id;
        this.ime=ime;
        this.opravil=opravil;
        this.ocena=ocena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public boolean isOpravil() {
        return opravil;
    }

    public void setOpravil(boolean opravil) {
        this.opravil = opravil;
    }

    public int getOcena() {
        return ocena;
    }
}