import java.util.Scanner;
public class BubbleSortA{
	public static void main(String[] args) {
			int num,i,j,temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Size:");
			num=sc.nextInt();

			int arr[]=new int[num];
			System.out.println("Enter "+num+" Integers.");
			for (i=0;i<num;i++ ) {
				arr[i]=sc.nextInt();
			}
			//Sort Logic
			for (i=0;i<(num-1);i++ ) {	
				for (j=0;j<num-i-1;j++ ) {
					if(arr[i]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Sorted List of Integers..");
			for (i=0;i<num ;i++ ) {
				System.out.println(arr[i]);
			}



	}
}