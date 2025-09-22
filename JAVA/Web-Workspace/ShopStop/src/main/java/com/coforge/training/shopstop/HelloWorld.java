package com.coforge.training.shopstop;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")  //web servlet annotation -- no need of .xml file
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); //setting cotent type
		PrintWriter pw = response.getWriter(); //get the stream to write the data
		
		//writing html in the stream
		pw.println("<html><body>");
		pw.println("<h1> Welcome to my first servlet </h1>");
		pw.println("<hr>");
		pw.println("<h3> This is coforge training. My self Mohana learning to develop Web Application."
				+" using servlets</h3>");
		pw.println("I have Configured Tomcat Server in Eclipse IDE to run my Web Applications");
		pw.println("</body></html>");
		pw.println("Hello World from Servlet 😊😊😊😍"); //for emoji win+ .
		
		LocalDateTime dt = LocalDateTime.now();
		pw.println("<h3>Web Pages Served At  : "+dt+"</h3>");
		pw.println("<h3>Thank You </h3>");
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
