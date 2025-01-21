//Create student class
public class Student {

    // Static variable 
    static String universityName = "RGPV University";

    // Static variable 
    static int totalStudents = 0;

    // Final variable 
    final int rollNumber;

    // Instance variables 
    String name;
    String grade;

    // Constructor 
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);

    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name);
        }
    }


    public static void main(String[] args) {
        // Creating student object
        Student student1 = new Student(101, "Ishaan", "C");
        Student student2 = new Student(102, "Om Yadav", "B");

        // Display total number of students
        Student.displayTotalStudents();

        // Display details for each student
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Update grade 
        student1.updateGrade("A+");
        student1.displayStudentDetails();

      
    }
}
