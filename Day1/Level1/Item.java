
//Create Item class
class Item {

//Create data variables

String itemCode;
String itemName;
double price;
int quantity;

//Constructor
Item(String itemCode,String itemName,double price ,int quantity  ){
 this.itemCode = itemCode;
  this.itemName = itemName;
 this.price = price;
   this.quantity = quantity;
 

 }

//calculate the total cost for a given quantity

 public double totalCost(){

       return price*quantity;

	   }


//Method to display the item details 
 public void displayBookDetail(){

        System.out.println("Item Code : "+itemCode);
	    System.out.println("Item Name : "+itemName);
		System.out.println("Price of item in INR "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Total price in INR  : "+totalCost());
        

	   }
       }
	   
	   class Itemdetails
       {
           public static void main(String[] args) {

              


			  // Create Item object
               Item item1 = new Item("A-101","Tea",200,10);
              
               // Display the item details.

              item1.displayBookDetail();


              

           }

       } 	