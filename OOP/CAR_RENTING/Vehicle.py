class Vehicle:

    def __init__(self, plateNumber, modelYear, isAvailable, dailyRentalRate, brand, model):

        self.plateNumber = plateNumber
        self.modelYear = modelYear
        self.isAvailable = isAvailable
        self.dailyRentalRate = dailyRentalRate
        self.brand = brand
        self.model = model

    def checkAvailability(self):
        return self.isAvailable

    def markAsRented(self):
        self.isAvailable = False

    def markAsReturned(self):
        self.isAvailable = True

    def showInfo(self):
        return f"{self.brand}----{self.model}----({self.modelYear})----Plate: {self.plateNumber}----Rate: {self.dailyRentalRate}/day----Available: {self.isAvailable}"

    def updateRate(self, newRate):
        self.dailyRentalRate = newRate

my_car = Vehicle("aAscdef21", 2008, True, 300.0, "Toyota", "Hilux")

