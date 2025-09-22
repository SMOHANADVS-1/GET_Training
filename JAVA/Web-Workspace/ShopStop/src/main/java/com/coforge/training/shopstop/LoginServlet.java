package com.coforge.training.shopstop;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        
        String u=request.getParameter("uname");
        String p=request.getParameter("pass");
        
        if ((u.equals("admin")) && (p.equals("redhat"))) {
        	
//        	rd interface has method forward() && include() for servlet communication		
        	RequestDispatcher rd = request.getRequestDispatcher("/DisplayServlet");
        	rd.forward(request, response); //fwd the servlet for to display the servlet
		} else {
			out.print("<h3> <font color = 'red'> Incorrect Password </font></h3><br>");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
			rd.include(request, response); // Includes Login.html in response.

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
