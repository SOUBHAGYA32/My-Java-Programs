import java.util.*;
public class MatrixAddition{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size of First Matrix: ");
		int r=sc.nextInt();
		System.out.println("Enter column Size of First Matrix: ");
		int c = sc.nextInt();

		int mat1[][]= new int[r][c];
		int mat2[][]= new int[r][c];
		int sum[][]=new int[r][c];

		System.out.println("Enter the Value of the First Matrix:");
		for (int i=0;i<r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				mat1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter the Value of the Second Matrix:");
		for (int i=0;i<r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				mat2[i][j]=sc.nextInt();
			}
			
		}
		for (int i=0;i<r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				sum[i][j] = mat1[i][j]+mat2[i][j];
				
			}
			
		}
		System.out.println("The Sum of the Two Matrix is :");
		for (int i=0;i<r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				System.out.print(sum[i][j] + "    ");
			}
			System.out.println();
		}
		
	}

}