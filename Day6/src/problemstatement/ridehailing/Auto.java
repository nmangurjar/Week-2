package problemstatement.ridehailing;

public class Auto extends Vehicle implements GPS {
    private String currentLocation;

     Auto(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }


    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }


    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
