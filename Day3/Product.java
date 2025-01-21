
//Create Product class
class Product {

    // Static variable 
    static double discount = 10;
    // Final variable 
    final int productID;

    // Instance variables 
    String productName;
    double price;
    int quantity;

    // Constructor to initialize product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details and apply discount
    public void displayProductDetails() {
        double discountedPrice = price - (price * discount / 100);
        double totalPrice = discountedPrice * quantity;
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: INR" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Price per Item: INR" + discountedPrice);
        System.out.println("Total Price after discount: INR" + totalPrice);

    }


    public static void main(String[] args) {
        // Creating product objects
        Product prod1 = new Product(101, "Laptop", 1000, 2);
        Product prod2 = new Product(102, "phone", 500, 3);

        // Displaying product details before updating discount
        System.out.println("Before updating discount:");
        prod1.displayProductDetails();
        prod2.displayProductDetails();

        // Updating the discount percentage
        Product.updateDiscount(15);

        // Displaying product details 
        System.out.println("After updating discount:");

        if (prod1 instanceof Product) {
            prod1.displayProductDetails();
        }

        if (prod2 instanceof Product) {
            prod2.displayProductDetails();
        }


    

 }}