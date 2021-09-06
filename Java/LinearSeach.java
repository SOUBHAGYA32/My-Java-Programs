import java.util.Scanner;
public class LinearSeach {
	public static void main(String[] args) {
		int sElement;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter those " +n+ " elements:");
		for (int i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();			
		}

		System.out.println("Enter Search Element:");
		sElement=sc.nextInt();

		for (int i=0;i<n ;i++ ) {
			if(arr[i]==sElement){
				System.out.println(sElement+" is present at location "+(i+1)+ ".");
				break;
			}
		}
		
	}
}