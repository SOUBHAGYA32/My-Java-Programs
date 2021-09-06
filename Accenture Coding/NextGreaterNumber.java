import java.util.*;
public class NextGreaterNumber{
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		char[] ch=new char[n];
		for (i=0;i<n ;i++ ) {
			ch[i]=str.charAt(i);
		}

		//check from back for ch[i-1] < ch[i]
    	for(i=n-1; i>0; i--){ 
            if(ch[i-1] < ch[i]) 
            	break; 
    	}
    	//If 'i' value reaches 0, it means digits are in descending order
    	//Hence, we cannot form any higher number using the same digits
    	if(i==0){ 
            for(i=0; i<n; i++) 
                System.out.print(ch[i]); 
    	}
    	else{
            //If found then look for (ch[i-1] < min < ch[i]) after ch[i]
            int min=i;
            for(int j=i+1; j<n; j++){ 
                //if found then copy its index to min
                if (ch[j]>ch[i-1] && ch[j]<ch[min]){ 
                    min = j; 
                } 
            }
             //swap ch[i-1] and ch[min]
            char temp = ch[i-1]; 
            ch[i-1] = ch[min]; 
            ch[min] = temp;

            //sort all after min (i.e. after i inclusive) in ascending order
            Arrays.sort(ch, i, n);
             //output the result
            System.out.print("Next greater number: ");
            System.out.print(ch);
        }    
	}
}