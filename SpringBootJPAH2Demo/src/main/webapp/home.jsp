<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="addAlien">
	Enter AID <input type="text" name="aid"><br>
	Enter ANAME <input type="text" name="aname"><br>
	<input type="submit">
	</form>
	
	<form action="getAlien">
	Enter AID <input type="text" name="aid"><br>
	<input type="submit">
	</form>
	
	welcome ${alien}
	
</body>
</html>