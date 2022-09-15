public class BankAccount {
    String name;
    String surname;
    float balance;
    Role role;

    public BankAccount(String name, String surname, float balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        role = new AccountHolder();
    }

    public boolean send(BankAccount to, float amount){
        if(balance>amount){
            to.balance += amount;
            this.balance -= amount;
            return true;
        }else{
            System.out.println("Not enough money on your bank account");
            return false;
        }
    }

    public String toString(){
        return "Name: " + name + " Surename: "+ surname +" Balance: " + balance;
    }
}
