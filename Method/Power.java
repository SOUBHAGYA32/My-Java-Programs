import java.util.Scanner;
public class Power{

	public static int Pow(int base, int powRaised)
	{
		if (powRaised!=0) {
			return (base*Pow(base, powRaised-1));
		}
		else{
			return 1;
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base,powRaised;
		System.out.println("Enter Base : ");
		base=sc.nextInt();
		System.out.println("Enter Power : ");
		powRaised=sc.nextInt();
		int result=Pow(base, powRaised);
		System.out.println(base+ "^"+powRaised+"=" +result);
	}
}