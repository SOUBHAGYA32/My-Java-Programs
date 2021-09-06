import java.util.*;
public class SecondLargest{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter The Value of The Array:");
		for (int i=0;i<n ;i++ ) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];//1
		int secondLargest = arr[0];//1
		for (int i=0;i<n ;i++ ) {
			if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
 
      } else if (arr[i] > secondLargest) {
        secondLargest = arr[i];
 
      }
			
		}
		System.out.println("The Second Largest in The Array is: "+secondLargest);
	}
}