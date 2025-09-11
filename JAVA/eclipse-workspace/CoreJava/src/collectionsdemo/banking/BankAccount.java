package collectionsdemo.banking;

public class BankAccount <T>{
	private String accountHolder;
	private T accountNumber;  // Can be Integer, Long, String, etc.
	public BankAccount(String accountHolder, T accountNumber) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public T getAccountNumber() {
		return accountNumber;
	}


	public void displayAccountInfo() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
	}

}
