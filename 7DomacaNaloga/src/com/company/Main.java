package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vhod=new Scanner(System.in);
        System.out.println("Vpišite niz: ");
        String k=vhod.next();

        for (int i = 0; i <k.length() ; i++) {
            if (i%2!=0){
                System.out.print(k.charAt(i));
            }
        }
    }
}
