<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>


<a href="https://www.youtube.com/@sharan._.j4810" target="_blank">Sharan music videos</a>
<a href="https://youtu.be/T3kA1rjOCgY?si=fOE3ErlQasGzap5N" target="_blank">The Alchemist Book Summary</a>
	
<form action="Logout">
<input type ="submit" value="Logout"> 
</form>

</body>
</html>