package com.company;

public class Pravokotnik {
    Daljica d;
    Tocka A;
    Tocka B;
    Tocka C;
    Tocka D;

    public Pravokotnik(Tocka a, Tocka b, Tocka c, Tocka d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public Pravokotnik(Daljica d){
        this.d=d;
        A=d.t1;
        C=d.t2;
        B=new Tocka(A.getX(), C.getY());
        D=new Tocka(C.getX(), A.getY());

    }

    public double ploscina(){
        return A.distanceTo(B)*B.distanceTo(C);
    }

    public double obseg(){
        return 2*(A.distanceTo(B)+B.distanceTo(C));
    }

}

