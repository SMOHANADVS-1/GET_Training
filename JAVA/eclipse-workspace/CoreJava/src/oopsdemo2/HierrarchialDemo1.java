package oopsdemo2;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :10:40:58 AM  
 * project :CoreJava
 * 
 * / Java program to implement Hierarchical Inheritance
 * 
 * 				Doctor
 *     Specialist	 NonSpecialist
 
 
*/

public class HierrarchialDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		 //invoke child class Specialist constructor
				Specialist spObj=new Specialist(1001,"Mary","New York","Cardiologist");
				Specialist spObj2=new Specialist(1002,"Siya","India","Gynechologist");
				Specialist spObj3=new Specialist(1003,"Rama","Switzerland","Pulmanologist");
				
				spObj.display(); // invoke child class Specialist display() method
				spObj2.display();
				spObj3.display();
				
				//invoke child class NonSpecialist constructor
				NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");
				
				nspObj.display();// invoke base class Doctor display() method
	}

}
