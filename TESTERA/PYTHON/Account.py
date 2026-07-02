balance = 0
amount = 0

def Account():
   return balance

def get_balance():
    return balance

def deposit():
    if amount > 0:
        balance = balance + amount

def withdraw():
    if amount > 0:
        balance = balance - amount
