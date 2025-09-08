package oopsdemo3;

/**
 * Author  :Sola.Sri
 * Date    :Sep 5, 2025
 * Time    :2:53:26 PM  
 * project :CoreJava
*/
//Constructor Overloading
public class CargoShipment {
	
	private String shipmentId;
    private String sender;
    private String receiver;
    private double weight;   // in kg
    private String destination;
    private String cargoType;
    
    //Constructor 1:only shipmenId and destination(basic booking)
	public CargoShipment(String shipmentId,String destination) {
		this.shipmentId = shipmentId;
		this.weight = 0.0;
		this.destination = destination;
		this.cargoType = "General";
	}

	//constructor 2:shipment with sender,receiver, and weight
	public CargoShipment(String shipmentId, String sender, String receiver, double weight) {
		this.shipmentId = shipmentId;
		this.sender = sender;
		this.receiver = receiver;
		this.weight = weight;
		this.cargoType = "General";
	}
	//constructor 3:shipment with all details
	public CargoShipment(String shipmentId, String sender, String receiver, double weight, String destination,	String cargoType) {
		this.shipmentId = shipmentId;
		this.sender = sender;
		this.receiver = receiver;
		this.weight = weight;
		this.destination = destination;
		this.cargoType = cargoType;
	}

	public void showShipmentDetails() {
		System.out.println("Shippment ID: "+shipmentId);
		System.out.println("Sender: "+sender);
		System.out.println("Receiver: "+receiver);
		System.out.println("Weight: "+weight+" KG");
		System.out.println("Destination: "+destination);
		System.out.println("CARGO TYPE:"+cargoType);
		System.out.println("---------------------------------");
		
	}
	
	
	
    

}
