<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/12/2023
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="path/to/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css"
          rel="stylesheet">
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
</head>
<body>
<h1 style="margin-left: 40%">Danh sách nhạc </h1>

<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Album</th>
        <th scope="col">Tên bài hát</th>
        <th scope="col">Nghệ sĩ thể hiện</th>
        <th scope="col">Thể loại nhạc</th>
        <th scope="col">Liên kết</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${list}" var="m" varStatus="loop">
        <tr>
            <th scope="row">${loop.count}</th>
            <td><img src="${listAlbum}" style="width:70px;height: 70px"></td>
            <td>${m.name}</td>
            <td>${m.artist}</td>
            <td>${m.kindOfMusic}</td>
            <td><a href="${m.link}">${m.link}</a></td>
        </tr>
    </c:forEach>
    <tr>
        <th colspan="6" style="text-align: center">
            <a href="create" style="font-size: 100px">
                <i class="icon-plus-sign"></i>
            </a>
        </th>
    </tr>

    </tbody>
</table>
<p>${message}</p>

</body>
</html>
