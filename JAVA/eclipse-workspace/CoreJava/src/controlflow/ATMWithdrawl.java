package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :2:33:01 PM  
 * project :CoreJava
 * 
 * Java Program to simulate an ATM machine where a user can 
 attempt to withdraw money until they decide to exit.
*/

public class ATMWithdrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        int balance = 10000; // initial account balance
	        int choice;
	        
	        do {
	            System.out.println("\n=== ATM MENU ===");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your current balance is: ₹" + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    int amount = scanner.nextInt();
	                    
	                    if (amount > balance) {
	                        System.out.println("❌ Insufficient Balance!");
	                    } else if (amount <= 0) {
	                        System.out.println("❌ Invalid Amount!");
	                    } else {
	                        balance -= amount;
	                        System.out.println("✅ Please collect your cash: ₹" + amount);
	                        System.out.println("Remaining Balance: ₹" + balance);
	                    }
	                    break;

	                case 3:
	                    System.out.println("Thank you for using our ATM. Goodbye!");
	                    break;

	                default:
	                    System.out.println("⚠️ Invalid choice, please try again.");
	            }

	        } while (choice != 3); // loop continues until user chooses Exit
	        
	        scanner.close();


	}

}
