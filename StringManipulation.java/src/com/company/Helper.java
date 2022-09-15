package com.company;

public class Helper {
    public static String pocisti (String palindrom){
        return palindrom.replace(" ", " ");
    }

    public static String  obratec(String palindrom){
        String obratec =" ";
        for (int i = 0; i < palindrom.length(); i++) {
            obratec = palindrom.charAt(i) + obratec;
    }
        return obratec;

    }
        public static boolean iPalindrom(String palindrom){
        palindrom = pocisti(iPalindrom());

        if (Helper.obratec(palindrom).equals(palindrom)){
        System.out.println("je palindrom");
        }else{
        System.out.println("Ni palindrom");
        }
    }
}
