package jdbcdemo;

import java.sql.*;

public class SelectDemo {

	private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
	private static final String  USER = "root";
	private static final String  PASSWORD = "MyPass123";
	
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	
	
	try
	{
		//1.load MYSQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("MYSQL Driver Loaded Successfully");
		
		//2.Establish connection
		conn = DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("Connected to database Successfully");
		
		//3.Create Statement
		stmt = conn.createStatement();
		
		//4.Execute query
		String sql = "SELECT customerNumber,customerName,city,creditLimit from customers";
		rs = stmt.executeQuery(sql);
		System.out.println("-----------Customer Records--------------");
		
		//5.Process ResultSet
		while (rs.next()) {
			int id = rs.getInt("customerNumber");
			String name = rs.getString("customerName");
			String city = rs.getString(3);
			double credit = rs.getDouble(4);
			
			System.out.printf("CustomerID: %d| CustomerName: %s|City: %s|"+"CreditLimit: %2f%n",id,name,city,credit);
			
		}
		
	}catch(Exception e)
	{
		System.out.println("Database Operation Failed");
		e.printStackTrace();
	}
	finally {
		//6.close resources manually
		try {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
			
		} catch ( Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Resources closed");
	}
}
	

}











