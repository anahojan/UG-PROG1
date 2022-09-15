import java.util.Scanner;

public class Naloga3 {
    public static void main(String args []){
        Scanner vhod = new Scanner(System.in);
        System.out.println("Vnesite koliko števil bo imelo polje: ");
        int n = vhod.nextInt();
        int polje[] = new int [n];
        System.out.println("Vnesite " + n + " števil: ");
        for(int i = 0; i < n; i++) {
            polje[i] = vhod.nextInt();
        }
        for (int i = 0; i < polje.length ; i++) {
            if (polje[i] % 2 == 0){
                System.out.println("Število " + polje[i] +" je sodo");
            }
        }
       int counter=0;
        for (int i = 0; i < polje.length ; i++) {
            if (polje[i]<0){
                counter++;
            }
        }
        System.out.println("Števil, ki je negativnih je: " + counter);

        long produkt = 1;
        for (int i = 0; i < polje.length; i++) {
            if ( i % 2 == 1){
                produkt=produkt*polje[i];
            }
        }
        System.out.println("produkt števil je: "+ produkt);
    }
}
