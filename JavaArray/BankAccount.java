import java.util.*;
class BankCust{
	String cust_name;
	int cust_id;
	String cust_accno;
	double balance=0.0;
	Scanner sc=new Scanner(System.in);

	//Method to Open an Account
	void openAccount() {
		System.out.println("Enter Customer ID: ");
		cust_id = sc.nextInt();
        System.out.print("Enter Customer Account No: ");
        cust_accno = sc.next();
        System.out.print("Enter Customer Name: ");
        cust_name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    //Display Customer Details
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

   public class BankAccount{
   	public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);

   		BankCust cust1=new BankCust();
   		cust1.openAccount();

   		int menu;
   		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Exit");
		boolean quit = false;

		do {
			System.out.print("Please Enter Your Choice: ");
			menu = sc.nextInt();
			switch(menu){
				case 1: cust1.DepositMoney();
						break;
				case 2: cust1.WithdrawalMoney();
						break;
				case 3: cust1.DisplayAcc();
						break;
				case 4: quit = true;
						break;
			}
		} while (!quit);


   	}
  }

