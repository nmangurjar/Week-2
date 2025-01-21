//Create BankAccount class
public class BankAccount {

    // Static variable s
    static String bankName = "Canara Bank";
    static int totalAccounts = 0;

    // Final variable 
    final String accountNumber;

    // Instance variables 
    String accountHolderName;
    double balance;

    // Constructor 
    public BankAccount(String accountHolderName, double balance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: INR" + balance);
    }

    // Static method to check if the object is an instance of BankAccount 
    public static boolean isBankAccount(Object obj) {
        return obj instanceof BankAccount;
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Creating object of BankAccount
        BankAccount account1 = new BankAccount("Anant Ambani", 1000, "Ab101");
        BankAccount account2 = new BankAccount("Jeet Adani", 2000, "BA1002");

       
        if (isBankAccount(account1)) {
            account1.displayAccountDetails();
        } 

        // Displaying the total number of accounts
        System.out.println("Total Accounts in the bank: " + getTotalAccounts());

       
    }
}
