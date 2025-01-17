import java.util.Scanner;
//Create Student class
class Student  {

//Create data variables

String name;
int rollNumber;
int marks;


//Constructor
Student(String name,int rollNumber, int marks ){
 this.name = name;
  this.rollNumber = rollNumber;
 this.marks = marks;
   
 }

//Method to calculate the grade based on the marks
 public String calculateGrade(){

               if(marks >=90){
			   return "A+" ;
			   }
			   else if ( marks < 90 && marks >= 80 ){
			   return "A" ;
			   }
			   else if ( marks < 70 && marks >= 60 ){
			   return "B" ;
			   }
			     else if ( marks < 60 && marks >= 50 ){
			   return "C+" ;
			   }
			     else if ( marks < 50 && marks >= 33 ){
			   return "C" ;
			   }
			   else {
			   return "Fail" ;}

	   }
	
	//Method to display the Student details 
 public void displayStudentDetails(){

        System.out.println("Name : "+name);
	    System.out.println("Roll-Number : "+rollNumber);
		System.out.println("Marks : "+marks); 
        System.out.println("Grade : "+calculateGrade()); 		

	   }
	   
       }
	   
	   class Details
       {
           public static void main(String[] args) {

             //Create scanner object
              Scanner input = new Scanner(System.in);
			  
			  //Take input from user
			  System.out.println("Enter Name : ");
			  String name = input.nextLine();
			  
			  System.out.println("Enter Roll-Number : ");
			 int rollNumber = input.nextInt();
			 
			  System.out.println("Enter Marks : ");
			  int marks = input.nextInt();


			  // Create Student object
              Student student = new Student(name,rollNumber,marks);
              
               // Display the Student details
              student.displayStudentDetails();


              

           }

       } 	