package assignments_day2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :2:09:14 PM  
 * project :Java_Assignments
*/

public class CurrentAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Birth Year: ");
		int birthyear=s.nextInt();
		int curr_age = 2024-birthyear;
		System.out.println("Current Age is: "+curr_age);

	}

}
