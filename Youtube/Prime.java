import java.util.*;
public class Prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no=sc.nextInt();
		int temp=0;
		for (int i=2;i<=no-1 ;i++ ) {
			if(no%2==0){
				temp=temp+1;
			}
			
		}
		if(temp==0){
			System.out.println("Is Prime.");
		}
		else{
			System.out.println("Not Prime..");
		}
	}
}