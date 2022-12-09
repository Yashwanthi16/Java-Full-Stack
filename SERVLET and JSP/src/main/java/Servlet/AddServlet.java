package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/sq")
public class AddServlet extends HttpServlet {
	
	//method name must be service only or we can write doGet or doPost also accordingly!!
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		//converting user text to int using parseInt() method, can't use external casting 
		//as string is an object not primitive data type
		
		//request from client comes in the form of objects so we use methods like getParameter to read the inputs
		 int i = Integer.parseInt(req.getParameter("num1"));
		 int j = Integer.parseInt(req.getParameter("num2"));
		 
		 int k = i+j;
		 
		 
		 //res.getWriter() returns an object of the type PrintWriter
		 //this is used to print output on the client screen 
		 //res.getWriter().println("result is" + k);
		 
		 //this can also be written as:
		 /*
		 	PrintWriter out = res.getWriter();
		 	out.println("result is" + k);
		 */
	
		 //adding attributes to request object. this will be also available in the servlet being called
		 /*
		 req.setAttribute("k", k);
		 //calling SqServlet from AddServlet
		 RequestDispatcher rd = req.getRequestDispatcher("sq");
		 rd.forward(req, res);
		 */
		 
		 //using sendRedirect with session management:
		 
		 HttpSession session = req.getSession();
		 session.setAttribute("k",k);
		 res.sendRedirect("sq");
		 
		 
		 //using sendRedirect with cookies:
		 //making k as string here 
		 /*
		 Cookie cookie = new Cookie("k", k+"");
		 res.addCookie(cookie);
		 res.sendRedirect("sq");
		 */
		 		
	}
}
