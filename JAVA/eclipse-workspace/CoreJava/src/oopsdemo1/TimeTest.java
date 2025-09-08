package oopsdemo1;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :1:12:35 PM  
 * project :CoreJava
*/

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t = new Time(2,55,62);
		Time tt = new Time(22,2,60);
		
		t.addTimes(tt);
		System.out.println("The addition of two times:");
		t.display();
		
		
		

	}

}
