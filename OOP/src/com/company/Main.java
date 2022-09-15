package com.company;

public class Main {
    public static void main(String[] args) {
        Tocka t= new Tocka(1, 2);       //tocka t je definirana z Tocko //
        Tocka t2= new Tocka(2);  //Ko pokličemo new gre do načrta Tockaa- Zidarju plan v roke da nrdi hišo
       // t.x=5;                      //podčrta, ker ima Tocka svoj konstruktor, ki zahteva x in y
       // t.y=10;                     // če damo private ne moremo dostopati direktno do x in y-zato ne moremo izpisati x-
        //t.setX(1);                            //zato uporabljamo getterje in setterje
        //System.out.println(t.getX());
       // t.setY(5);
        //System.out.println(t.getY());

        Tocka f = new Tocka(-3, 5);       //tocka t je definirana z Tocko
        Tocka f2 = new Tocka(4);  //Ko pokličemo new gre do načrta Tocka- Zidarju plan v roke da nrdi hišo
       // t.x=-20; //gre direkt v pomnilnik ne uporablja konstruktorja - ker so int public lahko spremeni konstruktor
        //System.out.println(t.x);

        System.out.println(f.distanceTo(t2));
        System.out.println(f.getX());
        System.out.println(t2.getX());

        //Daljica d=new Daljica(t, t2);
        //System.out.println(d.length());

        Daljica d=new Daljica(t, t2);
        Trikotnik trikotnik=new Trikotnik(d,new Tocka(3,1));
        System.out.println(trikotnik.ploscina());
        Pravokotnik p= new Pravokotnik(d);
        System.out.println(p.ploscina());
        System.out.println(p.obseg());

    }

}
