package problemstatement.bankingsystem;



interface Loanable {
    void applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}
