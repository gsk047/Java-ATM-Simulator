package ProblemStatements.ATM;

public class SavingsAccount extends BankAccount{
	
	//Call the constructor
	public SavingsAccount(String name, double openingBalance) {
		super(name, openingBalance);
	}
	
	@Override
	public void withDraw(double withdrawalAmount) {
		
		if (getBalance() - withdrawalAmount <= 500) {
			System.out.println("Transaction Failed: Minimum balance of $500 required.");
		} else {
			super.withDraw(withdrawalAmount);
		}
	}
}
