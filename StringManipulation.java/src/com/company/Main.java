package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Stringi niso primitivni tipi, ampak so sestavljeni iz znakcov, zadaj se skriva polje-vsaka šrka ima svojo številko-ASCII tabela
        String banana = "banana";
        //System.out.println(banana.charAt(2));

        for (int i = 0; i < banana.length(); i++) {
            //z oklepaji ker ni primitiven tip
            //System.out.println(banana.charAt(i)); // Vrne znak
            if (banana.charAt(i) == 'a') {
                System.out.println("nasel a");
            }
        }
       if (banana.indexOf('@') < 0 ){
           System.out.println("Ni");
       }
        int a = 1231321;
        String beseda = " " + a;
        String obrat= " ";
        for (int i = 0; i < beseda.length() ; i++) {
            obrat = beseda.charAt(i) + obrat;
        }
        if (obrat.equals(beseda)) {
            System.out.println("Palindrom");
        }
        long b = Long.parseLong("231213121211"); //besedilo pretvorimo v številko
        System.out.println(b);

        Scanner sc = new Scanner((System.in));
        String line = sc.next();
        String besede [] = line.split(",");
        for (int i = 0; i < besede.length ; i++) {
           stevila[i] = Integer.parseInt(besede[i]);

        }
        System.out.println(beseda.substring(2,5));

        String palindrom = "perica reze raci rep";
        palindrom = palindrom.replace("", "");

        if (Helper.iPalindrom(palindrom)){
            System.out.println("je palindrom");
        }else{
            System.out.println("Ni palindrom");
        }
    }
}
