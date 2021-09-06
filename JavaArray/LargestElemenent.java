import java.util.*;
public class LargestElemenent{
	public static void main(String[] args) {
		int max,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of the Array:");
		n=sc.nextInt();

		//Declaring an Array
		int arr[] = new int[n];
		System.out.println("Enter The Elements Of the Array:");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		max=arr[0];
		for (int i=0;i<n;i++) {
			if (max < arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("The Lagrest Element in The Array: "+max);

	}
}