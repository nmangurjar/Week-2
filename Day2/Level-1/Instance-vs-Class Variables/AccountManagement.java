//Create BankAccount class
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Methods to get and set balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("5982100800", "Naman", 24000, 5);
        account.displayDetails();

        //Set And get balance
        account.setBalance(34000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}