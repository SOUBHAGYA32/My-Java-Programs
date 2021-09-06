import java.util.Scanner;

public class great{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Number:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int l= sc.nextInt();

		if(n >m && n>l){
			System.out.println(n+" is greater");
		}
		else if(m>n && m>l){
			System.out.println(m+" is greater");
		}
		else{
			System.out.println( l+ " is Greater");
		}
	}
}