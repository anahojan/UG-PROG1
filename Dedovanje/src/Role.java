public interface Role {
    public boolean deposit(BankAccount to, float amount);

    public boolean withdraw(BankAccount to, float amount);
}
