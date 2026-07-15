package OOP.ACCOUNT.JAVA;

public class Account {
    private String name;
    private String pin;
    private int balance;
    private int number;

    public Account(String name, String pin, int balance, int number) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.number = number;
    }

    public int getAccountNumber() {
        return this.number;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
        } else {
	    throw new IllegalArgumentException("Amount Must Be Greater Than Zero.");
	}
    }

    public void withdraw(int amount, String pin) {
        if(amount > 0 && amount <= this.balance && this.pin.equals(pin)) {
            this.balance = this.balance - amount;
        } else {
	    throw new IllegalArgumentException("Amount Must Be Greater Than Zero."); 
	}
    }

    public int checkBalance(String pin) {
        if(this.pin.equals(pin)) {
	    return this.balance;
	} else {
	    throw new IllegalArgumentException("Incorrect Pin.");
	}
    }
}
