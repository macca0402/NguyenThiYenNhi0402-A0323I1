<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 8/7/2023
  Time: 6:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Create new student</title>
</head>
<body>
    <h1>Create new Student</h1>
    <form:form action="/student/create" method="post" modelAttribute="student">
        <table>
            <tr>
                <td>ID</td>
                <td>
                    <c:choose>
                        <c:when test="${action == 'create'}">
                            <form:input path="id" />
                        </c:when>
                        <c:otherwise>
                            ${student.id}
                            <form:hidden path="id" />
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Hobby</td>
                <td>
                    <form:checkboxes path="hobbies" items="${hobbies}" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Create">
                </td>
            </tr>
        </table>
        <input type="hidden" name="action" value="${action}">
    </form:form>
</body>
</html>
