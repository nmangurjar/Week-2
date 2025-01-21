class Employee {

    // Static variable
    static String companyName = "BridgeLabz";

    // Static variable to track the total number of employees
    static int totalEmployees = 0;

    // Final variable for employee ID
    final int id;

    // Instance variables
    String name;
    String designation;

    // Constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Om Yadav", 101, "Software Engineer");
        Employee emp2 = new Employee("Ishaan", 102, "Product Manager");

        // Display total number of employees
        Employee.displayTotalEmployees();

        // Checking if emp1 is an instance of Employee class
        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }

        // Checking if emp2 is an instance of Employee class
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }
    }
}
