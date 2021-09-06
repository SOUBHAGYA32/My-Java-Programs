import java.util.Scanner;
public class GreatestAmongThree{

	public static int isGreat(int x, int y, int z)
	{
		if(x > y && x>z)
		{
			return x;
		}
		else if(y>x && y>z)
		{
			return y;
		}
		else{
			return z;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter First Number: ");
		x=sc.nextInt();
		System.out.println("Enter Second Number: ");
		y=sc.nextInt();
		System.out.println("Enter Third Number: ");
		z=sc.nextInt();

		int result=isGreat(x,y,z);
		System.out.println("Greatest Number is "+result);
	}
}