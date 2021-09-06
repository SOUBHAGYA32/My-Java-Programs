import java.util.*;
public class WordsPalindrome{

	public static boolean isPalindromeWord(String w)
	{
		String rev="";
		int l=w.length();
		for(int i=l-1;i>=0;i--){
			rev=rev+w.charAt(i);
		}
		if(rev.equals(w))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence...");
		sentence=sc.nextLine();

		sentence=sentence.toUpperCase();
		StringTokenizer str=new StringTokenizer(sentence);
		while(str.hasMoreTokens()){
			String words =str.nextToken();
			if(isPalindromeWord(words)){
				System.out.print(words+" ");
			}
		} 
	}
}