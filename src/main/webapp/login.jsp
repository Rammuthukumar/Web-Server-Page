<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TITLE</title>
<link rel="stylesheet" type="text/css" href="styles/login.css" />
</head>
<body>
	  <div class="contentcenter">
		  <form action="Login" method="get" class="form">
				Username : <input type = "text" name="uname" placeholder="Enter Username"class="textfield" required><br>
				Password : <input type = "password" name="pass"placeholder="Enter Password" class="passfield" required><br>
				<input class="loginbutton" type="submit" value="Login"></br>	
		  </form>
		  <br><br>
		  <span class="psw">Forgot <a href="forget.jsp">password?</a></span><br>
		  New User ? <a href ="register.jsp" ><button class="regbutton">Register</button></a> 
	  </div> 
</body>
</html>