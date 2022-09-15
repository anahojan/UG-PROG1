package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vhod=new Scanner(System.in);
        System.out.println("Vpišite besedo: ");
        String k=vhod.next();
        System.out.print("Obrat besede je: " + Helper.Obrat(k));

    }

}
