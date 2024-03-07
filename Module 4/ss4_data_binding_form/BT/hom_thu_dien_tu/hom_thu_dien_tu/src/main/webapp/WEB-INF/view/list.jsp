<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/11/2023
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cấu hình hòm thư</title>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css"
          rel="stylesheet">
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name email</td>
        <td>Language</td>
        <td>Page Size</td>
        <td>Spams filter</td>
        <td>Signature</td>
        <td>Settings</td>
    </tr>
    <c:forEach items="${list}" var="e" varStatus="status">
        <tr>
            <td>${e.code}</td>
            <td>Thư ${status.count}</td>
            <td>${e.language}</td>
            <td>${e.size}</td>
            <c:if test="${e.enableSpamsFilter==true}">
                <td>yes</td>
            </c:if>
            <c:if test="${e.enableSpamsFilter==false}">
                <td>no</td>
            </c:if>
            <td>${e.signature}</td>
            <th ><a href="/edit/${e.code}" style="color: hotpink">
                <span><i class="icon-edit"></i></span>
            </a>

            </th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
