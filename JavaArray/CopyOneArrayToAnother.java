import java.util.*;
public class CopyOneArrayToAnother{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size:");
		int n = sc.nextInt();

		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter Elements of the Array: ");
		for (int i=0;i<n ;i++ ) {
			arr1[i]=sc.nextInt();
		}

		for(int i=0; i<n; i++){
			arr1[i]=arr2[i];
		}
		for (int i=0;i<n ;i++ ) {
			System.out.print(arr2[i] + " ");
		}
	}
}