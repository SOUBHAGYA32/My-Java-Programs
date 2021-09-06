import java.util.*;
public class DecimalToBinary{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal Number:");
		int n = sc.nextInt();

		int bin[] = new int[100];
		int i=0;
		while(n>0){
			bin[i++] = n%2;
			n=n/2;
		}
		System.out.println("Binary Number is:");
		for (int j=i-1;j>=0 ;j-- ) {
			System.out.println(bin[j]);
		}


	}

}