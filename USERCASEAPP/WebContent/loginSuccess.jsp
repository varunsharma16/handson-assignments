<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Welcome to Use Case App</h3>
	Hello ${user.userId}!<br>
	<a href="update.jsp">Update Your Contact</a></br>
	<a href="displayAllItems">Display All Contacts</br>
	<form action="Logout.java" method="get">
	    <button  value="logout">logout</button>
	
	
	</form>
  

</body>
</html>