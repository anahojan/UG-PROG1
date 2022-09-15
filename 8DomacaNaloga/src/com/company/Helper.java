package com.company;

public class Helper {
    public static String  Obrat(String a){
        String obrat="";
        for (int i = a.length()-1; i >=0 ; i--) {
            obrat=obrat+a.charAt(i);
        }
        return obrat;
    }
}
