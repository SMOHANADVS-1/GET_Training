package oopsdemo2;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :9:49:41 AM  
 * project :CoreJava
*/
//MultiLevel Inheritance

public class Account {
	
	// Multilevel Inheritance
	 // base class for SavingsBank


		int accNo;
		String name;
		public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}



		
	  
	  
	  
	  void display()
		{
			System.out.println("************ Account Details ************");
			System.out.println("Account Number :"+accNo);
			System.out.println("Customer Name :"+name);
		}

}
