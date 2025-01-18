import java.util.Scanner;

//Create circle class
public class Circle {

//Create data variables

    double radius;

    //Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    //Default Constructor
    Circle() {
      this(21);

    }

    //Method to calculate the area of the circle
    public double calculateArea() {

        return Math.PI * Math.pow(radius, 2);


    }

    //Method to calculate the circumference of the circle
    public double calculateCircumference() {

        return 2 * Math.PI * radius;


    }

//Method to  display the area and circumference of the circle.

    public void displayAreaAndCircumference() {

        System.out.println("Area of circle :  " + calculateArea());
        System.out.println("Circumference of circle :  " + calculateCircumference());


    }
}

class CircleDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take user input
        int radius = input.nextInt();

        // Create Circle objects
        Circle circle1 = new Circle(radius);
        Circle circle2 = new Circle();

        // Display the area and circumference of the circle.
        System.out.println("=== Circle 1 ===");
        circle1.displayAreaAndCircumference();
        System.out.println("=== Circle 2 ===");
        circle2.displayAreaAndCircumference();


    }

}