package ProblemStatements.ATM;

public class BitcoinWallet implements atmCompatible {
	
	private double cryptoBalance;
	
	public BitcoinWallet(double cryptoBalance) {
		this.cryptoBalance = cryptoBalance;
	}
	
	public double getBalance() {
		return cryptoBalance;
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			cryptoBalance = cryptoBalance + depositAmount;
		} else {
			System.out.println("Enter a valid amount to deposite.");
		}
	}
	
	public void withDraw(double withdrawalAmount) {
		if (withdrawalAmount <= 0) {
			System.out.println("Enter a valid amount");
		} else if (withdrawalAmount <= cryptoBalance) {
			cryptoBalance = cryptoBalance - withdrawalAmount;
			System.out.println("Amount Withdrawn");
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void deposit(double depositeAmount, String note) {
		// TODO Auto-generated method stub
		
	}

}
