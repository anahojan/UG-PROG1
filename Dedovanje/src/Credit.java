public abstract class Credit {
    int max_credit;

    public void increaseCredit(float amount){
        max_credit += amount;
    }

    public abstract boolean grantCredit(float amount);

}
//abstract razred