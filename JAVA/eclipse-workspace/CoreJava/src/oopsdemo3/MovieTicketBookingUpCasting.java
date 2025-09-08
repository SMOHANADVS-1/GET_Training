package oopsdemo3;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 5, 2025
 * Time    :10:06:40 AM  
 * project :CoreJava
 */

public class MovieTicketBookingUpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Ticket[] tickets = new Ticket[5];
		int count = 0;

		while (true) {
			System.out.println("\n🎬 Movie Ticket Booking System 🎟️");
			System.out.println("1. Book Regular Ticket");
			System.out.println("2. Book Premium Ticket");
			System.out.println("3. Show All Tickets");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				if (count < tickets.length) {
					System.out.print("Enter Movie Name: ");
					String movie = sc.nextLine();
					System.out.print("Enter Price: ");
					double price = sc.nextDouble();
					sc.nextLine();
					System.out.print("Enter Seat Number: ");
					String seat = sc.nextLine();

					// Upcasting: RegularTicket stored in Ticket reference
					tickets[count++] = new RegularTicket(movie, price, seat);
					System.out.println("✅ Regular Ticket Booked!");
				} else {
					System.out.println("⛔ Ticket limit reached!");
				}
				break;

			case 2:
				if (count < tickets.length) {
					System.out.print("Enter Movie Name: ");
					String movie = sc.nextLine();
					System.out.print("Enter Price: ");
					double price = sc.nextDouble();
					sc.nextLine();
					System.out.print("Enter Lounge Access (Yes/No): ");
					String lounge = sc.nextLine();

					// Upcasting: PremiumTicket stored in Ticket reference
					tickets[count++] = new PremiumTicket(movie, price, lounge);
					System.out.println("✅ Premium Ticket Booked!");
				} else {
					System.out.println("⛔ Ticket limit reached!");
				}
				break;

			case 3:
				System.out.println("\n📌 Booked Tickets:");
				for (int i = 0; i < count; i++) {
					tickets[i].showTicketDetails();

					// Downcasting to access child-specific methods
					if (tickets[i] instanceof RegularTicket) {
						RegularTicket rt = (RegularTicket) tickets[i]; // Downcasting
						rt.showSeat();
					} else if (tickets[i] instanceof PremiumTicket) {
						PremiumTicket pt = (PremiumTicket) tickets[i]; // Downcasting
						pt.showLoungeAccess();
					}
					System.out.println("-------------------------");
				}
				break;

			case 4:
				System.out.println("👋 Thank you for using Movie Ticket Booking System!");
				sc.close();
				return;

			default:
				System.out.println("❌ Invalid choice! Try again.");
			}
		}

	}

}
