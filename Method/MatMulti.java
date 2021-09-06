import java.util.*;
public class MatMulti{


	//Display Method
	public static void DisplayMat(int mat[][], int row, int col)
	{
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				System.out.print(mat[i][j]+ "  ");
			}
			System.out.println();
		}
	}

	//Multipication Matrix
	public static int[][] MatMulti(int mat1[][], int mat2[][],int row1, int col2, int row2)
	{
		int i,j,k;
		int sum;
		int result[][]=new int[row1][col2];
		for (i=0;i<row1;i++ ) {
			for (j=0;j<col2 ;j++ ) {
				sum = 0;
				for (k=0;k<row2 ;k++ ) {
						sum = sum + mat1[i][k]*mat2[k][j];
				}
				result[i][j]=sum;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int col1,row1,col2,row2;
		int i,j;
		System.out.println("Enter Row Size of First Matrix: ");
		row1=sc.nextInt();
		System.out.println("Enter Column Size of First Matrix: ");
		col1=sc.nextInt();
		System.out.println("Enter Row Size of Second Matrix: ");
		row2=sc.nextInt();
		System.out.println("Enter column Size of Second  Matrix: ");
		col2=sc.nextInt();


		int mat1[][]=new int[row1][col1];
		int mat2[][]=new int[row2][col2];

		if(col1==row2)
		{
			System.out.println("Enter the Element of the First Matrix ");
			for (i=0;i<row1 ;i++ ) {
				for (j=0;j<col1 ;j++ ) {
					mat1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the Element of the Second Matrix ");
			for (i=0;i<row2 ;i++ ) {
				for (j=0;j<col2 ;j++ ) {
					mat2[i][j] = sc.nextInt();
				}
			}
			System.out.println("The First Matrix is: ");
			DisplayMat(mat1,row1,col1);

			System.out.println("The Second Matrix is: ");
			DisplayMat(mat2,row2,col2);

			int result[][]=MatMulti(mat1,mat2,row1,col2,row2);
			System.out.println("The Multipication Result is: ");
			DisplayMat(result,row1,col2);
		}
		else{
			System.out.println("Multipication Does Not Exist....");
		}

	}
}