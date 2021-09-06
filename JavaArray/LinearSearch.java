import java.util.*;
public class LinearSearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int search_element,i;
		System.out.println("Enter the Array Size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Value of the Array: ");
		for (i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Value to be Search: ");
		search_element=sc.nextInt();
		for (i=0;i<n ;i++ ) {
			if(arr[i]==search_element){
				System.out.println("Element Found at index "+i);
				break;
			}
			
		}
		if(i==n)
			System.out.println("Element Not Found");

	}
}