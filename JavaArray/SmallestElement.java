import java.util.*;
public class SmallestElement{
	public static void main(String[] args) {
		int n,min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the array:");
		n=sc.nextInt();

		//array
		int arr[] = new int[n];
		System.out.println("Enter The array Elements:");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		min = arr[0];
		for (int i=0;i<n ;i++ ) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Smallest Element In the Array Is: "+min);
	}
}