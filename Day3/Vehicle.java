//Create vehicle class
public class Vehicle {

    // Static variable
    static double registrationFee = 100;

    // Final variable 
    final String registrationNumber;

    // Instance variables 
    String ownerName;
    String vehicleType;

    // Constructor 
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display registration details of the vehicle
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: INR" + registrationFee);
    }

    // Static method to check if the object is an instance of Vehicle class
    public static boolean isVehicle(Object obj) {
        return obj instanceof Vehicle;
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Creating an instance of Vehicle
        Vehicle car = new Vehicle("John cena", "Car", "Mp04GB6765");

        // Checking if the car is an instance of Vehicle 
        if (isVehicle(car)) {
            car.displayRegistrationDetails();
        } else {
            System.out.println("Not a valid Vehicle object.");
        }

        // Updating the registration fee
        updateRegistrationFee(120);

        Vehicle bike = new Vehicle("Roman Reign", "Bike", "MP47YT6766");

        //displaying details
        if (isVehicle(bike)) {
            bike.displayRegistrationDetails();
        }
    }
}
