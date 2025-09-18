package assignments_day3;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :4:31:56 PM  
 * project :Java_Assignments
*/

public class Password {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Password: ");
		String password= s.next();
		

        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") && // At least one uppercase letter
            password.matches(".*[a-z].*") && // At least one lowercase letter
            password.matches(".*\\d.*") &&   // At least one digit
            password.matches(".*[@#$%^&+=!].*")) { // At least one special character
            System.out.println("Password is Strong!");
        } 
        else if (password.length() >=6 &&
                password.matches(".*[A-Z].*") && // At least one uppercase letter
                password.matches(".*[a-z].*") && // At least one lowercase letter
                password.matches(".*\\d.*")   // At least one digit
                ) { // At least one special character
                System.out.println("Password is Medium!");
            }else {
            System.out.println("Password is WEAK!!!!.");
        }

	}

}
