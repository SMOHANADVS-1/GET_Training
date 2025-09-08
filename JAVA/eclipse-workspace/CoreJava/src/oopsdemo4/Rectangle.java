package oopsdemo4;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :9:58:17 AM  
 * project :CoreJava
*/
//Rectangle class is implementing Shape Interface
public class Rectangle implements Shape {

	private double width;
	private double height;
	
	//generate constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
