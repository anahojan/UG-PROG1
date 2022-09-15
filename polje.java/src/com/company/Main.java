package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        int a = vhod.nextInt();
        int polje[] = {1, 23, 45, 56, 566, 678, 888};
        int vsota = 0;
        for (int i = 0; i < polje.length; i++) {
            vsota = vsota + polje[i];
        }
        System.out.println("Vsota: " + vsota);
    }
}