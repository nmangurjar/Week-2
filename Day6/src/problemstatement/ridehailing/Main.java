package problemstatement.ridehailing;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Vehicle car = new Car("C001", "Naman", 18, "Bridge");
        Vehicle bike = new Bike("B001", "Om", 10, "Station");
        Vehicle auto = new Auto("A001", "Aman", 22, "Homee");

        // Calculate fare
        Vehicle[] vehicles = {car, bike, auto};
        double distance = 44;

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: INR" + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }
}
