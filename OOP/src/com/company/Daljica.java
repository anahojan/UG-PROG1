package com.company;

public class Daljica {
    Tocka t1;
    Tocka t2;

    public Daljica(Tocka t1, Tocka t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public  double length(){
        return t1.distanceTo(t2);
    }

    public Tocka getT1() {
        return t1;
    }

    public void setT1(Tocka t1) {
        this.t1 = t1;
    }

    public Tocka getT2() {
        return t2;
    }

    public void setT2(Tocka t2) {
        this.t2 = t2;
    }
}
