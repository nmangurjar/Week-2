//Create Student class
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
  Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // To get CGPA
    public double getCGPA() {
        return CGPA;
    }
    //To modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
}

// Main method
public class ManagementSystem {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(82, "Naman", 8, "Web development");
        student.displayDetails();
        System.out.println("previous CGPA : " + student.getCGPA());
        // Update and get CGPA
        student.setCGPA(7.6);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}