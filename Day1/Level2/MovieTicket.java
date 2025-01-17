
//Create MovieTicket  class
public class MovieTicket {
    //Create data variables
    String movieName;
     int seatNumber;
     double price;

    // Constructor to initialize the movie ticket
	
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;  
        this.price = 0;
    }

    // Method to book a ticket 
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked for "+movieName +" with seat number " +seatNumber+" at INR" + price);
    }

    // Method to display ticket details
    public void displayTicket() {
        
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: INR" + price);
      
    }

    public static void main(String[] args) {
       
	   //Create MovieTicket object
        MovieTicket ticket1 = new MovieTicket("Inception");
		//Book ticket
        ticket1.bookTicket(12, 15.50);
		
		//Display the details
        ticket1.displayTicket();

       
    }
}
