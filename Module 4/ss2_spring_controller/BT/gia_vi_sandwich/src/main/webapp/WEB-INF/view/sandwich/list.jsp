<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich</h1>
<form action="test" method="get">
    <c:forEach var="sandwich" items="${list}">
        <input type="checkbox" name="choice" value="${sandwich.component}">${sandwich.component}
    </c:forEach>
    <input type="submit" id="submit" value="save">
</form>
<span>Thành phần gồm có : ${result}</span>

</body>
</html>
