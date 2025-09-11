package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","MyPass123");

			// Create a statement object to execute the query
			stmt=con.createStatement();

			// Execute the query and get the result set
			rs=stmt.executeQuery("SELECT id,first_name,dob,phone,email from candidates order by id");

			// Process the result set
			while(rs.next())
			{
				// Retrieve data by column name or index
				System.out.println(rs.getInt("id")+"\t"+rs.getString(2)+"\t"+rs.getDate("dob")+"\t"+rs.getString("phone")+"\t"+rs.getString("email"));
			}
			con.close();
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}

	}

}
