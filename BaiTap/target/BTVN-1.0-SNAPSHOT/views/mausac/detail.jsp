<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/12/2024
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Thuộc tính</th>
        <th>Trạng thái</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>ID</td>
        <td>1</td>
    </tr>
    <tr>
        <td>Mã</td>
        <td>${ data.ma }</td>
    </tr>
    <tr>
        <td>Tên</td>
        <td>${ data.ten }</td>
    </tr>
    <tr>
        <td>Trạng thái</td>
        <td>${ data.trangThai }</td>
    </tr>
    </tbody>
</table>
</body>
</html>
