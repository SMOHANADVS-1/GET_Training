package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Candidates {
	Connection con;
	PreparedStatement pstmt; // Accepts values at run time - pre compiled statements
	ResultSet rs;
	
	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String newlastname;
	public void getConnection() throws Exception
	{
		con=ConnectionUtil.createConnection();
	}
	
	public void UpdateCandidate() throws Exception
	{
		sqlUpdate="UPDATE candidates SET last_name = ? WHERE id = ?";
		
		pstmt=con.prepareStatement(sqlUpdate);
		
		// prepare data for update
		s=new Scanner(System.in);
		System.out.println("enter Employee id:");
		eid=s.nextInt();
		System.out.println("enter employee's new last name :");
		newlastname=s.next();
				
		 // passing values to prepared statement using setter methods
		pstmt.setString(1, newlastname);
		pstmt.setInt(2, eid);
		
		cnt=pstmt.executeUpdate();
		System.out.println(String.format("Row affected : %d", cnt));
		
		// reuse the prepared statement
        newlastname = "Clinton";
        eid = 101;
        pstmt.setString(1, newlastname);
        pstmt.setInt(2, eid);

        cnt = pstmt.executeUpdate();
        System.out.println(String.format("Row affected %d", cnt));
        con.close();
	}

	// Instance class to Update data in candidates table using PreparedStatement

	public static void main(String[] args) throws Exception {
		
	Candidates a=new Candidates();
	System.out.println("----Update Candidate----");
	try {
	a.getConnection();
	a.UpdateCandidate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
}}
