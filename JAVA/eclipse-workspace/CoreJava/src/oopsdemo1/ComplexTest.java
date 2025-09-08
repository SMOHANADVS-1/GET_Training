package oopsdemo1;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :12:31:07 PM  
 * project :CoreJava
*/

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(10.3, 67.4); //invokes Constructor
		Complex c2 = new Complex(0.7, 3.6);
		Complex c3 = new Complex(1.0, 1.0);
		
		c1.add(c2);  //c1+c2 //calls method add() by passing object c2
		System.out.println("The Addition of 2 Complex number is : ");
		c1.display();
		
		c1.add(c3); //c1+c3
		System.out.println("The Addition of 2 Complex number is : ");
		c1.display();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter real and imaginary part of complex number : ");
		double r = s.nextDouble();
		double i = s.nextDouble();
		
		Complex c4 = new Complex(r, i);
		
		c2.add(c4);//c2+c4
		System.out.println("The addition of 2 complex number is : ");
		c2.display();


	}

}
