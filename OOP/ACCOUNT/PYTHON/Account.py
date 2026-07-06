BALANCE = 0

def account():

    def getBalnce():
        return BALANCE
    
    def deposit(amount):
        if amount > 0:
            BALANCE = BALANCE + amount

    def withdraw(pin, amount):
        if amount > 0 and pin == "1234":
            BALANCE = BALANCE - amount