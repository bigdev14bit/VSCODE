public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(String pin, int amount) {
        if(amount > 0 && pin == "1234") {
            balance = balance - amount;
        }
    }
}
