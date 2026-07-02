balance = 0

def Account():
    balance

def get_balance():
    return balance

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(int amount) {
        if(amount > 0) {
            balance = balance - amount;
        }
    }
}
