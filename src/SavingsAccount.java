
public class SavingsAccount extends BankingAccount {
	//declare variables
	boolean activeAcct = true;

	//need an constructor to bring instance fields from parent
	public SavingsAccount(double bal, double interest, boolean activeAcct) {
		super(bal, interest);
		this.activeAcct = activeAcct;
	}
	
//	withdraw method: A method that determines whether the account is inactive before a withdrawal is made. 
//	(No withdrawal will be allowed if the account is not active.)
//	A withdrawal is then made by calling the superclass version of the method.
//	If the balance of a savings account falls below $25, it becomes inactive. (The status field could be a boolean variable.) 
//	No more withdrawals may be made until the balance is raised above $25, at which time the account becomes active again.

	public void withdraw(double withdrawalAmount){
		super.withdraw(withdrawalAmount);
		if (getBalance() < 25.00){
			activeAcct = false;
			System.out.println("Your account is inactive!! Please get it above $25.00");
		
		}else{
			activeAcct = true;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
