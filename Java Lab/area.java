import java.util.Scanner;
public class area{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Area of Triangle");
		System.out.println("4. Area of Square");
		System.out.println("Enter Your Choice in Number(1,2,3,4)");
		int num=sc.nextInt();

		switch(num){
			case 1 : System.out.println("Enter Radious of the Circle");
						double r = sc.nextDouble();
						double Carea = (3.141*r*r);
						System.out.println("The Area of the Circle is " +Carea);
						break;
			case 2: System.out.println("Enter Length:");
					int length=sc.nextInt();
					System.out.println("Enter Breadth:");
					int breadth = sc.nextInt();
					int Rarea = (length*breadth);
					System.out.println("Area of the Rectangle:" +Rarea);
					break;
			case 3:	System.out.println("Enter Base: ");
					double base= sc.nextDouble();
					System.out.println("Enter Height:");
					double height = sc.nextDouble();
					double Tarea=(base*height)/2;
					System.out.println("Area of the Triangle is : "+Tarea);
					break;
			case 4: System.out.println("Enter Side:");
					int side=sc.nextInt();
					int Sarea = (side*side);
					System.out.println("Area of the Square is " +Sarea);
					break;
			default: System.out.println("Sorry You Entered Wrong Choice.. Please Go Back and Enter a Choice."); 


		}
	}
}