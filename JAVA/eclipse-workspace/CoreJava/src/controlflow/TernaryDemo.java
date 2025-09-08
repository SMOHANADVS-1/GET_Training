package controlflow;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :11:46:34 AM  
 * project :CoreJava
 * 
 * Ternary Operator : It is a conditional Operator used in place of If-Else for Simple condition.
 * It Takes 3 Operands
 * Syntax: variable = condition ? expr1 : expr2
 *
 * Program to find Max of 2 Numbers
*/

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1110, b=220,max;
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);
		
		//Ternary Operator
		
		String msg = (a>b)? "A is Greatest" : "B is Greatest";
		System.out.println(msg);
		
		max = (a>b)? a:b;
		System.out.println("The max of 2 Nos is : "+max);
		

	}

}
