package assignments_day2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :2:13:46 PM  
 * project :Java_Assignments
*/

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the weight in kg :");
		float weight = s.nextFloat();
		System.out.println("Enter the Height in meters :");
		float height = s.nextFloat();
		 
		float BMI = weight/(height*height);
		System.out.println("BMI IS: "+String.format("%.2f", BMI));
		
		

	}

}
