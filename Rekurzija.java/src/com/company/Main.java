package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        int memo[] = new  int[n+1];
        //n+1 ker je začetek 0
        System.out.println(sum(4));
        System.out.println(fakulteta(4));
        System.out.println(fib(n , memo));
       doTowers(doTowers(3; from: 'A', inter 'B', to: 'C');
    }
// rekurzija-funkcija kliče samo sebe
//stack- vedno obdelujemo najvišji element.
    static int sum(int x){
        if(x==0){
            return 0;

        }else{
            return x + sum(x-1);
        }
    }
    static int fakulteta (int x){
        if (x==1){
            return 1;
        }else {
            return x * fakulteta(x-1);
        }

    }
    // fibonačijevo število
    //je zelo počasno fib(f)
    //Fib(4) in Fib(3)
    //Fib(3) in Fib(2) || Fib(2) in Fib(1)
    // fib(2) in fib(1) in Fib(1) in Fib(0) || Fib(1) fib(0)
    //Nastane drevo, ki vedno znova računa, zato se naredi polje-memoiziramo fibonačijeva števila, ki so že bila izračunana

    static int fib(int n, int[] memo){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            if (memo[n] != 0){
                return memo[n];
            }else{
                memo[n] = fib(n - 1, memo) + fib(n-2, memo);
                return memo[n];
            }
        }
    }
    static void doTowers(int topN, char from, char inter, char to){
        if (topN==1){
            System.out.println("Disk 1 from "+ from +" to " + to);
        }else {
            doTowers(topN-1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN-1, inter , from , to);
        }
    }
}
