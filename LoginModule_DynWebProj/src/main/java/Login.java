

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import DAO.LoginDao;


public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("uname");
		String password = request.getParameter("password");
		
		//not a good practice to create DAO object here 
		LoginDao dao = new LoginDao();
		
		if (dao.check(uname,  password)) {
			
			//if the user is valid then create session object and proceed further!!
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("password", password);
			response.sendRedirect("welcome.jsp");
		}
		
		else {
			response.sendRedirect("login.jsp");
		} 
	}

}
