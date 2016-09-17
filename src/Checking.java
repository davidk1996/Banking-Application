
public class Checking extends Account{
	private static String accountType = "checking";
	
	Checking(double initalDeposit)
	{
		super();
		this.setBalance(initalDeposit);
		this.checkInterest(0);
	}
	@Override
	public String toString()
	{
		return "Account Type: " + accountType + " Account\n" +
				"Account Number: " + this.getAccountNumber() + "\n" +
				"Balance: " + this.getBalance() + "\n" + 
				"Interest Rate: " + this.getInterest() + "%\n";
	
	}
}
