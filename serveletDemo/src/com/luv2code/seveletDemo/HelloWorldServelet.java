package com.luv2code.seveletDemo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
/**
 * Servlet implementation class HelloWorldServelet
 */

@WebServlet("/HelloWorldServelet")
public class HelloWorldServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorldServelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1: set the content type
		response.setContentType("text/html");
		//step 2:get the printWriter
		PrintWriter out = response.getWriter();
		//step3: get the HTML content
		out.println("<html><body>");
		out.println("<h2>Hello World</h2>");
		out.println("<hr>");
		out.println("Time at the server is : "+new java.util.Date());
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
