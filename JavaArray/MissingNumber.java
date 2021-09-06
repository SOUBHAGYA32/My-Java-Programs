import java.util.*;
import java.util.Arrays; 
public class MissingNumber{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the total number of Elements: ");
		n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the Elements of the Array: ");
		for (int i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}
		int sum=(n+1)*(n+2)/2;
		for (int i=0;i<n ;i++ ) {
			sum=sum-arr[i];
		}
		System.out.println("The Missing Number is: "+sum);
	}
}