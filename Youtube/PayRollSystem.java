import java.util.Scanner;
class PayRoll{
	String emp_id;
	String emp_name;
	double salary,HRA,DA,GS,PF;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("Enter Employee ID: ");
		emp_id=sc.next();
		System.out.println("Enter Employee Name: ");
		emp_name=sc.next();
		System.out.println("Enter Salary: ");
		salary = sc.nextDouble();
		calculateSalary();
	}
	public void calculateSalary()
	{
		HRA = salary*0.20;
		DA=salary*0.5;
		PF = salary*0.11;
		GS =(salary+DA+HRA)-PF;
	}
	void display()
	{
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Employee Basic salary: "+salary);
		System.out.println("HRA: "+HRA);
		System.out.println("DA: "+DA);
		System.out.println("PF: "+PF);
		System.out.println("GS: "+GS);

	}
}
public class PayRollSystem{
	public static void main(String[] args) {
		PayRoll obj=new PayRoll();
		obj.getData();
		obj.display();
	}
}