import java.util.*;
class employeePayroll{
	String emp_name;
	int emp_id;
	double basicsalary,HRA,DA,GS,PF;

	 public void getData()
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the employee id");
        emp_id=sc.nextInt();

        System.out.println("Enter the employee name");
        emp_name=sc.next();

        System.out.println("Enter the basic salary of an employee");
        basicsalary=sc.nextDouble();
        calculate();
     }
      public void calculate()
     {
        HRA=basicsalary* 0.20;
        DA=0.5*basicsalary;
        PF = basicsalary* 0.11;
        GS = (basicsalary + DA+ HRA) - PF;
     }
      public void display()
     {
        System.out.println("Employeeid  :  "+emp_id);
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Basic Salary : "+basicsalary);
        System.out.println("HRA : "+HRA);
        System.out.println("DA : "+DA);
        System.out.println("PF : "+PF);
        System.out.println("GS : "+GS);
     }
	
}




public class PayRoll{
	public static void main(String[] args) {
		
		employeePayroll emp1=new employeePayroll();
         emp1.getData();
         emp1.display();
	}
}