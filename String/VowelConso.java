import java.util.*;
public class VowelConso{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String str=sc.nextLine();
		countVowelCons(str);
	}
	public static void countVowelCons(String str)
	{
		int vowelCount=0;
		int consCount=0;
		for (int i=0;i<str.length();i++ ) {
			if(isVowel(str.charAt(i))){
				vowelCount++;
			}
			else{
				consCount++;
			}
		}
		System.out.println("Number of Vowels: "+vowelCount);
		System.out.println("Number of Consonant Count: "+consCount);
	}
	public static boolean isVowel(char ch)
	{
		ch=Character.toUpperCase(ch);
		return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
	}

}