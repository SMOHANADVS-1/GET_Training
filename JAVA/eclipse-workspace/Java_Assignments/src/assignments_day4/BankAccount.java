package assignments_day4;
/**
 *Author :Sola.Sri
 *Date   :Sep 25, 2025
 *Time   :9:49:57 AM
 *Project:Java_Assignments
*/
//doing by 
public class BankAccount {
	private String name;
	private double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	//double deposit =0;
	
	public double deposit(double damount)
	{ 
		System.out.println("Amount to be Deposited :"+damount);
		damount = amount+damount;
		
		amount=damount;
		return amount;
		
	}
	//double withdraw = 0;
	public double withdraw(double wamount)
	{ 
		System.out.println("Amount to  Withdraw :"+wamount);
		amount = amount-wamount;
		
		//amount=wamount;
		return amount;
		
	}
	
	
	
	
	
	

}
