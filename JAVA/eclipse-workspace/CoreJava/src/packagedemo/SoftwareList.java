package packagedemo;

import com.coforge.training.microsoftproj.OperatingSystem;
import com.coforge.training.oracleproj.Database;

//Program to demonstrate import & usage of user-defined Packages
public class SoftwareList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem op1 = new OperatingSystem();
		Database db1 = new Database();
		
		System.out.println("****************List of Operating System from Microsft******************");
		op1.listSoftware();//invoke method from other user defined package
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("******************************List of Databases from Oracle *********************");
		db1.printSoftware(); 

	}

}
