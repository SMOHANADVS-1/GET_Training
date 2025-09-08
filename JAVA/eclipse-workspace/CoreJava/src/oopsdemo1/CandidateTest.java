package oopsdemo1;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :12:14:21 PM  
 * project :CoreJava
*/

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke parameterized constructors
		Candidate cd1 = new Candidate(101,"Mohana",5000.00f);
		Candidate cd2 = new Candidate(102,"nikki",6000.00f);
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();
		

	}

}
