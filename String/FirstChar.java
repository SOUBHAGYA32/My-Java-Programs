import java.util.*;
public class FirstChar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence..");
		String str=sc.nextLine();
		firstLetter(str);

	}
	public static void firstLetter(String str)
	{
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++){
			String s=words[i];
			System.out.print(s.charAt(0)+" ");
		}
	}
}