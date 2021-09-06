import java.util.*;
public class BinaryToDec{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary Number: ");
		int num = sc.nextInt();
		int t=num;
		int i=0, d=0;
		while(t>0){
			int result = t%10;
			t=t/10;
			d=d+ result * (int)Math.pow(2, i++);
		}
		System.out.println("The Decimal Number is "+d);
	}
}