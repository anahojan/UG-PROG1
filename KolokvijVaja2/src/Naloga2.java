import java.util.Scanner;

public class Naloga2 {
    public static void main(String args []){
        Scanner vhod=new Scanner(System.in);
        System.out.println("Vnesite dolžino polja: ");
        int n=vhod.nextInt();
        int [] polje=new int[n];

        for (int i = 0; i < polje.length; i++) {
            System.out.println("Vnesite številko: ");
            polje[i]=vhod.nextInt();
        }
        int f=0;
        for (int i = 0; i <polje.length/2 ; i++) {
            f=f+polje[i];

        }
        System.out.println(f);
        for (int i = 0; i < polje.length; i++) {
            if (polje[i]%7==0){
                System.out.println(polje[i]);
            }
        }
        for (int i = 0; i < polje.length ; i++) {
            if (i%2==1){
                System.out.println(polje[i]);
            }

        }
                
    }
}
