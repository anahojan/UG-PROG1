package com.company;

public class Trikotnik {
    Tocka A;
    Tocka B;
    Tocka C;
    Daljica hipotenuza;

    public Trikotnik(Daljica d, Tocka B){
        hipotenuza = d; //this uporabljamo samo takrat ko imamo dve spremnenljivki z enakim imenom
        this.A=d.t1;
        this.C=d.t2;
        this.B= B;

    }
    public double ploscina(){
        Pravokotnik p=new Pravokotnik(hipotenuza);
        Daljica visina=new Daljica(p.B, p.C);
        return A.distanceTo(B)*visina.t1.distanceTo(visina.t2)/2;
    }
}
