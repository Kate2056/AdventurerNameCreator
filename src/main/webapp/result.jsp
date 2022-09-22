<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adventurer Name Result!</title>
</head>
<body>
<p>Your Adventurer Name Is:</p>
<br/>
<p>
${userAdventurerName.toString() }
</p>
<br/>
<a href="index.jsp">Create Another Adventurer Name!</a>
</body>
</html>