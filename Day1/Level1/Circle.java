
//Create circle class
public class Circle{

//Create data variables

double radius;

//Constructor
Circle(double radius ){
 this.radius = radius;
 }

//Method to calculate the area of the circle
 public double calculateArea(){
    
	   return Math.PI*Math.pow(radius,2);
        

	   }
	  
//Method to calculate the circumference of the circle
 public double calculateCircumference(){
    
	   return 2*Math.PI*radius;
        

	   }
	   
//Method to  display the area and circumference of the circle.

 public void displayAreaAndCircumference(){

        System.out.println("Area of circle :  "+calculateArea());
		 System.out.println("Circumference of circle :  "+calculateCircumference());
        

	   }
       }
	   
	   class CircleDetails
       {
           public static void main(String[] args) {

               // Create Circle objects
               Circle circle1 = new Circle(12);
               Circle circle2 = new Circle(14);

               // Display the area and circumference of the circle.
               System.out.println("=== Circle 1 ===");
              circle1.displayAreaAndCircumference();
               System.out.println("=== Circle 2 ===");
			   circle2.displayAreaAndCircumference();
              

           }

       }