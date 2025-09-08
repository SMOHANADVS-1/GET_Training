package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :4:34:01 PM  
 * project :CoreJava
 * 
 * Method Overriding example
*/

public class Trading {
	protected double tradeAmount;

	public Trading(double tradeAmount) {
		super();
		this.tradeAmount = tradeAmount;
	}
	

	// Method to be overridden
	    public void tradeDetails() {
	        System.out.println("General Trading: Amount invested = " + tradeAmount);
	    }

	    // Profit/Loss calculation (default)
	    public double calculateProfitLoss() {
	        return 0; // No calculation for general trading
	    }

}
