package exceptionsdemo;

public class CheckingAccount {
	private double balance;
    private int number;
    
    public CheckingAccount(int number) {
		super();
		this.number = number;
	}
    
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}


    public void deposit(double amount) {
       balance += amount;
   }
   
   
   // method may throw user defined exception - InSufficientFundsException
   public void withdraw(double amount) throws InSufficientFundsException {
       if(amount <= balance) {
           balance -= amount;
       }else {
           double needs = amount - balance;
           throw new InSufficientFundsException(needs);
       }
   
    }

}
