package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//annotions can be used instead of writing lengthy codes in web.xml
//@WebServlet("/add")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//externally typecasting the attribute that we have received (request dispatcher technique)
		/*
		int k = (int) req.getAttribute("k");
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+ k); 
		*/
		
		//data with session managenemt can be retrived as follows:
		
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+ k);
		
		
		//data with cookies can be retrived as an array as follows:
		//the output might be displayed directly sometimes .. it is because cookies
		//rememebr user data ..so it remembers user data!!
		/*
		int k=0;
		Cookie cookies[] =  req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				System.out.println(c.getValue());
				k = Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		
		PrintWriter out = res.getWriter();
		//if we want to have html tags we need ti write like this for servelts.. 
		//otherwise use JSP.
		out.println("<html><body bgcolor= 'cyan'>");
		out.println("Result is "+ k);
		out.println("</body></html>");
		*/
		
		ServletContext sc = getServletContext();
		String str = sc.getInitParameter("name");
		out.println(str);
	
		/*
		ServletConfig cg = getServletConfig();
		 String str = cg.getInitParameter("name");
		 out.println(str);
		 */

		
		
	}

}
