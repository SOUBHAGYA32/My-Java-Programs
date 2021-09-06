import java.util.*;
class Item{
	String item_code;
	String item_name;
	double item_price;
	int item_qty;
	double total_price;

	Item(){} //Default Constructor

	Item(String code, String name, double price, int qty)//Parameterized Constructor
	{
		item_code=code;
		item_name=name;
		item_price=price;
		item_qty=qty;
	}

	public double calculateTotal(double price, int qty)
	{
		total_price = price*qty;
		return total_price; 
	}
	void display()
	{
		
		System.out.println("Item Code: "+item_code);
		System.out.println("Item Name : "+item_name);
		System.out.println("Item Price in Rs : "+item_price);
		System.out.println("Item Quantity: "+item_qty);
		System.out.println("-------------------------------");
		double total= calculateTotal(item_price,item_qty);
		System.out.println("Total Price : "+total+"/-");
	}
}
public class ItemData{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item Code: ");
		String item_code=sc.next();

		System.out.println("Enter Item Name: ");
		String item_name=sc.next();

		System.out.println("Enter Item Price in Rs: ");
		double item_price=sc.nextDouble();

		System.out.println("Enter Item Quantity: ");
		int item_qty=sc.nextInt();

		Item obj=new Item(item_code,item_name,item_price,item_qty);
		obj.display();
	}
}