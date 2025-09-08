package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 4, 2025
 * Time    :3:15:37 PM  
 * project :CoreJava
 * 
 * Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 * that is already provided by one of its super-classes or parent classes.
*/
class Bank
{
	private String name;
	
	public Bank(String name) {
		super();
		this.name = name;
	}
	int getRateOfInterest(){
        return 0;
    }
    void display(){
        System.out.println("Welcome to "+name+" Bank");
    }
	
}

class SBI extends Bank
{

	public SBI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	
}

class ICICI extends Bank
{

	public ICICI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	
}

class Axis extends Bank
{

	public Axis(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sbiBank = new SBI("SBI");
		ICICI iciciBank = new ICICI("ICICI");
		Axis axisBank = new Axis("Axis");
		
		sbiBank.display();
		System.out.println("The  Intrest Rate of Sbi is : "+sbiBank.getRateOfInterest());
		
		iciciBank.display();
		System.out.println("The  Intrest Rate of Sbi is : "+iciciBank.getRateOfInterest());
		
		axisBank.display();
		System.out.println("The  Intrest Rate of Sbi is : "+axisBank.getRateOfInterest());

	}

}
