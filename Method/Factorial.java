import java.util.*;
public class Factorial{
	public static void Fact(int num){
		int f=1;
		for (int i=1;i<=num ;i++ ) {
			f=f*i;
		}
		System.out.print("Factorial of "+num+" is: "+f);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number for Finding Factorial : ");
		int num=sc.nextInt();
		Fact(num);
	}
}