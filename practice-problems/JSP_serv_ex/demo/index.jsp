<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Form Example</title>
</head>
<body>
    <h1>JSP Form Example</h1>
    <form action="MyServlet" method="post">
        Enter your name: <input type="text" name="name">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
