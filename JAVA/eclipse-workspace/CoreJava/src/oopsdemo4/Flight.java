package oopsdemo4;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :10:05:59 AM  
 * project :CoreJava
*/
//Flight Booking System using Interfaces

public interface Flight {

	
	String getFlightNumber();
		String getAirline();
		String getDeparture();
		String getArrival();
		double getPrice();
		void displayFlightDetails();
}



//Booking Interface
interface Booking {
	void bookFlight(Flight flight, Passenger passenger);
	void cancelBooking(String bookingId);
	void displayBookingDetails();
}

//Payment Interface
interface Payment {
	void processPayment(double amount);
	boolean isPaymentSuccessful();
	String getTransactionId();
}

//Passenger Interface
interface Passenger {
	String getName();
	String getPassportNumber();
	String getContactInfo();
}
