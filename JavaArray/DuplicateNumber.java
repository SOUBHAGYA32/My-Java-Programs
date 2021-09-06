import java.util.*;
public class DuplicateNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size:");
		int n = sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter The Values of the Array:");
		for (int i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}

		for (int i=0;i<n ;i++ ) {
			for (int j=i+1;j<n ;j++ ) {
				if (arr[i] == arr[j]) {
					System.out.print("The Duplicate Number is: "+arr[j]);
				}
			}
			System.out.println();
		}

	}
}