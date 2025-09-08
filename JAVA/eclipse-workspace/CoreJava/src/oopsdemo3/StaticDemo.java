package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 5, 2025
 * Time    :11:30:57 AM  
 * project :CoreJava
*/
class Count
{
	private static int cnt;//static variable
	private int a; //instance variable
	
	Count()
	{
		cnt++;
		a = 100;
	}
	
	//static methos - It can use only static variables
	public static void display()
	{
		System.out.println("The Number of Objects Created : "+cnt);
		//a=a+10;
	}
	
	public void print(){
        System.out.println("Instance Method Variable : "+a);
    }
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		c1.print(); //Invokes Instance Methods
		Count.display(); //Invoke static methods

	}

}
