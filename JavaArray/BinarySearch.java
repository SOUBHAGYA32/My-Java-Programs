import java.util.*;
public class BinarySearch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int num = sc.nextInt();
		int first,last,mid,item;
		//Array Declaration
		int arr[]=new int[num];
		System.out.println("Enter the value of the Array: ");
		for (int i=0;i<num ;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to be Search: ");
		item = sc.nextInt();
		first=0;
		last = num-1;
		mid=(first + last)/2;

		while(first <= last){
			if(arr[mid]<item){
				first=mid+1;
			}
			else if(arr[mid]==item)
			{
				System.out.println("Element Found at location "+(mid+1)+ " . ");
				break;
			}
			else{
				last = mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last){
			System.out.println(item+" is not Found.");
		}
	}
}