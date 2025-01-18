public class CarRental {

    String customerName;
    String carModel;
     int rentalDays;
     double dailyRate;

    // Constructor
     CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    public void displayRentalDetails() {
        double totalCost = calculateTotalCost();
        System.out.println("Rental Details for " + customerName + ":");
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }


    public static void main(String[] args) {
        // Creating an instance of CarRental
        CarRental car1 = new CarRental("Naman", "Maruti Baleno", 2, 1200);

        // Displaying rental details
        car1.displayRentalDetails();
    }
}
