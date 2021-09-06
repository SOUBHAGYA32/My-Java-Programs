import java.util.*;
public class ReverseAnArray{
	public static int[] RevArray(int arr1[], int num)
	{
		int[] newArr=new int[num];
		for (int i=0;i<num ;i++ ) {
			newArr[num-1-i]=arr1[i];
		}
		return newArr;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array: ");
		int num=sc.nextInt();
		int arr1[]=new int[num];
		System.out.println("Enter Array Elements: ");
		for (int i=0;i<num ;i++ ) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Array Before Reverse: "+Arrays.toString(arr1));
		int[] result= RevArray(arr1,num);
		System.out.println("Array After Reverse: "+Arrays.toString(result));

	}

}