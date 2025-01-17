import java.util.Scanner;
//Create BankAccount  class
class BankAccount   {

//Create data variables

String accountHolder;
int accountNumber;
double balance;


//Constructor
Student(String accountHolder,int accountNumber, double balance ){
 this.accountHolder = accountHolder;
  this.accountNumber = accountNumber;
 this.balance = balance;
   
 }

//Method for Depositing money
 public void depositMoney(double amount){

       System.out.println("Amount deposited : INR "+amount);
       balance =  balance + amount ;
	   
	   
 //Method for withdrawing money
 public void withdrawMoney(double amount){

        System.out.println("Amount debited : INR "+amount);
		if(balance > amount ){
	   balance =  balance - amount ;
	   }else{
	    System.out.println("Not Enough balance");
       }
	   
	
	//Method to display current balance 
 public void displayCurrentBalance(){

        System.out.println("Current balance : "+balance);

	   }
	   
       }
	   
	   class BankDetails
       {
           public static void main(String[] args) {

             //Create scanner object
              Scanner input = new Scanner(System.in);
			  
			  //Take input from user
			  System.out.println("Enter Name of Account holder: ");
			  String name = input.nextLine();
			  
			  System.out.println("Enter Account Number : ");
			 int accountNumber = input.nextInt();
			 
			  System.out.println("Enter Marks : ");
			  double balance = input.nextInt();
			  
			  // Create Student object
              BankAccount bankAccount = new BankAccount(name,accountNumber,balance);
			  
			  System.out.println("Choose option 1 or 2 : \n 1. Deposit \n 2. Withdrawal \n 3. Show Current balance : ");
			  int option = input.nextInt();
			  
			  if(option == 1){
			  System.out.println("Enter Deposit amount :");
			  double deposit = input.nextDouble();
			   bankAccount.depositMoney(deposit);
			   }
			   else if(option == 2){
			  System.out.println("Enter debit amount :");
			  double debit = input.nextDouble();
			   bankAccount.withdrawMoney(debit);
			   }
			   else if(option == 3){
			   bankAccount.displayCurrentBalance();
			   }
			   else{
			   System.out.println("Invalid Option");
			   }
			  
			 
               // Display the Student details
			   System.out.println("Your current Balance is :");
              bankAccount.displayCurrentBalance();


              

           }

       } 	