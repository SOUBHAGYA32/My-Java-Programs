import java.util.*;
class Product{
	String pid;
	String pname;
	double costPrice;
	double price;
	int qty;
	double total_price=0;
	double gst=0;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Product Id: ");
		pid=sc.next();
		System.out.println("Enter Product Name: ");
		pname = sc.next();
		System.out.println("Enter Product MRP : ");
		costPrice = sc.nextDouble();
		System.out.println("Enter Product Selling Price: ");
		price = sc.nextDouble();
		System.out.println("Enter Product Quantity : ");
		qty = sc.nextInt();

	}
	void getGST()
	{
		System.out.println("Item ID: "+pid);
		System.out.println("Item Name: "+pname);
		System.out.println("Item Cost Price: "+costPrice);
		System.out.println("Item Selling Price : "+price);
		System.out.println("Item Quantity: "+qty);
		System.out.println("________________");
		total_price = qty * price;
		gst = ((price-costPrice)*100)/costPrice;
		System.out.println("Total Price: "+total_price);
		System.out.println("GST : "+gst);
		System.out.println("Total Price including GST: "+(gst+total_price));
	}
}
class Electronics extends Product{
	String ptype;

	void getData()
	{
		System.out.println("Enter Product Type: ");
		ptype = sc.next();
	}
	void getGST()
	{
		System.out.println("The Product Type is : "+ptype);
	}

}
class Medicine extends Product{
	String ptype;

	void getData()
	{
		System.out.println("Enter Product Type: ");
		ptype = sc.next();
	}
	void getGST()
	{
		System.out.println("The Product Type is : "+ptype);
	}
}
class Grocery extends Product{
	String ptype;

	void getData()
	{
		System.out.println("Enter Product Type: ");
		ptype = sc.next();
	}
	void getGST()
	{
		System.out.println("The Product Type is : "+ptype);
	}
}
class ProductTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p1= new Product();
		Electronics e1= new Electronics();
		Medicine m1=new Medicine();
		Grocery g1=new Grocery();
		Product obj;
	
		int menu;
   		System.out.println("Product Menu");
		System.out.println("1. Electronics ");
		System.out.println("2. Grocery ");
		System.out.println("3. Medicine ");
		System.out.println("4. Exit");
		boolean quit = false;
		do{
			System.out.print("Please Enter Your Choice: ");
			menu = sc.nextInt();
			switch(menu){
				case 1: obj=e1;
						obj.getData();
						obj.getGST();

						obj = p1;
						obj.getData();
						obj.getGST();
						break;
				case 2: obj=g1;
						obj.getData();
						obj.getGST();

						obj = p1;
						obj.getData();
						obj.getGST();
						break;
				case 3: obj=m1;
						obj.getData();
						obj.getGST();

						obj = p1;
						obj.getData();
						obj.getGST();
						break;
				case 4: quit = true;
						break;
			}
		}while(!quit);
	}
}