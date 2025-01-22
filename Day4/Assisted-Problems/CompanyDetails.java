import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String departmentName;
    private List<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add employee to department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Getter
    public List<Employee> getEmployees() {
        return employees;
    }

    // Getter
    public String getDepartmentName() {
        return departmentName;
    }


}

// Company class
class Company {
    private String companyName;
    private List<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Getter
    public List<Department> getDepartments() {
        return departments;
    }

   
    // Destructor to simulate cleanup
    public void cleanup() {
        // Explicitly cleaning up departments and employees
        System.out.println("Deleting company " + companyName + " and all its departments and employees.");
        for (Department dept : departments) {
            System.out.println("Deleting department " + dept.getDepartmentName() + " and its employees.");
        }
    }
  

    // Getter
    public String getCompanyName() {
        return companyName;
    }
}

// Main class to test the composition
class CompanyDetails {
    public static void main(String[] args) {
        // Create company object
        Company company = new Company("Tech Innovators Inc.");

        // Create departments
        Department d1 = new Department("Management");
        Department d2 = new Department("HR");

        // Add employees to the  department
        d1.addEmployee(new Employee("Naman"));
        d1.addEmployee(new Employee("Gurjar"));

        // Add employees to the  department
        d2.addEmployee(new Employee("Ishaan"));
        d2.addEmployee(new Employee("Om"));

        // Add departments to the company
        company.addDepartment(d1);
        company.addDepartment(d2);

        // Display company and its departments
        System.out.println("Company: " + company.getCompanyName());
        for (Department dept : company.getDepartments()) {
            System.out.println("Department: " + dept.getDepartmentName());
            for (Employee emp : dept.getEmployees()) {
                System.out.println("Employee: " + emp.getName());
            }
        }

      //delete
        company.cleanup();
    }
}
