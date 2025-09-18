package assignments_day2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :2:59:01 PM  
 * project :Java_Assignments
*/

public class IT_City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter city :");
		String city = s.next().toLowerCase();
		if(city.equals("delhi")  ||city.equals("hyderabad")||city.equals("banglore") ||city.equals("mumbai")||city.equals("kolkata")||city.equals("chennai"))
		{
			System.out.println("IT City");
			
		}
		else
			System.out.println("Not IT City");
		s.close();

	}

}
