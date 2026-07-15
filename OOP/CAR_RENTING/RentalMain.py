from Vehicle import Vehicle
from Customer import Customer
from Rental import Rental

myVehicle = Vehicle("ABC123", 2022, True, 15000.0, "Toyota", "Camry")
myCustomer = Customer("Chidi", "08012345678", "DL9988", False, 25)

print(f"My Customer: {myCustomer.checkEligibility()}")
print()


myRental = Rental(myVehicle, myCustomer, start, end, 0.0, True)

myVehicle.markAsRented()
myCustomer.toggleRentingStatus()

print(f"Rental: {myRental.calculateTotalCost()}")
print()

print(f"My Vehicle: {myVehicle.showInfo()}")
print()

print(f"My Customer: {myCustomer.showInfo()}")
print()

print(f"My Rental: {myRental.showInfo()}")
print()

myRental.endRental()

print(f"My Vehicle: {myVehicle.showInfo()}")
print()

print(f"My Customer: {myCustomer.showInfo()}")
print()
