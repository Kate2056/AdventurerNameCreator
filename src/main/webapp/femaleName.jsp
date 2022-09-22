<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Female Adventurer Name Creator</title>
</head>
<body>
<h1>Enter information to receive your female adventurer name: </h1>
<a href="index.jsp">If you would like a male name, click here!</a>
<br/>
<form action="getFemaleNameServlet" method="post">
Enter the first letter of your first name: <input type="text" name="userFirstLetter" size="10">
<br/>
Enter your birth month: <input type="text" name="userBirthMonth" size="10">
<br/>
Enter your birth day (ex 24): <input type="text" name="userBirthDate" size="10">
<br/>
<button type="submit" value="Create Name">Submit</button>
</form>
</body>
</html>