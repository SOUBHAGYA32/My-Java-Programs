import java.util.*;
class Product{
	String item_id;
	String item_name;
	double item_price;
	int item_qty;

	double total_price;
	Scanner sc=new Scanner(System.in);

	Product(){} //Default Constructor

	Product(String id, String name, double price, int qty) //Parameterized Constructor
	{
		item_id=id;
		item_name=name;
		item_price=price;
		item_qty=qty;
	}

	public double displayTotal()
	{
		System.out.println("Item ID: "+item_id);
		System.out.println("Item Name: "+item_name);
		System.out.println("Item Price: "+item_price);
		System.out.println("Item Quantity: "+item_qty);
		System.out.println("________________");
		System.out.println("Total Price: ");
		return item_price*item_qty;
	}

}
class Food extends Product{
	String category;
	Food(){}
	Food(String cat,String id, String name, double price, int qty)
	{
		super(id,name,price,qty);
		category=cat;
	}
	void show()
	{
		System.out.println("Item Category: "+category);
	}
}
class Kid extends Product{
	String category;
	Kid(){}
	Kid(String cat,String id, String name, double price, int qty)
	{
		super(id,name,price,qty);
		category=cat;
	}
	void show()
	{
		System.out.println("Item Category: "+category);
	}
}
class Grocery extends Product{
	String category;
	Grocery(){}
	Grocery(String cat,String id, String name, double price, int qty)
	{
		super(id,name,price,qty);
		category=cat;
	}
	void show()
	{
		System.out.println("Item Category: "+category);
	}
}
public class ItemData{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String item_id;
		String item_name;
		double item_price;
		int item_qty;
		String category;
		

		
		int menu;
   		System.out.println("Item Menu");
		System.out.println("1. Food Item");
		System.out.println("2. Grocery Item");
		System.out.println("3. Kid Item");
		System.out.println("4. Exit");
		boolean quit = false;

		do {
			System.out.print("Please Enter Your Choice: ");
			menu = sc.nextInt();
			switch(menu){
				case 1: 
						System.out.println("Enter Item Category: ");
						category=sc.next();

						System.out.println("Enter Item Id: ");
						item_id=sc.next();

						System.out.println("Enter Item Name: ");
						item_name=sc.next();

						System.out.println("Enter Item Per Price: ");
						item_price=sc.nextDouble();

						System.out.println("Enter Quantity of Items: ");
						item_qty=sc.nextInt();

						Food f=new Food(category,item_id,item_name,item_price,item_qty);
						f.show();
						System.out.println(f.displayTotal());
						break;
				case 2: 
						System.out.println("Enter Item Category: ");
						category=sc.next();
						System.out.println("Enter Item Id: ");
						item_id=sc.next();
						System.out.println("Enter Item Name: ");
						item_name=sc.next();
						System.out.println("Enter Item Per Price: ");
						item_price=sc.nextDouble();
						System.out.println("Enter Quantity of Items: ");
						item_qty=sc.nextInt();
						Kid k=new Kid(category,item_id,item_name,item_price,item_qty);
						k.show();
						System.out.println(k.displayTotal());
						break;
				case 3: 
						System.out.println("Enter Item Category: ");
						category=sc.next();
						System.out.println("Enter Item Id: ");
						item_id=sc.next();
						System.out.println("Enter Item Name: ");
						item_name=sc.next();
						System.out.println("Enter Item Per Price: ");
						item_price=sc.nextDouble();
						System.out.println("Enter Quantity of Items: ");
						item_qty=sc.nextInt();
						Grocery g=new Grocery(category,item_id,item_name,item_price,item_qty);
						g.show();
						System.out.println(g.displayTotal());
						break;
				case 4: quit = true;
						break;
			}
		} while (!quit);
	}
}
