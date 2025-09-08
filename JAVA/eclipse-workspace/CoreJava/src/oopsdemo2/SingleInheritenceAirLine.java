package oopsdemo2;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :4:55:00 PM  
 * project :CoreJava
*/

public class SingleInheritenceAirLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create booking (child class object)
		AirLinesBooking booking1 = new AirLinesBooking("James Gosling", 32, "FG567766");
		booking1.bookTicket();
		booking1.displayPassengerDetails();
		booking1.displayBookingDetails();
		
		//create booking (child class object)
		
		AirLinesBooking booking2 = new AirLinesBooking("Mohana", 22, "ZWER34567");
		booking2.bookTicket();
		booking2.displayPassengerDetails();
		booking2.displayBookingDetails();

	}

}
