package com.company;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

    public static void print(int a[]){
        for (int i = 0, i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        System.out.println("Vnesite velikost polja");
        int velikost = vhod.nextInt();
        int polje[] = new int[velikost];

        for (int i = 0; i < polje.length; i++) {
            polje[i] = vhod.nextInt();
        }

        print(polje);

         //vsota elementov
        double vsota=0.0;
        System.out.print("Vsota števila:");
        for (int i = 0; i < polje.length; i++) {
            if (polje[i] % 2 == 0) {
                vsota = vsota + polje[i];
            }
            System.out.println();
            System.out.println("Vsorta elementov: " + vsota);
        }

        //Soda števila
        System.out.print("Soda števila: ");
        for (int i = 0; i < polje.length; i++) {
            if (polje[i] % 2 == 0) {
                System.out.print(polje[i] + " ");
            }
        }
        System.out.println();

        int najvecji=Integer.MIN_VALUE;
        for(int i = 0; i < polje.length; i++) {
            if (polje[i] > najvecji){
                najvecji = polje[i];
            }
        }

        System.out.println("Povprečje" + (float)vsota / polje.length);

       System.out.println("Vnesite iskanpo število: ");
        int iskanostevilo = vhod.nextInt();
        boolean found = false;
        for (int i = 0; i < polje.length; i++){
                if (polje[i] == iskanostevilo){
                    found = true;
                }
        }
        if (found == true){
            System.out.println("Stevilo je v polju");
        }else{
            System.out.println("stevilo ni v polju");
        }
        int  novopolje[]=new int[polje.length];
        for (int i = 0; i < novopolje.length ; i++) {
               novopolje[i] = polje[polje.length -1 -i];
        }
        for (int i = 0; i < novopolje.length; i++) {
            System.out.println(novopolje[i] + " ");
        }

    }
}
