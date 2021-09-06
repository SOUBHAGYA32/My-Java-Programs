import java.util.Scanner;
public class ReverseOfaNum{
	public static void RevNum(int num)
	{
		if(num<10){
			System.out.println(num);
			return ;
		}
		else{
			System.out.println(num%10);
			RevNum(num/10);
		}
	}
	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		System.out.print("Reverse of the Number is: ");
		RevNum(num);
		System.out.println();
	}
}