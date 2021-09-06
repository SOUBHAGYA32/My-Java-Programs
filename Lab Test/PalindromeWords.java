import java.util.*;
public class PalindromeWords{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence in UpperCase..");
		String s=sc.nextLine();
		int l=s.length();
		char last=s.charAt(l-1);
		int count=0;
		s=s.toUpperCase();
		s=s.trim();
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			String words=st.nextToken();
			if(isPalindrome(words))
			{
				System.out.println("Palindrome Words are: "+words+ " ");
				count++;
			}

		}
		System.out.println("Number of Palindrome Words Are: "+count);
		
	}
	public static boolean isPalindrome(String w)
	{
		String rev="";
		for (int i=w.length()-1;i>=0 ;i-- ) {
			rev=rev+w.charAt(i);
		}
		if(rev.equals(w))
			return true;
		else
			return false;
	}
}