package problemstatement.bankingsystem;


//
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("101", "Aman", 10055));
        accounts.add(new CurrentAccount("292", "Naman", 20055, 654));

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Balance: $" + account.getBalance());
            System.out.println("Interest Earned: $" + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000.0);
                System.out.println("Loan Eligibility: INR" + loanable.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}
