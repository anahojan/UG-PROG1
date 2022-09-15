public class CreditAccount extends BankAccount {
    //7credit account je podmnožica bank account, tako ima vse properties od bankaccounta
    // extends-ker razširjamo funkcionalnost razreda


    float limit;

    public CreditAccount(String name, String surname, float balance, float limit) {
        super(name, surname, balance);
        this.limit= limit;
    }

    @Override
    public  boolean send(BankAccount to, float amount){
        if(balance+limit>amount){
            to.balance+=amount;
            this.balance -=amount;
            System.out.println("Transaction successful");
            return true;
        }else{
            System.out.println("Credit limit reached");
            return false;
        }
    }

}
