import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    BankAccount [] accounts= new BankAccount[2];
        LinkedList<BankAccount> mylist=new LinkedList<>();

    BankAccount b= new BankAccount("Blah","Blalala",200);

    System.out.println(b);

     CreditAccount c=new CreditAccount("Janez", "Novak", 50, 500);
     b.send(c, 2000); //polimorfizem- Če pošlemo množico(bankaccount), lahko damo notr podmnožico(c)
     c.send(b, 700);
     b.send(c, 200);
        System.out.println(c);
        System.out.println(b);

        mylist.add(b);
        mylist.add(c);

        accounts[0]=b;
        accounts[1]=c;

        float bilanc=0;
        for (int i = 0; i < accounts.length; i++) {
            bilanc +=accounts[i].balance;
        }
        System.out.println("Bilance sheet" + bilanc);
    }
    //pri dedovanju se dedujejo samo stvari ki so public
}
