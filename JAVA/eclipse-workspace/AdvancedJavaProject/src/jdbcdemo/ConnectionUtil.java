package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

//Utility Class to create a Connection
public class ConnectionUtil {

	public static Connection createConnection() throws Exception {
		// Load the MySQL JDBC driver
					Class.forName("com.mysql.cj.jdbc.Driver");

					// Establish the connection
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","MyPass123");
					return con;


	}

}
