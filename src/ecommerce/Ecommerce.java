package ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {
	public static void main(String[] args) {
		Welcome obj = new Welcome();
		obj.welcome();
	}
}

class UserDetails
{
	String username;
	String password;
	String address;
	long phoneNo;
	
	public UserDetails(String username,String password,String address,long phoneNo)
	{
		this.username=username;
		this.password=password;
		this.address=address;
		this.phoneNo=phoneNo;
	}
}
class Welcome
{
	UserDetails userObj ;
	Scanner sc = new Scanner(System.in);
	static{
		System.out.println("**WELCOME TO E-SHOPPING**");
		
	}
	public void welcome()
	{
		for(;;)
		{
			System.out.println();
			System.out.println("1. Create a new Account");
			System.out.println("2. Existing User");
			System.out.println("3. Exit");
			System.out.print("Enter Option: ");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				createAccount();
				break;
			}
			case 2:
			{
				loginUser();
				break;
			}
			case 3:
			{
				System.out.println("Thank Youuuuu!!!!");
				System.exit(0);
			}
			default:
				System.out.println("Please enter correct option !");
			}
		}
	}
	public void createAccount()
	{
		System.out.println();
		System.out.println("**ACCOUNT CREATION MODULE**");
		sc.nextLine();
		System.out.print("Enter your username: ");
		String username = sc.nextLine();
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		System.out.print("Enter your address: ");
		String address = sc.nextLine();
		System.out.print("Enter your phone no: ");
		long phoneNo = sc.nextLong();
		
		userObj = new UserDetails(username, password, address, phoneNo);
	}
	public void loginUser()
	{
		if (userObj==null) {
			System.out.println("Create your account first !");
			return ;
		}
		sc.nextLine();
		for(int i=3;i>0;i--)
		{
			System.out.println();
			System.out.println("*LOGIN MODULE*");
			System.out.print("Enter userame: ");
			String username = sc.nextLine();
			System.out.print("Enter password: ");
			String password=sc.nextLine();
			
			if (userObj.username.equals(username) && userObj.password.equals(password)) {
				HomePage hp = new HomePage();
				hp.categories();
			}
			else
			{
				System.out.println("Invalid Credentials !");
				System.out.println("Attempts left are: "+(i-1));
			}
		}
	}
}

class HomePage
{
	ArrayList<Product> cart = new ArrayList();
	Scanner sc = new Scanner(System.in);
	public void categories()
	{
		System.out.println();
		System.out.println("///*START YOUR SHOPPING HERE////*");
		for(;;)
		{
			System.out.println();
			System.out.println("------Shop By Categories------");
			System.out.println("1. Clothes\n2. Foowear\n3. Electronics\n4. CheckOut\n5. Logout");
			System.out.print("Enter your option: ");
			int option = sc.nextInt();
			switch (option) {
			case 1: 
			{
				clothes();
				break;
			}
			case 2:
			{
				footwear();
				break;
			}
			case 3:
			{
				electronics();
				break;
			}
			case 4:
			{
				checkOut();
				break;
			}
			case 5:
			{
				logOut();
				break;
			}
			default:
			{
				System.out.println("Enter correct option !");
			}
		}
	}
}
	public void clothes()
	{
		String[] clothes = {"1) Shirt(101): 1050 Rs.","2) Jeans(102): 1200 Rs.","3) Tshirt(103): 750 Rs." };
		System.out.println();
		System.out.println("**Clothes Section**");
		for(;;)
		{
			for(String s:clothes)
			{
				System.out.println(s);
			}
			System.out.println("Enter 0 to exit");
			System.out.print("Enter option: ");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				cart.add(new Product(101, "Shirt", 1050.00));
				break;
			}
			case 2:
			{
				cart.add(new Product(102, "Jeans", 1200.00));
				break;
			}
			case 3:
			{
				cart.add(new Product(103, "TShirt", 750.00));
				break;
			}
			case 0:
			{
				return ;
			}
			default:
			{
				System.out.println("Enter correct option !");
				break;
			}
			}
		}
	}
	public void footwear()
	{
		String[] str = {"1) Shoes(104): 1699.00 Rs.","2) Crocs(105): 999.00 Rs.","3) FlipFlop(106): 850.00 Rs."};
		System.out.println();
		System.out.println("*FOOTWEAR SECTION*");
		for(;;)
		{
			for(String s:str)
			{
				System.out.println(s);
			}
			System.out.println("Enter 0 to exit");
			System.out.print("Enter option: ");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
			{
				cart.add(new Product(104, "Shoes", 1699.00));
				break;
			}
			case 2:
			{
				cart.add(new Product(105, "Crocs", 999.00));
				break;
			}
			case 3:
			{
				cart.add(new Product(106, "FlipFlop", 850.00));
				break;
			}
			case 0:
			{
				return ;
			}
			default:
			{
				System.out.println("Enter correct option !");
				break;
			}
			}
		}
	}
	public void electronics()
	{
		String[] str = {"1) Mobile(107): 16999.00 Rs.","2) TV(108): 99999.00 Rs.","3) Washing Machine(109): 18500.00 Rs."};
		System.out.println();
		System.out.println("*ELECTRONICS SECTION*");
		for(;;)
		{
			for(String s:str)
			{
				System.out.println(s);
			}
			System.out.println("Enter 0 to exit");
			System.out.print("Enter option: ");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
			{
				cart.add(new Product(107, "Mobile", 16999.00));
				break;
			}
			case 2:
			{
				cart.add(new Product(108, "TV", 99999.00));
				break;
			}
			case 3:
			{
				cart.add(new Product(109, "Washing Machine", 18500.00));
				break;
			}
			case 0:
			{
				return ;
			}
			default:
			{
				System.out.println("Enter correct option !");
				break;
			}
			}
		}
	}
	public void checkOut()
	{
		if (cart.isEmpty()) {
			System.out.println("---> 0 items presents");
			System.out.println("You didn't add any item in cart ! ");
		}
		else
		{
			Collections.sort(cart);
			System.out.println();
			System.out.println("------>>CART ITEMS<<------");
			for(Product p:cart)
			{
				System.out.println(p);
			}
			bill();
		}
	}
	public void bill()
	{
		double totalBill = 0;
		for(Product p:cart)
		{
			totalBill += p.price;
		}
		System.out.println();
		System.out.println("Your total amount of items in cart: "+totalBill);
	}
	public void logOut()
	{
		System.out.println();
		System.out.println("^^^^^^^^^^^^THANK YOUR & VISIT AGAIN^^^^^^^^^^^^^^^^");
		Welcome obj = new Welcome();
		obj.welcome();
	}
}
class Product implements Comparable<Product>
{
	int pid;
	String pname;
	double price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public int compareTo(Product o)
	{
		if (this.pid<o.pid) {
			return -1;
		}
		else if(this.pid>o.pid)
		{
			return 1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return pid+" "+pname+" "+price;
	}
	
	
}