package oopsdemo4;

/**
 * Author  :Sola.Sri
 * Date    :Sep 5, 2025
 * Time    :4:29:58 PM  
 * project :CoreJava
*/
//Main class to demonstrate the hospital management system using Abstraction, Inheritance, and Polymorphism


public class HospitalManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create different types of hospital staff
        Doctor doctor = new Doctor("Dr. Smith", "DOC123", "Cardiology", "Cardiologist");
        Nurse nurse = new Nurse("Nurse Johnson", "NUR456", "Emergency", 8);
        AdminStaff admin = new AdminStaff("Mr. Davis", "ADM789", "Administration", "Billing");

        // Demonstrate polymorphic behavior
        HospitalStaff[] staffMembers = {doctor, nurse, admin};

        for (HospitalStaff staff : staffMembers) {
            System.out.println("\n--- " + staff.getName() + " (" + staff.getId() + ") ---");
            staff.performDuties();  // Calls the appropriate implementation
            staff.attendMeeting();  // Uses the inherited method
            
            // Additional role-specific methods
            if (staff instanceof Doctor) {
                ((Doctor) staff).prescribeMedication();
            } else if (staff instanceof Nurse) {
                ((Nurse) staff).administerMedication();
            } else if (staff instanceof AdminStaff) {
                ((AdminStaff) staff).processPaperwork();
            }
        }
	}

}
