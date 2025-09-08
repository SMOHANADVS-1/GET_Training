package exceptionsdemo;

public class InSufficientFundsException extends Exception {

	/**
	 *user defined exception
	 */
	private static final long serialVersionUID = 1L;
	
	private double amount;
	
	public InSufficientFundsException(double amount)
	{
		this.amount = amount;
		
	}
	public double getAmount()
	{
		return amount;
	}

}
