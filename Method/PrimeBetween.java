import java.util.Scanner;
class PrimeTest{
	public static int PrimeRange(int num){
		for (int i=2;i<=num-1 ;i++ ) {
			if (num%i==0) {
				return 0;
			}
		}
		return 1;
	}
}
public class PrimeBetween{
	public static void main(String[] args) {
		PrimeTest t1=new PrimeTest();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Starting Range: ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Range: ");
		int end = sc.nextInt();
		int count=0;
		for (int i=start;i<=end ;i++ ) {
			if (t1.PrimeRange(i)==1) {
				count++;
			}
		}
		System.out.println("Number of Prime Numbers in the Given Range is: "+count);

	}
}