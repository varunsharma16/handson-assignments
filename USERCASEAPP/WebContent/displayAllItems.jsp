<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  prefix:"c"  uri="http:///java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Contacts Are</h3>
	<table>
	   <thead>
	     <tr>
	     <th>Name</th>
	     <th>Contact</th>
	     </tr>
	    </thead>
	    <tbody>
	       <c:forEach items="${usercontacts }" var="u">
	       <tr>
	       <td>${u.name }</td>
	       <td>${u.phone }</td>
	       </tr>
	       </c:forEach>
	       
	    
	    
	    </tbody> 
	     
	</table>
        
    <a href="login.html">Click here to Login</a><br>
	<a href="register.html">Click here to Register</a><br>
	<a href="update.jsp">Update Your Phone</a><br>
	<a href="updatename.jsp">Update Your Name</a>
	<form action="Logout.java" method="get">
	    <button  value="logout">logout</button>
	

</body>
</html>