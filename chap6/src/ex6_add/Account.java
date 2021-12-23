package ex6_add;

public class Account {
    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int value){
        if ((MIN_BALANCE <= value) && (value <= MAX_BALANCE)){
            balance = value;
        }
    }
}
