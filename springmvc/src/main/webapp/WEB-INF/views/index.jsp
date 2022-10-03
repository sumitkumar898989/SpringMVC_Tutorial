<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<% 
	    String name= (String) request.getAttribute("namePerson");
	    out.println(name);
	
	%>
	
	<h1>Name is: <%=name%></h1>
</body>
</html>