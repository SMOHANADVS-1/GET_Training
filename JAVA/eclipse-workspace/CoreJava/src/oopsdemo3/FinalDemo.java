package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 5, 2025
 * Time    :11:54:58 AM  
 * project :CoreJava
*/

/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class

*/
final class Hello
{
	final void display()
	{
		System.out.println("This is a final method");
	}
}

/*class World extends Hello//final classes cannot be extended
{
	//final methods cannot be overriden
	final void display()
	{
		System.out.println("This is a final method");
	}
	
}*/
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int AGE = 20;
		final float PI = 3.142f;
		//AGE = 30; //COMPILATION EROR- FINAL VARIABLE VALUES CANNOT BE CHANGED

	}

}
