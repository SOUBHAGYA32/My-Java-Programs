import java.util.Scanner;
public class BinarySearchX{
	public static void main(String[] args) {
		int i,num,item,first,last,mid;
		//To capture the input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Elements:");
		num=sc.nextInt();

		//creating array
		int arr[]=new int[num];
		System.out.println("Enter "+num+" integers.");
		for (i=0;i<num;i++ ) {
			arr[i]=sc.nextInt();
		}

		//Search Element
		System.out.println("Enter the search Element:");
		item=sc.nextInt();

		first=0;
		last=num-1;
		mid=(first+last)/2;

		while(first<=last){
			if(arr[mid]<item){
				first=mid+1;
			}
			else if(arr[mid]==item){
				System.out.print(item+" found at location " +(mid+1)+ ".");
				break;
			}
			else{
				last=mid-1;
			}
			mid=(first+last)/2;

			}
			if(first>last)
				System.out.println("Element Not Found.....");
			
	}
}