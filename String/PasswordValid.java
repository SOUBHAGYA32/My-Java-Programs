import java.util.*;
public class PasswordValid{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Password..!");
		String s=sc.nextLine();

		if(isPass_valid(s)){
			System.out.println("Password is Valid: "+s);
		}
		else{
			System.out.println("Password is Not Valid: "+s);
		}
	}
	public static boolean isPass_valid(String str)
	{
		if(str.length() <= 4){
			return false;
		}
		int charCount = 0;
		int numCount=0;
		for (int i=0;i<str.length();i++ ) {
			char ch=str.charAt(i);
			if(isNumeric(ch))
				numCount++;
			else if(isLetter(ch))
				charCount++;
			else
				return false;
		}
		return (charCount >=2 && numCount >=2);
	}
	public static boolean isLetter(char ch)
	{
		ch=Character.toUpperCase(ch);
		return (ch >= 'A' && ch <='Z');
	}
	public static boolean isNumeric(char ch)
	{
		return (ch >= '0' && ch<='9');
	}
}