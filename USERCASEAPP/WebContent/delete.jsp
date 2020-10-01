<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="DeleteContact" method="post">
    Enter your name<input type="text" name="username"><br>
    <button>submit</button>
   </form>
   
   <form action="Logout.java" method="get">
	    <button  value="logout">logout</button>
	</form>
	<a href="DisplayAllItems">Display All contacts</a>    
</body>
</html>