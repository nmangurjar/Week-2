
//Create MobilePhone class
class MobilePhone  {

//Create data variables

String brand;
String model;
double price;


//Constructor
MobilePhone(String brand,String model,double price  ){
 this.brand = brand;
  this.model = model;
 this.price = price;
   
 }

//Method to display the MobilePhone details 
 public void displayMobilePhoneDetail(){

        System.out.println("Phone brand : "+brand);
	    System.out.println("Phone Model : "+model);
		System.out.println("Price of phone in INR "+price);        

	   }
       }
	   
	   class PhoneDetails
       {
           public static void main(String[] args) {

              


			  // Create Phone object
               MobilePhone mobilePhone = new MobilePhone("Samsung","Note 8",25999);
              
               // Display the item details
              mobilePhone.displayMobilePhoneDetail();


              

           }

       } 	