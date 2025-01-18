//Create Book class
class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Methods to get and set the author name
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass EBook
class EBook extends Book {

    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("343-566-676", "Good Notes ", "Harry");
        ebook.displayDetails();

        // Get And set the author
        ebook.setAuthor("George witch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}