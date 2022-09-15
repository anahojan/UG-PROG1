package com.company;

public class Tocka {
   private int x; //Načrt kako izgleda točka
    private int y;

    public double distanceTo(Tocka t){
        return Math.sqrt
                (Math.pow(this.x-t.getX(),2)+
                Math.pow(this.y - t.getY(),2 ));                   //euklidova razdalja

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {  //parameter nova vrednost x
        if (x<0){
            x=0;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //konstruktor je posebna metoda, ki se kliče isto kot class. nI FUNKCIJA
    public    Tocka(int x, int y){ //NAČIN KAKO ZGRATITI Točko
        if (x<0){
            x=0;
            //Zakaj y ni tako kot x določen? Zakaj je lahko negativen? Ni se nam dalo pisati, druga;e bi mogli
        }
        this.x=x; //this x-pomeni ta x, x pomeni (intx)
        this.y=y;
    }

    public Tocka(int xy){ //več konstruktorjev-construction overloading
        this.x=xy;
        this.y=xy;
    }


}
