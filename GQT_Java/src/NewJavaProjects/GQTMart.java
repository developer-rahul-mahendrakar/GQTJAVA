package NewJavaProjects;

import java.util.Scanner;
class Automobile {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Vehicle Covers and Seat Covers");
		System.out.println("2. GPS Navigators");
		System.out.println("3. Floor Mats");
		System.out.println("4. Puncture Repair Kit"); 
		Automobile a = new Automobile();
		a.choice();
		}
	void choice() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		Automobile a = new Automobile();
		if(choice1 == 1) {
			System.out.println("Vehicle Covers and Seat Covers Details : ");
			a.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("GPS Navigators Details : ");
			a.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Floor Mats Details : ");
			a.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Puncture Repair Kit Details : ");
			a.Product_Details4();
		}
	}		
	void Product_Details1() {
		Automobile a = new Automobile();
		System.out.println("High Quality Vehicle Cover and Seat Covers");
		a.buypage();
	}
	void Product_Details2() {
		Automobile a = new Automobile();
		System.out.println("High Quality GPS Navigators");
		a.buypage();
	}
	void Product_Details3() {
		Automobile a = new Automobile();
		System.out.println("High Quality Floor Mats");
		a.buypage();
	}
	void Product_Details4() {
		Automobile a = new Automobile();
		System.out.println("High Quality Puncture Repair Kit");
		a.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		Automobile a = new Automobile();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			a.Payment();
			}
		else {
			System.out.println("Thank You");
			System.exit(0);
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
			System.exit(0);
		}
	}
}
class Electronics {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Mobile Phones");
		System.out.println("2. Televisions");
		System.out.println("3. Computers");
		System.out.println("4. Fans");
		Electronics e = new Electronics();
		e.choice();
		}
	void choice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		Electronics e = new Electronics();
		if(choice1 == 1) {
			System.out.println("Mobile Phone Details : ");
			e.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Televisions Details : ");
			e.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Computers Details : ");
			e.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Fans Details : ");
			e.Product_Details4();
		}
	}		
	void Product_Details1() {
		Electronics e = new Electronics();
		System.out.println("High Quality Mobile Phone");
		e.buypage();
	}
	void Product_Details2() {
		Electronics e = new Electronics();
		System.out.println("High Quality Televisions");
		e.buypage();
	}
	void Product_Details3() {
		Electronics e = new Electronics();
		System.out.println("High Quality Computers");
		e.buypage();
	}
	void Product_Details4() {
		Electronics e = new Electronics();
		System.out.println("High Quality Fans");
		e.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		Electronics e = new Electronics();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			e.Payment();
			}
		else {
			System.out.println("Thank You");
			System.exit(0);
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
			System.exit(0);
		}
	}
}
class Clothings {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Shirts");
		System.out.println("2. Trousers");
		System.out.println("3. Hoodies");
		System.out.println("4. Sweaters");
		Clothings c = new Clothings();
		c.choice();
		}
	void choice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		Clothings c = new Clothings();
		if(choice1 == 1) {
			System.out.println("Shirts Details : ");
			c.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Trousers Details : ");
			c.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Hoodies Details : ");
			c.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Sweaters Details : ");
			c.Product_Details4();
		}
	}		
	void Product_Details1() {
		Clothings c = new Clothings();
		System.out.println("High Quality Shirts");
		c.buypage();
	}
	void Product_Details2() {
		Clothings c = new Clothings();
		System.out.println("High Quality Trousers");
		c.buypage();
	}
	void Product_Details3() {
		Clothings c = new Clothings();
		System.out.println("High Quality Hoodies");
		c.buypage();
	}
	void Product_Details4() {
		Clothings c = new Clothings();
		System.out.println("High Quality Sweaters");
		c.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		Clothings c = new Clothings();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			c.Payment();
			}
		else {
			System.out.println("Thank You");
			System.exit(0);
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
			System.exit(0);
		}
	}
}
class HouseholdItems {
	int auto_choice=0;
	void list() {
		System.out.println("Fetching Available Items");
		System.out.println("1. Utensils");
		System.out.println("2. Furnitures");
		System.out.println("3. Carpets");
		System.out.println("4. Detergents");
		HouseholdItems h = new HouseholdItems();
		h.choice();
		}
	void choice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice1 = sc.nextInt();
		HouseholdItems h = new HouseholdItems();
		if(choice1 == 1) {
			System.out.println("Utensils Details : ");
			h.Product_Details1();
		}
		if(choice1 == 2) {
			System.out.println("Furnitures Details : ");
			h.Product_Details2();
		}
		if(choice1 == 3) {
			System.out.println("Carpets Details : ");
			h.Product_Details3();
		}
		if(choice1 == 4) {
			System.out.println("Detergent Details : ");
			h.Product_Details4();
		}
	}		
	void Product_Details1() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("High Quality Utensils");
		h.buypage();
	}
	void Product_Details2() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("High Quality Furnitures");
		h.buypage();
	}
	void Product_Details3() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("High Quality Carpets");
		h.buypage();
	}
	void Product_Details4() {
		HouseholdItems h = new HouseholdItems();
		System.out.println("High Quality Detergents");
		h.buypage();
	}
	void buypage() {
		System.out.println("Do You want to Buy this Product ?, Say Y or N ");
		HouseholdItems h = new HouseholdItems();
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			h.Payment();
			}
		else {
			System.out.println("Thank You");
			System.exit(0);
		}
	}
	void Payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Make your Payment.  Y or N ");
		String st=sc.next();
		if(st.equalsIgnoreCase("Y")) {
			System.out.println("You Purchased this item");
			}
		else {
			System.out.println("Payment Unsuccessful you did not Purchase the Product");
			System.exit(0);
		}
	}
}
	
public class GQTMart {
	public static void main(String[] args) {
		System.out.println("Welcome to GQT Shopping Mart");
		System.out.println("Available Product Categories are : ");
		System.out.println("1. Automobile Accessories 2. Electronics Gadgets 3. Clothing 4. Household items");
		System.out.println("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice1 = sc.nextInt();
		if (choice1==1) {
			System.out.println("Welcome to the world of Automobiles");
			Automobile a = new Automobile();
			a.list();
	}
		else if (choice1==2) {
			System.out.println("Welcome to the world of Electronics");
			Electronics e = new Electronics();
			e.list();
			
		}
		else if (choice1==3) {
			System.out.println("Welcome to the world of Fashion and Styling");
			Clothings c = new Clothings();
			c.list();
	}
		else if (choice1==4) {
			System.out.println("Welcome to the world of Household Items");
			HouseholdItems h = new HouseholdItems();
			h.list();
		}
	}
}
