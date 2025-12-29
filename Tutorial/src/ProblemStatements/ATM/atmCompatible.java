package ProblemStatements.ATM;

public interface atmCompatible {
	
	double getBalance();
	
	void deposit(double depositAmount);
	
	void withDraw(double withdrawalAmount);

	void deposit(double depositeAmount, String note);
	
}
