package exceptionsdemo;

public class UserDefinedExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ck1 = new CheckingAccount(101);
		System.out.println("Depositing 5000$........");
		ck1.deposit(5000);
		
		try
		{
			System.out.println("Withdrawing 2000$.............");
			ck1.withdraw(2000);
			
			System.out.println("Withdrawing 5000$.............");
			ck1.withdraw(5000);
		}
		catch(InSufficientFundsException e)
		{
			System.out.println("Sorry Insufficient Balance: "+ck1.getBalance());
			e.printStackTrace();
		}

	}

}
