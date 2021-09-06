import java.util.*;
public class ShortName{

    String name;
    ShortName(String name)
    {
        this.name=name;
    }
    void display()
    {
        String res="";
        String []words=name.split(" ");
        int i;
        for(i=0;i<words.length-1;i++)
        {
            res += words[i].charAt(0) + ".";
        }
        res +=words[i].charAt(0) + words[i].substring(1).toLowerCase() + ".";
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter Full Name:");
        name=sc.nextLine();

        ShortName name1=new ShortName(name);
        name1.display();
    }
}