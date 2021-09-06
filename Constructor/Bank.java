import java.util.*;
class BankData{
	String cust_name;
	String cust_id;
	String cust_accno;
	double balance=0.0;
	Scanner sc=new Scanner(System.in);
	BankData(){} //Default Constructor
	BankData(String id, String name, String acc,double bal)
	{
		cust_id=id;
		cust_name=name;
		cust_accno=acc;
		balance=bal;
	}
	void DisplayAcc(){
    	//System.out.println("Customer Details:");
    	System.out.println("Customer ID: "+cust_id);
    	System.out.println("Customer Name: "+cust_name);
    	System.out.println("Account Number: "+cust_accno);
    	System.out.println("Balance : "+balance);
    }
    //Deposit Money
    void DepositMoney(){
    	double deposit;
    	System.out.println("Enter Amount You Want to Deposit : ");
        deposit = sc.nextDouble();
        balance = balance + deposit;
    }

     //Withdraw Money
    void WithdrawalMoney() {
        double amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = sc.nextDouble();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Transaction Successful...");
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }

	}
}
public class Bank{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cust_name;
		String cust_id;
		String cust_accno;
		double balance=0.0;
		System.out.println("Enter Customer ID: ");
		cust_id = sc.next();
        System.out.print("Enter Customer Account No: ");
        cust_accno = sc.next();
        System.out.print("Enter Customer Name: ");
        cust_name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();

        BankData obj = new BankData(cust_id,cust_name,cust_accno,balance);
        obj.DisplayAcc();
        obj.DepositMoney();
        obj.WithdrawalMoney();

	}
}