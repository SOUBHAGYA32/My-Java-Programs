import java.util.*;
public class RemoveDuplicate{

	public static int DuplicateRem(int arr[], int n){
		if(n==0 || n==1){
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for (int i=0;i<n-1 ;i++ ) {
			if (arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for (int i=0;i<n ;i++ ) {
			arr[i]=temp[j];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr={1,2,3,3,4,8,9,1,2,8};
		int length = arr.length;
		length = DuplicateRem(arr, length);

		//Printing Array
		for(int i=0; i<length;i++){
			System.out.print(arr[i]+ "   ");
		}
	}
}