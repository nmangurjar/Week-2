package problemstatement.vehiclerentalsystem;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("111", "Car", 100, "I453"));
        vehicles.add(new Bike("222", "Bike", 60, "I664"));
        vehicles.add(new Truck("333", "Truck", 600, "I6554"));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: INR" + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: INR" + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println();
        }
    }
}

