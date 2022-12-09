

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// we need to remove the attributes of session object before logging out this edns the sesssion.
		// when we set the attributes we are starting the session but when we remove the attributes we end the session
		
		HttpSession session = request.getSession();
		session.removeAttribute("uname");
		session.invalidate(); //removes all the data
		response.sendRedirect("login.jsp");
		
	}

}
