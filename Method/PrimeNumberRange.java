import java.util.*;
public class PrimeNumberRange{

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
		Scanner sc=new Scanner(System.in);
		int start, end;
		System.out.println("Enter Starting Range: ");
		start = sc.nextInt();
		System.out.println("Enter Ending Range: ");
		end= sc.nextInt();
		System.out.println("Prime Number Between the Range "+start+" and "+end+" is:");
		for (int i=start;i<=end ;i++ ) {
			if (isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
	}

}