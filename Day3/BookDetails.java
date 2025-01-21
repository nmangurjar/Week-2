class Book {
    //Static variable
    static String libraryName = "Ishaan Book Depot" ;
    String title;
    String author;

    //Final variable
    final String isbn ;


    //Constructor
    Book(String title , String author , String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    //Static method  to print the library name.

    public static void displayLibraryName(){

        System.out.println("Library : "+libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        // Check if the current object is an instance of the Book class
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }


    public static void main(String[] args) {

        // Create Circle objects
        Book book1 = new Book("Millionare","Adam","2450");

        // Display  he book details.
        System.out.println("=== Book Deatils ===");
        book1.displayBookDetails();



    }

}