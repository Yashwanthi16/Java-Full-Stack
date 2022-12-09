<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		
	<! if we don't use session object then we can open welcome page even without logining in>
	<! so we need to do some checks (s) even in this page instead of directly displaying it>
	<%
		// we don't want to see the secure page after logging out.
	//so we have to include these lines of code
	//the page must not be cached and must be revalidated for login details everytime it is accessed
	
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //this workon HTTP 1.1 version
	response.setHeader("Pragma","no-cache"); //for HTTP 1.0 which is an older version
	response.setHeader("Expires","0"); //for proxy servers the page must expire as soon as we go away from that page
	
		if(session.getAttribute("uname") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	
	<! using JSTL here to get the username in the page, it fetches uname from session>
	
	Welcome ${uname}!!
	<br>
	<a href= "videos.jsp">Videos Here</a><br>
	
	<form action="Logout">
		<input type = "submit" value="Logout">
	</form>

</body>
</html>