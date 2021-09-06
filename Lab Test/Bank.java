import java.util.*;
class BankDemo{
	String bank_code;
	String bank_name;
	String bank_address;
	
	void show(String bank_code, String bank_name, String bank_address )
	{
		System.out.println("The Bank Code : "+bank_code);
		System.out.println("The Bank Name : "+bank_name);
		System.out.println("The Bank Address is: "+bank_address);
	}

	double getInterest()
	{
		System.out.println("The Simple Interest is: ");
		return 11.32;
	}
}

class SBI extends BankDemo{

	double getInterest()
	{
		return 9.8;
	}
}

class ICICI extends BankDemo{
	double getInterest()
	{
		return 3.5;
	}
}
class AXIS extends BankDemo{
	double getInterest()
	{
		return 5.7;
	}
}
public class Bank{
	public static void main(String[] args) {
		SBI s=new SBI();
		s.show("SBI201", "SBI", "Anandapur");
		System.out.println("SBI Rate of Interest: "+s.getInterest());
		System.out.println("________________________________________");




		ICICI i=new ICICI();
		i.show("IC12300", "ICICI", "Bhubaneswar");
		System.out.println("ICICI Rate of Interest: "+i.getInterest());
		

		System.out.println("________________________________________");


		AXIS a=new AXIS();
		a.show("AX0012", "AXIS", "Bhubaneswar");
		System.out.println("AXIS Rate of Interest: "+a.getInterest());
		

	}
}