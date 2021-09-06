/*Given three numbers b, e and m. Fill in a function that takes these three positive integer values and outputs b^e mod m.
Input specification:
Input1: poisitive integer, b
Input2: poisitive integer, e
Input3: poisitive integer, m
Output Specification:
Return an integer on calculating b^e mod m.
Example 1:
Input 1: 2
Input 2: 10
Input 3: 1025
Output: 1024
*/
import java.util.*;
import java.lang.Math;
public class ModularExponentiation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input First Number: ");
		int b=sc.nextInt();
		System.out.println("Input Second Number: ");
		int e=sc.nextInt();
		System.out.println("Input Third Number: ");
		int m=sc.nextInt();

		System.out.println((int)Math.pow(b,e)%m);
	}
}