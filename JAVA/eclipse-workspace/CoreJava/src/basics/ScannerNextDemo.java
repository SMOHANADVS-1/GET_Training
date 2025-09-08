package basics;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Aug 30, 2025
 * Time    :11:58:17 AM  
 * project :CoreJava
 * 
 * Program to demonstrate Scanner next()  method with Character & Strings


*/

public class ScannerNextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch;
		        String fullName,firstName;
		        Scanner scanner=new Scanner(System.in);

		        System.out.println("Enter your Initials :");
		        ch=scanner.next().charAt(0); // Single Character Input
		        System.out.println("Enter Your First Name : ");
		        firstName=scanner.next(); // Single Word Input

		        scanner.nextLine(); // to Pause & take input for nextLine()
		        System.out.println("Enter Your Full Name :");
		        fullName=scanner.nextLine(); // Multiple Words Input

		        //scanner.close();

		        System.out.println("Your Initials : "+ch);
		        System.out.println("First Name    : "+firstName);
		        System.out.println("Full Name     : "+fullName);
		        
		        scanner.close();

	}

}
