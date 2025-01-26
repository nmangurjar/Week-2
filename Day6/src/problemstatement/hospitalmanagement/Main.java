package problemstatement.hospitalmanagement;


public class Main {
    public static void main(String[] args) {
        // Create InPatient
        InPatient inpatient = new InPatient("P001", "Alice", 30, "Pneumonia", "History of asthma", 5, 2000);
        inpatient.addRecord("Admitted for Fever treatment.");
        inpatient.addRecord("Prescribed antibiotics and inhalers.");

        // Create OutPatient
        OutPatient outpatient = new OutPatient("P002", "Bob", 25, "Fever", "No prior history", 500);
        outpatient.addRecord("Visited for high fever.");
        outpatient.addRecord("Prescribed paracetamol and fluids.");

        // Using polymorphism to handle different patient types
        Patient[] patients = {inpatient, outpatient};
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: INR" + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
            System.out.println();
        }
    }
}
