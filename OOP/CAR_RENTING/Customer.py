class Customer:
    def __init__(self, name, contactInfo, drivingLicenseNumber, isCurrentlyRenting, age):

        self.name = name
        self.contactInfo = contactInfo
        self.drivingLicenseNumber = drivingLicenseNumber
        self.isCurrentlyRenting = isCurrentlyRenting
        self.age = age

    def checkEligibility(self):
        if self.age >= 18 and self.drivingLicenseNumber != "":
            return True
        else:
            return False

    def toggleRentingStatus(self):
        if self.isCurrentlyRenting == True:
            self.isCurrentlyRenting = False
        else:
            self.isCurrentlyRenting = True

    def showInfo(self):
        return f"{self.name} - Age: {self.age} - License: {self.drivingLicenseNumber} - Contact: {self.contactInfo} - Currently Renting: {self.isCurrentlyRenting}"

customer = Customer("Ade", "devbig14@gmail.com", "Acd32*s", False, 28)

