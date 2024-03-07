<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 8/2/2023
  Time: 7:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail student</title>
</head>
<body>
    <h1>Detail student</h1>
    <h2>Message 1: ${message}</h2>
    <h2>Message 2: ${message1}</h2>
    <table>
        <tr>
            <td>ID</td>
            <td>${student.id}</td>
        </tr>
        <tr>
            <td>ID</td>
            <td>${student.name}</td>
        </tr>
        <tr>
            <td>ID</td>
            <td>${student.address}</td>
        </tr>
    </table>
</body>
</html>
