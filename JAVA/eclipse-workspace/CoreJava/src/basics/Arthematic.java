package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author  :Sola.Sri
 * Date    :Aug 30, 2025
 * Time    :11:26:17 AM  
 * project :CoreJava
*/

public class Arthematic {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//Declaration of variables
		int a, b, sum, sub, mul;
		float div;
		String name;
		
		//BufferReader for Input
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//Input statement -- take input using BufferdReader
		System.out.println("Enter 2 numbers: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your Name : ");
		name = br.readLine(); // accepts multiple words directly
		
		//process
		sum = a+b;
		sub = a-b;
		mul = a*b;
		div = (float) a/b;
		
		//output
		System.out.println("************Arthematic Operations*******************");
		System.out.println("The sum of 2 Numbers is: "+ sum);
		System.out.println("The subraction of 2 Numbers is: "+ sub);
		System.out.println("The multiplication of 2 Numbers is: "+ mul);
		System.out.println("The Division of 2 Numbers is: "+ div);
		System.out.println("Program Created By: "+ name);
		System.out.println("****************************************************");
		

	}

}
