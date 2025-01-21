//Create patient class
public class Patient {

    // Static variable 
    static String hospitalName = "City Hospital";
    
    // Static variable
    static int totalPatients = 0;

    // Final variable 
    final String patientID;

    // Instance variables 
    String name;
    int age;
    String ailment;

    // Constructor 
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    // Method to check if the object is an instance of Patient 
    public static boolean isPatient(Object obj) {
        return obj instanceof Patient;
    }

    // Main method for testing the class
    public static void main(String[] args) {
       
	   // Creating object of Patient
        Patient patient1 = new Patient("Salman", 30, "Fever", "101");
        Patient patient2 = new Patient("akshay", 45, "Cold", "102");

      
        if (isPatient(patient1)) {
            patient1.displayPatientDetails();
        } else {
            System.out.println("Not a valid Patient object.");
        }

        
    }
}
