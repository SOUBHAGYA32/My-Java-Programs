import java.util.*;
class ItemData{

	int item_code;
	String item_name;
	double item_price;
	int item_qty;
	double total_price;
	Scanner sc=new Scanner(System.in);

	//Get the Item Data by the User
	public void getItemData()
	{
		System.out.println("Enter Item Code: ");
		item_code=sc.nextInt();

		System.out.println("Enter Item Name: ");
		item_name=sc.next();

		System.out.println("Enter Item Price in Rs: ");
		item_price=sc.nextDouble();

		System.out.println("Enter Item Quantity: ");
		item_qty=sc.nextInt();

		CalculateData();
	}
	public void CalculateData()
	{
		total_price = item_price * item_qty;
	}
	public void displayData()
	{
		System.out.println("Item Code: "+item_code);
		System.out.println("Item Name : "+item_name);
		System.out.println("Item Price in Rs : "+item_price);
		System.out.println("Item Quantity: "+item_qty);
		System.out.println("-------------------------------");
		System.out.println("Total Price : "+total_price+"/-");
	} 
	
}
public class ItemDetails{
	public static void main(String[] args) {
		ItemData item1=new ItemData();
		item1.getItemData();
		item1.displayData();
	}
}

