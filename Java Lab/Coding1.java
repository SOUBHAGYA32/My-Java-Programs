import java.util.*;
public class Coding1{
	public static void main(String[] args) {
		int total=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Grade:");
		int standard = sc.nextInt();
		if(standard<1 || standard>12){
			System.out.println("Invalid Standard");
		}
		else{
			for( int i=1;i<=standard;i++){
			total = i*i+total;
		}
		System.out.println("The Number of Pencils Use is:" +total);
		}
		
	}
}