import java.util.ArrayList;
import java.util.List;

// Create book class
class Book {
     String title;
     String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
     String libraryName;
     List<Book> books;

    // Constructor 
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books
    public void displayLibraryBooks() {
        System.out.println("Books in " + libraryName + ":");
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}


public class LibraryDetail {
    public static void main(String[] args) {
        // Creating book cobject
        Book book1 = new Book("Mahabharata", "Shree krishna");
        Book book2 = new Book("Ramyana", "Valmiki");
        Book book3 = new Book("The pandavas", "Kabirdas");
     
        // Creating libraries
        Library l1 = new Library("Central Library");
        Library l2 = new Library("Indian Library");

        // Adding books to the libraries
        l1.addBook(book1);
        l2.addBook(book2);
        l1.addBook(book3);
     
        // Display books 
        l1.displayLibraryBooks();
        l2.displayLibraryBooks();
    }
}
