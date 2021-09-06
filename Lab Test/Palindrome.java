import java.util.*;
public class Palindrome{

    public static boolean isPalindrome(int num)
    {
        int rev=0;
        int rem=0;
        int item=num;
        while(item>0)
        {
            rem=item%10;
            rev=rev*10+rem;
            item=item/10;
        }
        if(rev == num)
            return true;
        else
            return false;
    }
    public static void display(int[] arr, int num)
    {
        for (int i=0;i<num ;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter Size of the Array: ");
        int num=sc.nextInt();

        int[] arr=new int[num];
        System.out.println("Enter Array Value: ");
        for (i=0;i<num ;i++ ) {
            arr[i]=sc.nextInt();
        }

        System.out.println("The Entered array is: ");
        display(arr,num);

        int[] arr2=new int[num];
        int j=0,a; 
        for(i=0;i<num;i++)
        {
            a = arr[i];
            if(isPalindrome(a) == true)
            {
                arr2[j]=arr[i];
                j++;
            }

        }
        System.out.println("");
        System.out.println("Palindrome Numbers are:");
        display(arr2,num);
    }
}