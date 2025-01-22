import java.util.ArrayList;
import java.util.List;

//Create Customer class 
class Customer {
    String name;
    double balance;

    // Constructor 
    public Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    // Method to view the balance of the customer
    public void viewBalance() {
        System.out.println(name + "'s account balance: INR" + balance);
    }

    }
    



// Bank class
class Bank {
    String bankName;
    List<Customer> customers;

    // Constructor 
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account 
    public void openAccount(Customer customer, double initialBalance) {
        customer.balance = initialBalance;  
        customers.add(customer);           
        System.out.println("Account opened for " + customer.name + " at " + this.bankName + " with initial balance $" + initialBalance);
    }
}


public class BankDetail{
    public static void main(String[] args) {
        // Creating a bank object
        Bank bankOfBaroda= new Bank("Bank of America");

        // Creating customer
        Customer Naman = new Customer("Naman");
        Customer ishan = new Customer("Ishaan");

        // Opening accounts for customers at the bank
        bankOfBaroda.openAccount(Naman, 500);
        bankOfBaroda.openAccount(ishan, 1000);

        // Viewing balances of individual accounts
        Naman.viewBalance();
        ishan.viewBalance();
    }
}
