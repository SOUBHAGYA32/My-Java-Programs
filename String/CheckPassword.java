/*
	Password Conditions:
	1. Atleast Four Characters.
	2. Atleast one numeric digit.
	3. Atleast One Capital letter.
	4. Must not have Spaces or (/).
	5. Starting Character must not be a number
		(String will not be Empty)

 */

import java.util.*;
public class CheckPassword{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**************** Enter a Password *******************");
		String s=sc.nextLine();
		int n=s.length();
		if(isPasswordValid(s,n)){
			System.out.println("Password is Valid......  "+s);
		}
		else{
			System.out.println("Password is Not Valid.....!Enter a Correct Password.. ");
		}
	}


	public static boolean isPasswordValid(String s, int n)
	{
		boolean isNum=false, isCap=false,isSpace=true,isFirst=true,isLen=false;
		if(n>=4){
			isLen = true;
		}
		
		if(Character.isDigit(s.charAt(0)))
			isFirst=false;
		char[] ch=s.toCharArray();
		for (int i=0;i<ch.length;i++ ) {
			if(Character.isDigit(ch[i]))
				isNum=true;
			if(ch[i]>=65 || ch[i]<97)
				isCap=true;
			if(ch[i]==' ' || ch[i]=='/')
				isSpace=false;
		}
		if(isLen && isNum && isCap && isSpace && isFirst)
			return true;
		else
			return false;

	}

}