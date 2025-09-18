package assignments_day3;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :4:04:41 PM  
 * project :Java_Assignments
*/

public class Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your side1: ");
		int side1= s.nextInt();
		System.out.println("Enter Your side2: ");
		int side2= s.nextInt();
		System.out.println("Enter Your side3: ");
		int side3= s.nextInt();
		if(side1>0 && side2>0 && side3>0) {
			if(side1 == side2 && side2== side3  && side3== side1)
			{
				System.out.println("Eqvilateral Triangle");
			}
			else if(side1 == side2 && side2!= side3 || side2 == side3 && side2!= side1||side1 == side3 && side2!= side3  )
			{
				System.out.println("Isosceles Triangle ");
			}
			else
			{
				System.out.println("Scalene Triangle");	
			}
		}
		else
			System.out.println("Enter valid lengths of triangle!!!!!");
		s.close();

	}

}
