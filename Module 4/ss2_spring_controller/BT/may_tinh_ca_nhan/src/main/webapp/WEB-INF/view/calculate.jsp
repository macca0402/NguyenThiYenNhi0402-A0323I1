<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/6/2023
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculate</h1>
<form action="/calculate" method="get">
    <input type="text" name="number1" placeholder="Number 1: "><br><br>
    <input type="text" name="number2" placeholder="Number 2: "><br>
    <input type="submit" value="+" name="action">
    <input type="submit" value="-" name="action">
    <input type="submit" value="*" name="action">
    <input type="submit" value="/" name="action">
</form>
<span>Ket qua : ${result}</span>

</body>
</html>
