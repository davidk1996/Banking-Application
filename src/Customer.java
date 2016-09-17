
public class Customer {

	private Account account;
	private String ppsn;
	private String lastName;
	private String firstName;

	Customer(String firstName, String lastName, String ppsn, Account account)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsn = ppsn;
		this.account = account;
	}
	
	@Override
	public String toString()
	{
		return "Customer Information\n" +
				"First Name: " + firstName + "\n" +
				"Last Name: " + lastName + "\n" +
				"ppsn: " + ppsn + "\n" +
			    account;
	}
	
	public String basicInfo()
	{
		return 
				"First Name: " + firstName + "\n" +
				"Last Name: " + lastName + "\n" +
				"ppsn: " + ppsn + "\n" +
			    "Account Number: " + account.getAccountNumber();
	}
	Account getAccount()
	{
		return account;
	}
	
}
