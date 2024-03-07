<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/10/2023
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form>
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="account">Account :</form:label></td>
                <td><form:label path="account"></form:label></td>
            </tr>
            <tr>
                <td><form:label path="password">Password:</form:label></td>
                <td><form:label path="password"></form:label></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Login</form:button></td>
            </tr>
        </table>
    </fieldset>

</form:form>
</body>
</html>
