import java.util.Scanner;

public class Naloga3 {


    public static void main(String [] args ){
        Scanner vhod=new Scanner(System.in);
        System.out.println("Vnesite poved, ki ima namesto presledkov_Npr. Mama_in_Jaka_sta_šla_v_kino. : ");
        String poved=vhod.next();

        int b=0;
        int i=0;
        for (i = 0; i < poved.length() ; i++){
            poved.replace('_',' ');
        }
        System.out.println(poved.replace('_',' '));

        for (i = 0; i < poved.length() ; i++) {
            if (poved.charAt(i) =='_'){

                b++;

            }
        }

        System.out.println("Ta poved ima " + b + " presledkov zato ima " + (b+1) + " besed" );
    }
}
