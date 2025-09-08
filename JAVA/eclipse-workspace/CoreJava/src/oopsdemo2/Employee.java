package oopsdemo2;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :4:19:01 PM  
 * project :CoreJava
 * 
 * Single Inheritance Example

*/

public class Employee { //parent class / base class / super class

		private int empId;
		private String name;
		
		//generate constructors using fields
		public Employee(int empId, String name) {
			this.empId = empId;
			this.name = name;
		}
		

		  void display()
			{
				System.out.println("********** Employee Details ***************");
				System.out.println("Employee Id :"+empId);
				System.out.println("Employee Name: "+name);
			}
		
		
}
