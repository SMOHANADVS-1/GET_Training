package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Author  :Sola.Sri
 * Date    :Aug 30, 2025
 * Time    :10:35:32 AM  
 * project :CoreJava
 */

public class BufferreaderDemo {

	public static void main(String[] args) throws  Exception{
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter your salary");
		float salary = Float.parseFloat(br.readLine());

		System.out.println("Welcome " +name+",your age is: "+age);
		System.out.println("salary: "+salary);

	}

}
