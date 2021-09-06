import java.util.*;
public class DecimalToBi{

	public static void main(String[] args) {
		String b="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal Number: ");

		int num=sc.nextInt();
		int temp = num;
		while(temp>0){

			int result = temp % 2;
			temp = temp/2;
			b = result + b;
		}
		System.out.println("The Binary Number is: "+b);
	}
}