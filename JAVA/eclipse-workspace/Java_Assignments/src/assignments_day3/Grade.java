package assignments_day3;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :3:50:42 PM  
 * project :Java_Assignments
*/

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Score: ");
		int score= s.nextInt();
		
		if (score>=90 && score<=100) {
			System.out.println("Your Grade is A");
			
		}
		if (score>=80 && score<=89) {
			System.out.println("Your Grade is B");
			
		}
		if (score>=70 && score<=79) {
			System.out.println("Your Grade is C");
			
		}
		if (score>=60 && score<=69) {
			System.out.println("Your Grade is D");
			
		}
		if(score>=0 && score<=59) {
			System.out.println("FAIL");
		}
		s.close();

	}

}
