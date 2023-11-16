<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles/forget.css" />
</head>
<body>
	<div class="contentcenter">
		<form action="Forgot" method="get">
			Email : <input type="text" name="email" placeholder="Enter your mail" required><br>
			User : <input type = "text" name="user" placeholder="Enter Username"required><br>
			Reset : <input type="password" name="reset" placeholder="Enter new pass" required><br>
			Confirm : <input type="password" name="confirm" placeholder="Confirm pass" required><br>
			<input type="submit" value="submit" class="submitbtn">
		</form>
	</div>
</body>
</html>