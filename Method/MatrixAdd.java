import java.util.*;
public class MatrixAdd{

	//Display Matrix
	public static void DisplayMat(int mat[][], int row, int col)
	{
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				System.out.print(mat[i][j]+ "  ");
			}
			System.out.println();
		}
	}

	//Addition Matrix
	public static int[][] Matadd(int mat1[][], int mat2[][],int row, int col)
	{
		int i,j;
		int result[][]=new int[row][col];
		for (i=0;i<row;i++ ) {
			for (j=0;j<col ;j++ ) {
				result[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return result;
	}

	//Matrix Subtraction
	public static int[][] MatSub(int mat1[][], int mat2[][], int row, int col)
	{
		int i,j;
		int subResult[][]=new int[row][col];
		for (i=0;i<row ;i++ ) {
		 	for (j=0;j<col ;j++ ) {
		 		subResult[i][j]=mat1[i][j]-mat2[i][j];
		 	}
		 }
		 return subResult; 
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int row,col,i,j;

		//Row Size and Col Size
		System.out.println("Enter Row Size: ");
		row = sc.nextInt();
		System.out.println("Enter Column Size: ");
		col=sc.nextInt();


		//Declaring Matrix 
		int mat1[][]=new int[row][col];
		int mat2[][]= new int[row][col];

		//First Matrix
		System.out.println("Enter First Matrix: ");
		for (i=0;i<row ;i++ ) {
			for (j=0;j<col ;j++ ) {
				mat1[i][j]=sc.nextInt();
			}
		}

		//Second Matrix
		System.out.println("Enter Second Matrix: ");
		for (i=0;i<row ;i++ ) {
			for (j=0;j<col ;j++ ) {
				mat2[i][j]=sc.nextInt();
			}
		}

		//Display First Matrix
		System.out.println("First Matrix: ");
		DisplayMat(mat1, row, col);

		//Display Second Matrix
		System.out.println("Second Matrix: ");
		DisplayMat(mat2, row,col);

		//Display Addition Result
		int result[][]=Matadd(mat1,mat2,row,col);
		System.out.println("The Addition Result is: ");
		DisplayMat(result, row,col);

		//Display Sub
		int subResult[][]= MatSub(mat1, mat2,row,col);
		System.out.println("The Subtraction Result is : ");
		DisplayMat(subResult, row,col);

	}
}