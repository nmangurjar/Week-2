package problemstatement.vehiclerentalsystem;

// Create vehicle class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }


    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }


    public double calculateInsurance() {
        return 200.0;
    }


    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}
