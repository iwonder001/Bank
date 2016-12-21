
public abstract class BankingAccount {
	//declare variables
//	Balance
//	Number of deposits this month
//	Number of withdrawals
//	Annual interest rate
//	Monthly service charges
	private double balance;
	private int depositsMonth;
	private int numWithdrawals;
	private double annualInterest;
	private double monthServiceCharge;
	
	//The constructor should accept arguments for the balance and annual interest rate.
	
	public BankingAccount (double bal, double interest) {
		balance = bal;
		annualInterest = interest;
		
	}

	
	/**deposit:	A method that accepts an argument for the amount of the deposit. 
	 * The method should add the argument to the account balance. It should also increment the variable holding the number of deposits.
	 */
	
	public void deposit(double depositAmount){
		balance = balance + depositAmount;
		depositsMonth++;
	}
	/**withdraw: A method that accepts an argument for the amount of the withdrawal. 
	 * The method should subtract the argument from the balance. It should also increment the variable holding the number of withdrawals.*/
	 
	public void withdraw(double withdrawalAmount){
		balance = balance - withdrawalAmount;
		numWithdrawals++;
	}

	
	public double getBalance() {
		return balance;
	}

	public void calcInterest(double annualInterestRate){
	double monthlyInterestRate = annualInterestRate/12;
	double monthlyInterest = balance * monthlyInterestRate;
	balance = balance + monthlyInterest;
	}
	
//	monthlyProcess: A method that subtracts the monthly service charges from the balance, calls the calcInterestmethod, 
//	and then sets the variables that hold the number of withdrawals, number of deposits, and monthly service charges to zero.
	
	public void monthlyProcess(){
		
	}
	
	
	
	
	
	
	
	
}