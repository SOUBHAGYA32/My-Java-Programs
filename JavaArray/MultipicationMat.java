import java.util.*;
public class MultipicationMat{
	public static void main(String[] args) {
		int i,j,k,sum;
		Scanner sc=new Scanner(System.in);
		//First Matrix
		System.out.println("Enter The Row Size of the First Matrix:");
		int row1 = sc.nextInt();
		System.out.println("Enter The Column Size of the First Matrix:");
		int col1 = sc.nextInt();
		int first[][]=new int[row1][col1];

		//Second Matrix
		System.out.println("Enter The Row Size of the Second Matrix:");
		int row2 = sc.nextInt();
		System.out.println("Enter The Column Size of the Second Matrix:");
		int col2 = sc.nextInt();
		int second[][]=new int[row2][col2];

		//Resultant matrix
		int result[][]= new int[row1][col2];

		if(col1==row2){
			System.out.println("Enter the Element of the First Matrix ");
			for (i=0;i<row1 ;i++ ) {
				for (j=0;j<col1 ;j++ ) {
					first[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the Element of the Second Matrix ");
			for (i=0;i<row2 ;i++ ) {
				for (j=0;j<col2 ;j++ ) {
					second[i][j] = sc.nextInt();
				}
			}
			for (i=0;i<row1 ;i++ ) {
				for (j=0;j<col2 ;j++ ) {
					sum = 0;
					for (k=0;k<row2 ;k++ ) {
						sum = sum + first[i][k]*second[k][j];
					}
					result[i][j]=sum;
				}
			}
			for(i=0; i<row1; i++){
				for (j=0;j<col2 ;j++ ) {
					System.out.print(result[i][j]+ "   ");
				}
				System.out.println();
			}

		}
		else{
			System.out.println("Multipication Does Not Exist....");
		}
	}
}