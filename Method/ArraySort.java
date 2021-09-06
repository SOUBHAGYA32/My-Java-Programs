import java.util.*;
public class ArraySort{
	public static void arraySort(int arr[], int n)
	{
		for (int i=0;i<n-1 ;i++ ) {
			for (int j=0;j<n-i-1 ;j++ ) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n=sc.nextInt();
		System.out.println("Enter Array Value: ");
		int arr[]=new int[n];
		for (int i=0;i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		ArraySort.arraySort(arr,n);
		System.out.println("Sorted Array in Ascending Order:");
    	System.out.println(Arrays.toString(arr));
	}
}