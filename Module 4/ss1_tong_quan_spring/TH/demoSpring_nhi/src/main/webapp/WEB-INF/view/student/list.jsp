<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
    <h1>List students</h1>
    <a href="/student/create">Create new student</a>
    <h4>${message}</h4>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Hobby</th>
            <th>Detail</th>
            <th>Edit</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.address}</td>
                <td>${student.displayHobbies()}</td>
                <td>
                    <a href="/student/detail/${student.id}">Detail 1</a>
                    <a href="/student/detail2?id=${student.id}">Detail 2</a>
                </td>
                <td>
                    <a href="/student/edit?id=${student.id}">Edit</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
