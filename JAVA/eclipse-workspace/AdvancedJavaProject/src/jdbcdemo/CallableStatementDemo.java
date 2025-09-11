package jdbcdemo;

import java.util.Scanner;


public class CallableStatementDemo {
public static void main(String[] args) {
	

	try {
		Skills s=new Skills();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Candidate Id : ");
		int id=scan.nextInt();
		
		s.getSkils(id);
		scan.close();
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
