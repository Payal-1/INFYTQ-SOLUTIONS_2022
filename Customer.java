package com.infy;

class Customer {
    private String customerId;
	private String customerName;
	private long contactNumber;


	public String getcustomerId() {
		return customerId;
	}
		public void setcustomerId(String customerId) {
		
		this.customerId = customerId;
	}	
	public String getcustomerName() {
		return customerName;
	}	
	public void setcustomerName(String customerName) {
		
		this.customerName = customerName;
	}	
	public long getcontactNumber() {
		return  contactNumber;
	}	
	public void setcontactNumber(long  contactNumber) {
		
		this.contactNumber = contactNumber;
	}

		public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " +add);
		System.out.println();
		}
		public  void  payBill(double totalPrice, double discountPercentage) 
		{
			System.out.println("Calculating final amount to be paid......");
			double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
			System.out.println("Hi " + customerName+ ", your final bill amount after discount is: " + (int) (priceAfterDiscount * 100) / 100.0);
		}

	}


class Address{
	
	private String doorNo;
	private String streetNo;
	private String city;
	private String zipcode;
	
	public Address(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public String getdoorNo() {
		return doorNo;
	}
	
	public void setdoorNo(String doorNo) {
	 this.doorNo=doorNo;	
	}
	
	public String getstreetNo() {
		return streetNo;
	}
	
	public void setstreetNo(String streetNo) {
	 this.streetNo = streetNo;	
	}
	
	public String getcity() {
		return city;
	}
	
	public void setcity(String city) {
	 this.city = city;	
	}
	

	public String getzipcode() {
		return zipcode;
	}
	
	public void setzipcode(String zipcode) {
	 this.zipcode =zipcode;	
	}
	
	public void Addresss(String doorNo, String streetNo, String city, String zipcode) {
		this.doorNo=doorNo;
		 this.streetNo = streetNo;
		 this.city = city;	
		 this.zipcode =zipcode;
		 System.out.println("Door no : ");
		 System.out.println("Street no : ");
		 System.out.println("City : "); 
		 System.out.println("ZIPCODE : ");
		 
	}
	
	
	}





class Food {
	
	private String foodName;
	private String cuisine;
	private String foodType;
	private int quantityAvailable;
	private double unitPrice;
	public String getfoodName()
	
	{
		return foodName;
	}
	
	public void setfoodName(String foodName) {
		this.foodName=foodName;
	} 

	public String getcuisine()
	
	{
		return cuisine;
	}
	
	public void setcuisine(String cuisine) {
		this.cuisine=cuisine;
	} 
	
    public String getfoodType()
	
	{
		return foodType;
	}
	
	public void setfoodType(String foodType) {
		this.foodType=foodType;
	} 
		
	public int getquantityAvailable()
	
	{
		return quantityAvailable;
	}
	
	public void setquantityAvailable(int quantityAvailable) {
		this.quantityAvailable=quantityAvailable;
	} 
    public double unitPrice()
	
	{
		return unitPrice;
	}
	
	public void setunitPrice(double  unitPrice) {
		this.unitPrice=unitPrice;
	} 	
	public void displayFoodDetails() {
		
		System.out.println("Displaying Food details \n***************************");
		System.out.println("FOODNAME: "+ foodName);
		System.out.println("Cuisine: " + cuisine);
		System.out.println("FoodType: " + foodType);
		System.out.println("Food Quantity AVAILABLE: " +quantityAvailable);
		System.out.println("UnitPrice: " + unitPrice);
		
	}
}

class Tester {

	public static void main(String[] args) {

		// Object creation
		Customer customer = new Customer();

		// Assigning values to the instance variables
		customer.setcustomerId("C101");
		customer.setcustomerName("Stephen Abram");
		customer.setcontactNumber(7856341287L);
		
		// Displaying the customer details
		customer.displayCustomerDetails();
		customer.payBill(500, 10);
		// Move the above statement immediately after the object creation
		// statement and observe the output
				
		Food obj1 = new Food();
		obj1.setfoodName( "GulabJamun");
		obj1.setcuisine ( "Sugarfree");
		obj1.setfoodType("Veg");
		obj1.setquantityAvailable(5);
		obj1.setunitPrice(50);
		obj1.displayFoodDetails();
		
		
	}

}