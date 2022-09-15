import java.util.Scanner;

public class Naloga1 {
    public static void main(String args []){
        Scanner vhod=new Scanner(System.in);
        System.out.println("Vnesite prvo stevilo: ");
        long n=vhod.nextLong();
        System.out.println("Vnesite drugo stevilo: ");
        long k=vhod.nextLong();

        //Razlika kubov
        long g=n*n;
        long f=k*k;
        System.out.println("Razlika kubov je: " + (g-f) );


    }
}
