<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/9/2024
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>id</th>
        <th>ma</th>
        <th>ten</th>
        <th>ngaySinh</th>
        <th>soThich</th>
        <th>gioiTinh</th>
        <th>idMQH</th>
        <th>trangThai</th>
        <th colspan="2">button</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lst}" var="b">
        <tr>
            <td>${b.id}</td>
            <td>${b.ma}</td>
            <td>${b.ten}</td>
            <td>${b.ngaySinh}</td>
            <td>${b.soThich}</td>
            <td>${b.gioiTinh}</td>
            <td>${b.idMQH}</td>
            <td>${b.trangThai}</td>
            <td >
                <a href="/de1_java4_war_exploded/ban/delete?id=${b.id}">delete</a>
            </td>
            <td >
                <a href="/de1_java4_war_exploded/ban/chiTiet?id=${b.id}">detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
