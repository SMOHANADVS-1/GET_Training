package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :4:37:13 PM  
 * project :CoreJava
*/

public class StockTrading extends Trading {

	public StockTrading(double tradeAmount) {
		super(tradeAmount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tradeDetails() {
		System.out.println("Stock Trading: Investing in company shares.");
		System.out.println("Amount invested = " + tradeAmount);
	}

	@Override
	public double calculateProfitLoss() {

		// Assume 10% profit
		return tradeAmount * 0.10;
	}


}
