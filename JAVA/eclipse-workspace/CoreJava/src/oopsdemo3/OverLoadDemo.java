package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :2:36:12 PM  
 * project :CoreJava
 * 
 * Program to demonstrate Method Overloading. - Static Polymorphism
 *
 * Overload add() method with different type/no. of Arguments
*/
class Addition
{
	public void add()
	{
		System.out.println("Method Overloading Demo");
	}
	
	public void add(int a,int b)
	{
		System.out.println("The Addition of 2 No is: "+(a+b));
	}
	
	public void add(double a,double b)
	{
		System.out.println("The Addition of 2 float No is: "+(a+b));
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println("The Addition of 3 No is: "+(a+b+c));
	}
	
	public void add(String s1,String s2)
	{
		System.out.println("The Addition of 2 Strings is: "+(s1+s2));
	}
}

public class OverLoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a1 = new Addition();
		 //invoke Overload method add()
		a1.add();
		a1.add(20,30.f);
		a1.add(34.55f,530.50f);//type promotion- float->double
		a1.add(100,300,600);
		a1.add("Java","Programming");

	}

}
