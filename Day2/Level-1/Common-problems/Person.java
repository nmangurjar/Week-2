
//Create Person class
public class Person{

//Create data variables

  String name;
  int age;
  

//Parameterized Constructor
Person(String name , int age ){
 this.name = name;
 this.age = age;
 }
 
 //Copy Constructor
Person(Person lastPerson){
 this.name = name;
 this.age = age;
 }
	   
//Method to  display the details

 public void display(){

        System.out.println("Name :  "+name);
		 System.out.println("age :  "+age);
        

	   }
       }
	   
	   class PersonDetails
       {
           public static void main(String[] args) {

               // Create Circle objects
              Person p1 = new Person("Om",22);
               Person p2  = new Person(p1);

               // Display the area and circumference of the circle.
               System.out.println("=== Person 1 ===");
              p1.display();
               System.out.println("=== Person 2 ===");
			   p1.display();
              

           }

       }