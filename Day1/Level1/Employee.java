
//Create Employee class
public class Employee{

//Create data variables
String name ;
int id ;
double salary;

//Constructor
public Employee(String name, int id , double salary ){

 this.name = name;
 this.id = id;
 this.salary = salary;
 }

//Method to show Employee details
 public void displayEmployeeDetails(){

        System.out.println("Employee name :  "+name);
        System.out.println("Employee id :  "+id);
        System.out.println("Employee salary :  "+salary);

	   }
       }
	   
	   class EmployeeDetails {
           public static void main(String[] args) {

               // Create Employee objects
               Employee employee1 = new Employee("ishan", 01, 50000);
               Employee employee2 = new Employee("om", 02, 45000);

               // Display details of employees
               System.out.println("=== Employee2 1 ===");
               employee1.displayEmployeeDetails();
               System.out.println("=== Employee 2 ===");
               employee2.displayEmployeeDetails();

           }

       }