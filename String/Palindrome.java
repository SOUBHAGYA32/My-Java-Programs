 import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String original=sc.nextLine();
		String rev="";
		int len=original.length();
		for (int i=len-1;i>=0;i--) {
			rev=rev+original.charAt(i);
		}
		if(original.equals(rev))
			System.out.println("String is Palindrom..");
		else
			System.out.println("String is Not Palindrome..");
	}
}