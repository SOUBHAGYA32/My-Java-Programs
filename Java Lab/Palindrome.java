import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();

		if(number<0){
			System.out.println("Invalid Input");
		}
		else{
			int x=0;
			int temp=number;
			while(number!=0){
				x=x*10+(number%10);
				number = number/10;
			}
			if(x==temp){
				System.out.println("Palindrome..");
			}
			else{
				System.out.println("Not Palindrome..");
			}
		}


	}
}