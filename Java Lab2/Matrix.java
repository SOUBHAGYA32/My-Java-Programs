import java.util.*;
public class Matrix{

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
	public static int isIdentityMatrix(int mat[][], int row, int col)
	{
		int i,j;
		int count=0;
		for (i=0;i<row;i++ ) {
			for (j=0;j<col;j++ ) {
				if((i==j && mat[i][j]==1) || (i!=j && mat[i][j]==0))
				{
					count++;
				}
			}
		}
		return count;
	}



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int row,col,i,j;

		//Row Size and Col Size
		System.out.println("Enter Row Size: ");
		row = sc.nextInt();
		System.out.println("Enter Column Size: ");
		col=sc.nextInt();

		int[][] mat=new int[row][col];
		System.out.println("Enter the Value of the Matrix: ");
		for (i=0;i<row ;i++ ) {
			for (j=0;j<col ;j++ ) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("*******The Enter Matrix is**********");
		DisplayMat(mat,row,col);

		int identity=isIdentityMatrix(mat,row,col);
		if(identity==(row*col)){
			System.out.println("Given Matrix is Identity");
			DisplayMat(mat,row,col);
		}
		else{
			System.out.println("Matrix is Not Identity");
		}

	}
}