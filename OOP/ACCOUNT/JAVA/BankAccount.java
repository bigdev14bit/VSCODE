package bankApp;

public class Account {

    private String name;
    private int balance;
    private int pin;
    private int accountNumber;

    public Account(String name , int pin , int accountNumber) {
        this.name = name;
        this.pin = pin;
        this.accountNumber = accountNumber;

    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
            balance = balance + amount;
    }

    public int getBalance(int pin) {
        if (pin != this.pin) {
            throw new IllegalArgumentException("Invalid pin");
        }
        return balance;
    }

    public void withdraw(int amount, int pin) {
        if (pin != this.pin) {
            throw new IllegalArgumentException("Invalid pin");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance = balance - amount;

    }

    public void changePin(int oldPin, int newPin) {
        if (oldPin != this.pin) {
            throw new IllegalArgumentException("Incorrect pin");
        }
        this.pin = newPin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
