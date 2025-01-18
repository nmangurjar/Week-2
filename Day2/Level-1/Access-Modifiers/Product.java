//Create Product class
class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Method to display details of the product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing the Product class
    public static void main(String[] args) {
        // Create instances of the Product class
        Product p1 = new Product("Sony Bravia",24000);
        Product p2 = new Product("Mixer",5000);

        // Display product details
        System.out.println("Details of Product 1:");
        p1.displayProductDetails();

        System.out.println("Details of Product 2:");
        p2.displayProductDetails();

        // Display the total number of products
        Product.displayTotalProducts();
    }
}