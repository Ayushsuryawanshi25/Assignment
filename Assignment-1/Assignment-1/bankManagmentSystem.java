/*Design a console-based Bank Management Program in Java that allows a user to create a
bank account and perform basic banking operations such as deposit, withdrawal, balance
enquiry, and account details display. The program should handle exceptions as required.*/

import java.util.*;

public class bankManagmentSystem{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Account Number : ");
		int AccNo = sc.nextInt();
		
		System.out.println();
		System.out.println("Eneter User Name : ");
		String UserName = sc.next();
		
		double Balance = 0;
		
		CreateAcc Ac = new CreateAcc(AccNo, UserName, Balance);
		
		int choice;
		
		do{
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println();
			
			System.out.println(" press 1 for display Account Number : ");
			System.out.println(" press 2 for display user Name : ");
			System.out.println(" press 3 for display Bank Balance : ");
			System.out.println(" press 4 for Deposit Amount : ");
			System.out.println(" press 5 for Withdraw Amount : ");
			System.out.println(" press 6 for Exit // : ");
			
			System.out.println();
			System.out.println("Eneter Your Choice : ");
			choice = sc.nextInt();
				
			switch(choice){
				
				case 1 :
					int val = Ac.getAccNo();
					System.out.println("Account Number = "+ val);
					break;
					
				case 2 :
					String n = Ac.getUseName();
					System.out.println("User name = "+ n);
					break;
					
				case 3 :
					double bal = Ac.getBalance();
					System.out.println("Bank Balance = "+ bal);
					break;
					
				case 4 :
					System.out.println("Enter The Amount for Deposit ....");
					double DAmount  = sc.nextDouble();
					Ac.deposit(DAmount);
					break;
					
				case 5 :
					System.out.println("Enter The Amount for Withdaw ....");
					double WAmount  = sc.nextDouble();
					Ac.Withdraw(WAmount);
					break;
					
				default :
					System.out.println("......Invalid Choice ......");
				
			}
		}while(choice != 6);
		
		System.out.println("...........Thank You For Using Our System ..............");
	
	}

}

class CreateAcc{
	
	private int AccNo;
	private String UserName;
	private double Balance;
	
	public CreateAcc(int AccNo, String UserName, double Balance){
		
		this.AccNo = AccNo;
		this.UserName = UserName;
		this.Balance = Balance;
		
	}
	
	public int getAccNo(){
		return AccNo;
	}
	
	public String getUseName(){
		return UserName;
	}
	
	public double getBalance(){
		return Balance;
	}
	
	public void deposit(double Amount){
		if (Amount>0){
			Balance += Amount;
			System.out.println("Deposit Successful");
		}
		else{
			System.out.println("Deposit Unsuccessful : Invalid amount");
		}
	}
	
	public void Withdraw(double WithdrawAmount){
		if (WithdrawAmount<=Balance){
			Balance -= WithdrawAmount;
			System.out.println("Withdraw Successful");
		}
		else{
			System.out.println("Withdraw Unsuccessful : Invalid Withdraw amount");
		}
	}
	
	
}