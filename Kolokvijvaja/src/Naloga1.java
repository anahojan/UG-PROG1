import java.util.Scanner;

public class Naloga1 {
    public static void main(String args []){
        Scanner vhod = new Scanner(System.in);
        System.out.println("Vpišite prvo celo število: ");
        long i = vhod.nextLong();
        System.out.println("Vpišite prvo drugo število: ");
        long k = vhod.nextLong();

        System.out.println(i*k);

    }
}
