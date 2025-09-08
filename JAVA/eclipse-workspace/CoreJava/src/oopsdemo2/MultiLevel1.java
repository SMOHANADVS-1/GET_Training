package oopsdemo2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :9:58:12 AM  
 * project :CoreJava
 * 
 * Multi Level Inheritance  
 *  Account  --- > SavingsBank ---> AccountDetails
*/

public class MultiLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Account Details of Customer(Cust No,Name, Balance):");
		int custNo=scanner.nextInt();
		scanner.nextLine();
		String name=scanner.nextLine();
		int balance=scanner.nextInt();
		final int MIN_BAL=1000;
		System.out.println("Enter Amount to Deposit:");
		int deposit=scanner.nextInt();
		System.out.println("Enter Amount to Withdraw:");
		int withdraw=scanner.nextInt();
		
		AccountDetails ac1 = new AccountDetails(custNo, name, MIN_BAL, balance, withdraw, deposit, balance);
		ac1.display();
		scanner.close();

	}

}
