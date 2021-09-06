import java.util.*;
public class EvenOddInAMatrix {
	public static void main(String[] args) {
		int i,j, even=0, odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row Size: ");
		int row=sc.nextInt();
		System.out.println("Enter the Coulmn Size: ");
		int col=sc.nextInt();

		int mat[][]=new int[row][col];
		System.out.println("Enter The Value of the Matrix: ");
		for (i=0;i<row ;i++ ) {
			for (j=0;j<col ;j++ ) {
				mat[i][j]=sc.nextInt();
			}
		}

		
		for (i=0;i<row ;i++ ) {
			for (j=0;j<col ;j++ ) {
				if((mat[i][j]%2) == 0){
					even++;
				}
				else{
					odd++;
				}
			}
		}
		System.out.println("Number of Even Number is/are " +even);
		System.out.println("Number of Odd Number is/are "+odd);
	}
}