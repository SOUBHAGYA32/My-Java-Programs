import java.util.*;
public class ReverseAnArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for (int i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}

		//Displaying Array
		for (int i=0;i<n ;i++ ) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();

		//Reverse the order
		for (int i=n-1;i>=0;i-- ) {
			System.out.print(arr[i]+ "   ");
		}
		System.out.println();
	}
}