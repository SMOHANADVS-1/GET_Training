package java8features;

/**
 * Author  :Sola.Sri
 * Date    :Sep 11, 2025
 * Time    :3:39:55 PM  
 * project :AdvancedJavaProject
*/

public class Car implements Vehicle{
	
	private String brand;
	
	

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Car is Speeding Up !!!!!!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Car is slowing down !!";
	}
	

}
