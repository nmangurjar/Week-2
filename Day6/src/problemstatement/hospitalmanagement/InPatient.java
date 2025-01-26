package problemstatement.hospitalmanagement;


import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private List<String> medicalRecords;

    public InPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
        this.medicalRecords = new ArrayList<>();
    }


    public double calculateBill() {
        return daysAdmitted * roomChargePerDay;
    }


    public void addRecord(String record) {
        medicalRecords.add(record);
    }


    public void viewRecords() {
        System.out.println("Medical Records for InPatient:");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}
