<%--
  Created by IntelliJ IDEAúd
  User: admin
  Date: 11/5/2023
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>CHUYỂN SANG TIỀN ĐÔ LA</p>
<form action="/cal/index/USD" method="get">
    <input type="text" placeholder="NHẬP SỐ TIỀN VIỆT NAM: " name="value1">
    <input type="submit" value="Tinh">
</form>
<span>Ket qua la: ${result1} $</span>
<p>CHUYỂN SANG TIỀN VIỆT NAM</p>
<form action="/cal/index/VND" method="get">
    <input type="text" placeholder="NHẬP SỐ TIỀN DO LA: " name="value2">
    <input type="submit" value="Tinh">
</form>
<span>Ket qua la: ${result2} VND</span>
<%--<form action="/cal/index" method="get" style="width: 500px;height: 500px;background-color: darksalmon">--%>
<%--    <input type="text" placeholder="Input value" name="value">--%>
<%--    <input type="submit">--%>
<%--</form>--%>
<%--<span>Ket qua la: ${result} </span>--%>
</body>
</html>