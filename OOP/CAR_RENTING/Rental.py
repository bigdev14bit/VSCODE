from Vehicle import Vehicle
from Customer import Customer

class Rental:
    def __init__(self, vehicle, customer, startDay, endDay, totalCost, isActive):
        self.vehicle = vehicle
        self.startDay = startDay
        self.endDay = endDay
        self.customer = customer
        self.totalCost = totalCost
        self.isActive = isActive

    def calculateTotalCost(self):
        self.totalCost = days * self.vehicle.dailyRentalRate
        return self.totalCost

    def endRental(self):
        self.isActive = False
        self.vehicle.markAsReturned()
        self.customer.toggleRentingStatus()

    def checkOverdue(self):
        return datetime.datetime.now() > self.endDate and self.isActive

    def showInfo(self):
        return f"Rental: {self.customer.name} rented {self.vehicle.brand} {self.vehicle.model} from {self.startDate} to {self.endDate} - Total: {self.totalCost} - Active: {self.isActive}"

renters = Rental("Hilux", "Ade", 12, 20, 30000, True)
