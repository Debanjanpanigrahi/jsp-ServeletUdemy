package com.luv2code.serveletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParam
 */
@WebServlet("/TestParam")
public class TestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//setp 1: set content type
		response.setContentType("text/html");
		
		ServletContext context = getServletContext();

		System.out.println("===== CONTEXT PARAMETERS =====");

		Enumeration<String> params = context.getInitParameterNames();

		while (params.hasMoreElements()) {
		    String name = params.nextElement();
		    String value = context.getInitParameter(name);

		    System.out.println(name + " = " + value);
		}
		
		//step 2 : get printwriter
		PrintWriter out = response.getWriter();
		//step 3: get configuration params
		//ServletContext context = getServletContext();
		
		String maxsize =  context.getInitParameter("max-shoping-cart-size");
		if (maxsize != null) {
		    System.out.println("Parameter exists: " + maxsize);
		} else {
		    System.out.println("Parameter does not exist");
		}
		
		String teamName=context.getInitParameter("project-team-name");
		//step 4: generate HTML content
		out.println("<html><body>");
		out.println(maxsize);
		out.println("<br/><br/>");
		out.println(teamName);
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
