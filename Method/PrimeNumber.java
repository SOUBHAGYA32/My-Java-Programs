import java.util.Scanner;
public class PrimeNumber{

	public static int isPrime(int num){
		int temp=0;
		for (int i=2;i<=num-1 ;i++ ) {
			if (num%i==0) {
				temp=temp+1;
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		temp= isPrime(num);

		if(temp>0){
			System.out.println(num+" Not Prime");
		}
		else{
			System.out.println(num+" Prime");
		}
	}
}