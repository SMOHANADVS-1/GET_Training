package assignments_day4;
/**
 *Author :Sola.Sri
 *Date   :Sep 25, 2025
 *Time   :9:50:30 AM
 *Project:Java_Assignments
*/

public class useBankAccount {

	public static void main(String[] args) {
		BankAccount b =new BankAccount();
		System.out.println("Name: " +b.getName());
		System.out.println("amount: " +b.getAmount());
		
		b.setName("mohana");
		b.setAmount(500);
	
		System.out.println("Name: " +b.getName());
		System.out.println("amount: " +b.getAmount());
		b.deposit(25);
		System.out.println("amount: " +b.getAmount());
		b.withdraw(60);
		System.out.println("amount: " +b.getAmount());
		

	}

}
