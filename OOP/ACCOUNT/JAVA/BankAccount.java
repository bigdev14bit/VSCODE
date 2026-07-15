package OOP.ACCOUNT.JAVA;

import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    private String name;
    private List<Account> accounts;
    private int nextAccountNumber;

    public BankAccount(String name) {
    this.name = name;
	this.accounts = new ArrayList<Account>();
	this.nextAccountNumber = 10000;
    }

    public Account registerCustomer(String firstName, String lastName, String pin) {
	String fullName = firstName + " " + lastName;
    int balance = 0;
	int accountNumber = this.nextAccountNumber;
	this.nextAccountNumber = this.nextAccountNumber + 1;

	Account newAccount = new Account(fullName, pin, balance, accountNumber);
	accounts.add(newAccount);
	return newAccount;
	}

	public Account findAccountNumber(int accountNumber) {
		for(Account account : accounts) {
			return account;
		}
	}

	public void deposit(int amount, int accountNumber) {
		Account account = findAccountNumber(accountNumber);
		account.deposit(amount);
	}
}