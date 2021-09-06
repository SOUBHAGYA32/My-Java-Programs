import java.util.*;
class prime{
	public static void main(String[] args) {
		int  temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n= sc.nextInt();
		for(int i=2;i<=n-1;i++){
			if(n%2==0){
				temp= temp+1;
			}
		}
		if(temp==0){
			System.out.println(n+ " is Prime");
		}
		else{
			System.out.println(n+" is Not prime");
		}
		
		
	}

}
