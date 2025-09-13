package streamsdemo;

/**
 * Author  :Sola.Sri
 * Date    :Sep 12, 2025
 * Time    :10:36:34 AM  
 * project :AdvancedJavaProject
*/

public class MusicalInstrument {
	private String name;
	private String type;
	private double price;
	public MusicalInstrument(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
