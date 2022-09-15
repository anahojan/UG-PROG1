package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        int a = vhod.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a-1  || i + j == a - 1 || i == j || j == 0 || j == a - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}