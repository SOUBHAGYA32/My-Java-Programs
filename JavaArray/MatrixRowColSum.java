import java.util.*;
public class MatrixRowColSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row,col,sum=0;
		System.out.println("Enter The Number of Rows and Columns:");
		row = sc.nextInt();
		col = sc.nextInt();

		int mat[][] = new int[row][col];
		System.out.println("Enter The Value of the Matrix: ");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				mat[i][j]=sc.nextInt();
			}
			System.out.println("\n");
		}





		//Sum part
		for (int i=0; i<row;i++ ) {
			for (int j=0;j<col ;j++ ) {
				sum = sum + mat[i][j];
			}
			System.out.print("The Sum of the " + i + " position row is = " + sum + "\n");
			sum = 0;
		}

		//colm
		for(int j=0;j<col; j++){
			for (int i=0;i<row ;i++ ) {
				sum = sum + mat[i][j];
				
			}
			System.out.print("The Sum of the " + j + " position column is = " + sum + "\n");
            sum = 0;
		}
	}
}