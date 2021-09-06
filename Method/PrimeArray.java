import java.util.*;
public class PrimeArray{

	public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
		for (int i=2;i<=num-1 ;i++ ) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Array Size: ");
		num=sc.nextInt();

		int arr[]=new int[num];
		System.out.println("Enter the Array Value: ");
		for (i=0;i<num ;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("********The Prime Numbers Present in the Array***********");
		for (i=0;i<num ;i++ ) {
			if(isPrime(arr[i])){
				System.out.print(arr[i]+ " ");
			}
		}

	}
}