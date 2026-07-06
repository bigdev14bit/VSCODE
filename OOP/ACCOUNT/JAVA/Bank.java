import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts = new ArrayList<>();
    private int accountNumber;

    public Bank(String name ,  int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;

    }

    public Account registerCustomer(String firstName, String lastName, int pin) {
        Account customerAccount = new Account(name = firstName + " " + lastName, pin , ++accountNumber);
        accounts.add(customerAccount);

        return customerAccount;
    }

    public int getNumberOfRegisteredCustomers() {
        return accounts.size();

    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new IllegalArgumentException("Account number " + accountNumber + " not found");

    }

    public int checkBalance(int accountNumber, int pin) {
        Account customerAccount = findAccount(accountNumber);

        return customerAccount.getBalance(pin);

    }

    public void deposit(int accountNumber, int amount) {
        Account customerAccount = findAccount(accountNumber);
        customerAccount.deposit(amount);

    }

    public void withDraw(int accountNumber, int amount ,  int pin) {
        Account customerAccount = findAccount(accountNumber);
        customerAccount.withdraw(amount, pin);

    }

    public void transfer(int fromAccountNumber, int toAccountNumber , int amount, int pin) {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        fromAccount.withdraw(amount, pin);
        toAccount.deposit(amount);

    }

    public void removeAccount(int accountNumber, int pin) {
        Account customerAccount = findAccount(accountNumber);
        accounts.remove(customerAccount);

    }
}
