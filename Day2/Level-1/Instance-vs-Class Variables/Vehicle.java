//Create course class
class Vehicle {
    static double registrationFee = 3500;
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display details of the vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing the Vehicle class
    public static void main(String[] args) {
       //Create object of vehicle class
        Vehicle v1 = new Vehicle("ishaan", "Alto-k10");
        Vehicle v2 = new Vehicle("Virat", "Jimmy");

        // Display details of individual vehicles
        System.out.println("DVehicle 1:");
        v1.displayVehicleDetails();

        System.out.println("Vehicle 2:");
        v2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(4500);

        // Display details
        System.out.println("\nAfter Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}