<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/11/2023
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Settings</title>
</head>
<body>
<form:form method="post" action="edit" modelAttribute="email"></form:form>


<form:form  action="/edit" modelAttribute="email" method="post">
    <form:input path="code" value="${code}" hidden="hidden"/>
    Languages:
    <form:select path="language">
        <form:options items="${listLanguage}"/>
 </form:select><br>

    Page size : show
    <form:select path="size">
            <form:options items="${listSize}"/>
    </form:select>emails per page<br>

    Spam filter:
    <form:checkbox path="enableSpamsFilter"/>Enable spams filter<br>
    Signature:<br><form:textarea path="signature" rows="10" cols="50"/><br><br>


    <button type="submit">Update</button>
    <button type="button" formaction="/list">Cancel</button>
</form:form>


</body>
</html>
