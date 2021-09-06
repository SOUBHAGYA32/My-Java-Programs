import java.util.*;
public class PalindromeOne{

    public static int isPallindrome(int num)
    {
        int sum=0,r;
        while(num!=0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i=0;
        System.out.println("Enter The Array Size");
        num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the Array Value: ");
        for (i=0;i<num ;i++ ) {
            arr[i]=sc.nextInt();
        }
        System.out.println("************The Palindrome Numbers Present in The Array is*************");
        int result;
        for (i=0;i<num;i++ ) {
            result=isPallindrome(arr[i]);
            if(result==arr[i])
            {
                
                System.out.print(arr[i]+ " ");
            }
        }

    }
}