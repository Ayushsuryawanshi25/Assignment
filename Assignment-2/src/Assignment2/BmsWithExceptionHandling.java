package Assignment2;

/*Design a Java program where a bank account class implements multiple interfaces to perform
banking and customer-related operations. The program should handle exceptions as required.
*/

import java.util.*;

public class BmsWithExceptionHandling {
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
					try{
						Ac.deposit(DAmount);
					}catch (InvalidAmount e){
						System.out.println(e.getMessage());
					}
					break;
					
				case 5 :
					System.out.println("Enter The Amount for Withdaw ....");
					double WAmount  = sc.nextDouble();
					try{
						Ac.Withdraw(WAmount);
					}
					catch(InvalidAmount | InsufficientBalance e ){
							System.out.println(e.getMessage());
					}	
					break;
					
				default :
					System.out.println("......Invalid Choice ......");
				
			}
		}while(choice != 6);
		
		System.out.println("...........Thank You For Using Our System ..............");
	
	}

}
class InsufficientBalance extends Exception{
	public InsufficientBalance(String message){
		super(message);
	}
}

class InvalidAmount extends Exception{
	public InvalidAmount(String message){
		super(message);
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
	
	public void deposit(double Amount) throws InvalidAmount{
	
		if (Amount <= 0) {
			throw new InvalidAmount("Deposit amount must be greater than zero.");
		}
		Balance += Amount;
		System.out.println("Deposit Successful");	
	}
	
	public void Withdraw(double WithdrawAmount)throws InvalidAmount, InsufficientBalance{
		
        if (WithdrawAmount <= 0) {
            throw new InvalidAmount("Withdrawal amount must be greater than zero.");
        }

        if (WithdrawAmount > Balance) {
            throw new InsufficientBalance("Insufficient balance.");
        }
		
		Balance -= WithdrawAmount;
		System.out.println("Withdraw Successful");
		
	}
	
}