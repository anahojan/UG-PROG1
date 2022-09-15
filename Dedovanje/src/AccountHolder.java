public class AccountHolder implements Role {


    @Override
    public boolean deposit(BankAccount to, float amount) {
        return false;
    }

    @Override
    public boolean withdraw(BankAccount to, float amount) {
        return false;
    }
}
