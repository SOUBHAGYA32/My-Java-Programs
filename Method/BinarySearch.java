import java.util.*;
public class BinarySearch{

	public static int BSearch(int arr[], int first, int last, int search)
	{
		if(last>=first)
		{
			int mid=first+ (last-first)/2;
			if(search<arr[mid]){
				return BSearch(arr,first,mid-1,search);
			}
			else if(search>arr[mid]){
				return BSearch(arr, mid+1,last,search);
			}
			else{
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter Array Elements in Sorting Order..");
		for (int i=0;i<num;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element..");
		int search=sc.nextInt();

		int result=BSearch(arr,0,num-1,search);
		if(result==-1)
		{
			System.out.println("Element Not Found..!");
		}
		else{
			System.out.println("Element Found at Index Number "+result);
		}
		
	}
}