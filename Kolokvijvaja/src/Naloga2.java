
import java.util.Scanner;

public class Naloga2 {


    public static void main(String args[]) {
        Scanner vhod = new Scanner(System.in);
        System.out.println("Vnesite celo število: ");
        long k = vhod.nextLong();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            long a = i % 5;
            if (a != 0) {
                continue;
            }else{
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }

