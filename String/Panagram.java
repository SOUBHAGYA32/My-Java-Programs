/*
Check The Given String is Panagram Or Not.
e.g. - The quick brown fox jumps over the lazy dog.

 */


import java.util.*;
public class Panagram{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s=sc.nextLine();
		s=s.toLowerCase();
		if (isPanagram(s)) {
			System.out.print("The Given Sentence is Panagram");
		}
		else{
			System.out.print("The Given Sentence is Not Panagram");
		}
	}

	public static boolean isPanagram(String s)
	{
		if(s.length()<26){
			return false;
		}
		else{
			for (char ch='a';ch<'z';ch++ ) {
				if(s.indexOf(ch)<0){
					return false;
				}
			}
		}
		return true;
	}
}