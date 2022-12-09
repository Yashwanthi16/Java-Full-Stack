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
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //this workon HTTP 1.1 version
	response.setHeader("Pragma","no-cache"); //for HTTP 1.0 which is an older version
	response.setHeader("Expires","0"); //for proxy servers the page must expire as soon as we go away from that page
	
	if(session.getAttribute("uname") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome to Videos Page!!
	<br>
	<! embed link of youtube video>
	
	Below is the link for a beautiful song
	<iframe width="560" height="315" src="https://www.youtube.com/embed/QSvL_lKcft0?start=564" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	
</body>
</html>