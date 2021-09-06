import java.util.*;
public class MatrixSumDiagonals{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Size:");
		int row = sc.nextInt();
		System.out.println("Enter The Column Size:");
		int col = sc.nextInt();
		int Mat[][]=new int[row][col];
		int i,j,sol,sor,soc;
		System.out.println("Enter The Value of the Matrix: ");
		for (i=0;i<row ;i++ ) {
			for (j=0;j<col ;j++ ) {
				Mat[i][j] = sc.nextInt();
			}
		}
		//Sum Of Left Diagonals
		sol = 0;
		for (i=0, j=0;i<row && j<col ;i++,j++ ) {
			sol = sol + Mat[i][j];
		}




		System.out.println("The Sum Of the Left Diagonals Is " +sol);

		//Sum Of Right Diagonals
		sor = 0;
		for (i=0,j=col-1;i<row && j>=0 ;i++,j-- ) {
			sor = sor + Mat[i][j];
		}
		System.out.println("Sum of the Right Dagonals of The Matrix is: "+sor);


		
	}
}