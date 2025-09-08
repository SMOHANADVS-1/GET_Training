package basics;

/**
 * This program calculates the area of a circle.
 * It demonstrates the use of the variables, arthematic operations,
 * and console output in java.
 *
 *@version 1.0
 */

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 7.5; //radius of the circle
		double area; //variable to store the area
		final double PI = 3.14159; // constant value for PI
		
		//calc area of circle
		area = PI * radius * radius;
		
		//print the area to the console
		System.out.println("The Area of the circle with radius "+ radius+ " is: "+area);

	}

}
