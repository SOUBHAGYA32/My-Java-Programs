import java.util.*;
public class MiddleName{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Name: ");
		String fname=sc.nextLine();

		System.out.println("Enter Last Name: ");
		String lname=sc.nextLine();

		System.out.println("Enter Your Middle Name: ");
		String mname=sc.nextLine();

			StringBuffer fullname=new StringBuffer();
			fullname.append(fname);
			fullname.append(" ");
			fullname.append(mname);
			fullname.append(" ");
			fullname.append(lname);
			System.out.println("Full Name is: "+fullname);


	}
}