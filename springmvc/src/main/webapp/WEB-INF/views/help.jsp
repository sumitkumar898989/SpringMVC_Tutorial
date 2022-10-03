<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>This is Help Page</h1>
	<% 
	    /* String name= (String) request.getAttribute("Name");
		Integer rollNo= (Integer) request.getAttribute("rollNo"); */
	
	%>
	
	<h1>Name is: 
	<%-- <%=name%> --%>  
	${Name} 
	</h1>
	<h1>RollNo is: 
	<%-- <%=rollNo%> --%>
	${rollNo} 
	</h1>
	<hr>
	${marks} 
	
	<c:forEach var="item" items="${marks}">
			<h1>${item} </h1>
	</c:forEach>
	
</body>
</html>