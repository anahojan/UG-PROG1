package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {


        Student a =new Student(89191, "Jana", "Novak");
        Student b=new Student(89192, "Marina", "Točić");
        Student c=new Student(89193, "Sabrina", "Sijamhodžč");
        Student d= new Student( 89194, "Luka", "Drekonja");
        Student e= new Student( 89195, "Matiček", "Koval");


        //Študent a
        Predmet programiranjea = new Predmet(1, "programiranje", true, 7);
        Predmet teorijainosnoveračunalništvaa = new Predmet( 2, "Teorija in osnove računalništva", false, 4);
        Predmet algebraa =new Predmet(3, "Algebra 1", true, 9);
        Predmet analiza1a = new Predmet (4, "Analiza 1", false, 3);
        Predmet analiza2a = new Predmet (5, "Analiza 2", false, 2);
        Predmet algebra2a = new Predmet (6, "Linearna algebra", true, 8);
        Predmet Organskakemijainbijokemijaa = new Predmet (7, "Organska kemija in biokemija", true , 9);
        Predmet genetikaa = new Predmet(8, "Osnove genetike in genomike", true, 9);


        //Študent b
        Predmet programiranjeb = new Predmet(1, "programiranje", true, 8);
        Predmet teorijainosnoveračunalništvab = new Predmet( 2, "Teorija in osnove računalništva", false, 3);
        Predmet algebrab =new Predmet(3, "Algebra 1", true, 9);
        Predmet analiza1b = new Predmet (4, "Analiza 1", true, 6);
        Predmet analiza2b = new Predmet (5, "Analiza 2", false, 4);
        Predmet algebra2b = new Predmet (6, "Linearna algebra", true, 9);
        Predmet Organskakemijainbijokemijab = new Predmet (7, "Organska kemija in biokemija", true , 6);
        Predmet genetikab = new Predmet(8, "Osnove genetike in genomike", false, 3);

        //Študent c
        Predmet programiranjec = new Predmet(1, "programiranje", true, 7);
        Predmet teorijainosnoveračunalništvac = new Predmet( 2, "Teorija in osnove računalništva", true, 7);
        Predmet algebrac =new Predmet(3, "Algebra 1", true, 6);
        Predmet analiza1c = new Predmet (4, "Analiza 1", true, 6);
        Predmet analiza2c = new Predmet (5, "Analiza 2", false, 4);
        Predmet algebra2c = new Predmet (6, "Linearna algebra", true, 6);
        Predmet Organskakemijainbijokemijac = new Predmet (7, "Organska kemija in biokemija", true , 6);
        Predmet genetikac = new Predmet(8, "Osnove genetike in genomike", false, 3);

        //Študent d
        Predmet programiranjed = new Predmet(1, "programiranje", true, 10);
        Predmet teorijainosnoveračunalništvad = new Predmet( 2, "Teorija in osnove računalništva", true, 10);
        Predmet algebrad =new Predmet(3, "Algebra 1", true, 10);
        Predmet analiza1d = new Predmet (4, "Analiza 1", true, 10);
        Predmet analiza2d = new Predmet (5, "Analiza 2", true, 9);
        Predmet algebra2d = new Predmet (6, "Linearna algebra", true, 10);
        Predmet Organskakemijainbijokemijad = new Predmet (7, "Organska kemija in biokemija", true , 9);
        Predmet genetikad = new Predmet(8, "Osnove genetike in genomike", true, 9);

        //Študent e
        Predmet programiranjee = new Predmet(1, "programiranje", true, 7);
        Predmet teorijainosnoveračunalništvae = new Predmet( 2, "Teorija in osnove računalništva", true, 7);
        Predmet algebrae =new Predmet(3, "Algebra 1", true, 8);
        Predmet analiza1e = new Predmet (4, "Analiza 1", true, 6);
        Predmet analiza2e = new Predmet (5, "Analiza 2", true, 6);
        Predmet algebra2e = new Predmet (6, "Linearna algebra", true, 8);
        Predmet Organskakemijainbijokemijae = new Predmet (7, "Organska kemija in biokemija", true , 7);
        Predmet genetikae = new Predmet(8, "Osnove genetike in genomike", true, 7);


        //Študent a
        a.dodajPredmet(programiranjea);
        a.dodajPredmet(teorijainosnoveračunalništvaa);
        a.dodajPredmet(algebraa);
        a.dodajPredmet(analiza1a);
        a.dodajPredmet(analiza2a);
        a.dodajPredmet(Organskakemijainbijokemijaa);
        a.dodajPredmet(genetikaa);
        a.dodajPredmet(algebra2a);


        //Študent b
        b.dodajPredmet(programiranjeb);
        b.dodajPredmet(teorijainosnoveračunalništvab);
        b.dodajPredmet(algebrab);
        b.dodajPredmet(algebra2b);
        b.dodajPredmet(analiza1b);
        b.dodajPredmet(analiza2b);
        b.dodajPredmet(genetikab);
        b.dodajPredmet(Organskakemijainbijokemijab);

        //Študent c
        c.dodajPredmet(programiranjec);
        c.dodajPredmet(teorijainosnoveračunalništvac);
        c.dodajPredmet(algebrac);
        c.dodajPredmet(algebra2c);
        c.dodajPredmet(analiza1c);
        c.dodajPredmet(analiza2c);
        c.dodajPredmet(genetikac);
        c.dodajPredmet(Organskakemijainbijokemijac);

        //Študent d
        d.dodajPredmet(programiranjed);
        d.dodajPredmet(teorijainosnoveračunalništvad);
        d.dodajPredmet(algebrad);
        d.dodajPredmet(algebra2d);
        d.dodajPredmet(analiza1d);
        d.dodajPredmet(analiza2d);
        d.dodajPredmet(genetikad);
        d.dodajPredmet(Organskakemijainbijokemijad);

        //Študent e
        e.dodajPredmet(programiranjee);
        e.dodajPredmet(teorijainosnoveračunalništvae);
        e.dodajPredmet(algebrae);
        e.dodajPredmet(algebra2e);
        e.dodajPredmet(analiza1e);
        e.dodajPredmet(analiza2e);
        e.dodajPredmet(genetikae);
        e.dodajPredmet(Organskakemijainbijokemijae);

//Neopravljeni predmeti
        System.out.println("Študent: " + a.getVpisna_stevilka() + ", Ime: " + a.getIme() + " " + a.getPriimek() );
        System.out.println();
        System.out.println("Neopravljeni predmeti: ");
        a.neopravljeniPredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Študent: " + b.getVpisna_stevilka() + ", Ime: " + b.getIme() + " " + b.getPriimek() );
        System.out.println();
        System.out.println("Neopravljeni predmeti: ");
        b.neopravljeniPredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Študent: " + c.getVpisna_stevilka() + ", Ime: " + c.getIme() + " " + c.getPriimek() );
        System.out.println();
        System.out.println("Neopravljeni predmeti: ");
        c.neopravljeniPredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Študent: " + d.getVpisna_stevilka() + ", Ime: " + d.getIme() + " " + d.getPriimek() );
        System.out.println();
        System.out.println("Neopravljeni predmeti: ");
        d.neopravljeniPredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Študent: " + e.getVpisna_stevilka() + ", Ime: " + e.getIme() + " " + e.getPriimek() );
        System.out.println();
        System.out.println("Neopravljeni predmeti: ");
        e.neopravljeniPredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

//Opravljeni predmeti
        System.out.println("Študent: " + a.getVpisna_stevilka() + ", Ime: " + a.getIme() + " " + a.getPriimek() );
        System.out.println();
        System.out.println("Opravljeni predmeti: ");
        a.opravljenipredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Študent: " + b.getVpisna_stevilka() + ", Ime: " + b.getIme() + " " + b.getPriimek() );
        System.out.println();
        System.out.println("Opravljeni predmeti: ");
        b.opravljenipredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Študent: " + c.getVpisna_stevilka() + ", Ime: " + c.getIme() + " " + c.getPriimek() );
        System.out.println();
        System.out.println("Opravljeni predmeti: ");
        c.opravljenipredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Opravljeni predmeti: ");
        System.out.println("Študent: " + d.getVpisna_stevilka() + ", Ime: " + d.getIme() + " " + d.getPriimek() );
        System.out.println();
        System.out.println("Opravljeni predmeti: ");
        d.opravljenipredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Opravljeni predmeti: ");
        System.out.println("Študent: " + e.getVpisna_stevilka() + ", Ime: " + e.getIme() + " " + e.getPriimek() );
        System.out.println();
        System.out.println("Opravljeni predmeti: ");
        e.opravljenipredmeti();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");



        //Izpis celotnega indeksa
        //Študent a
        System.out.println("Indeks studenta");
        System.out.println("Študent: " + a.getVpisna_stevilka() + ", Ime: " + a.getIme() + " " + a.getPriimek() );
        a.indexIzpis();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Študent b
        System.out.println("Indeks studenta");
        System.out.println("Študent: " + b.getVpisna_stevilka() + ", Ime: " + b.getIme() + " " + b.getPriimek() );
        b.indexIzpis();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Študent c
        System.out.println("Indeks studenta");
        System.out.println("Študent: " + c.getVpisna_stevilka() + ", Ime: " + c.getIme() + " " + c.getPriimek() );
        c.indexIzpis();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Študent d
        System.out.println("Indeks studenta");
        System.out.println("Študent: " + d.getVpisna_stevilka() + ", Ime: " + d.getIme() + " " + d.getPriimek() );
        d.indexIzpis();
        System.out.println("-----------------------------------------------------------------------------------------");

        //Študent e
        System.out.println("Indeks studenta");
        System.out.println("Študent: " + e.getVpisna_stevilka() + ", Ime: " + e.getIme() + " " + e.getPriimek() );
        e.indexIzpis();
        System.out.println("-----------------------------------------------------------------------------------------");


        // ali so vse obveznosti opravljene:
        System.out.println("Ali so vse obveznosti opravljene");
        System.out.println("Študent: " + a.getVpisna_stevilka() + ", Ime: " + a.getIme() + " " + a.getPriimek() );
        a.vseOpravljeno();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Študent: " + b.getVpisna_stevilka() + ", Ime: " + b.getIme() + " " + b.getPriimek() );
        b.vseOpravljeno();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Študent: " + c.getVpisna_stevilka() + ", Ime: " + c.getIme() + " " + c.getPriimek() );
        c.vseOpravljeno();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Študent: " + d.getVpisna_stevilka() + ", Ime: " + d.getIme() + " " + d.getPriimek() );
        d.vseOpravljeno();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Študent: " + e.getVpisna_stevilka() + ", Ime: " + e.getIme() + " " + e.getPriimek() );
        e.vseOpravljeno();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        //popravljanje ocen
        a.popravljanjeOcene(teorijainosnoveračunalništvaa, 7);
        a.popravljanjeOcene(analiza1a, 6);
        a.popravljanjeOcene(analiza2a, 6);
        System.out.println(teorijainosnoveračunalništvaa.getOcena());







        System.out.println();

    }
}
