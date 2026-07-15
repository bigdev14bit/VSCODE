class Account:
    def __init__(self, name, pin, balance, number):
        self.name = name
        self.pin = pin
        self.balance = balance
        self.number = number

    def get_account(self):
        return self.balance
    
    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
        else:
            print("Amount Must Be Greater Than Zero.")

    def withdraw(self, amount, pin):
        k