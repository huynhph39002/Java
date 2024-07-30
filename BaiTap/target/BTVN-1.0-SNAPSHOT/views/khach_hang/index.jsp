<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/13/2024
  Time: 4:36 PM
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
        <td>ID</td>
        <td>Ten</td>
        <td>SDT</td>
        <td>Mã KH</td>
        <td>Trạng thái</td>
        <td>Thao tác</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ds}" var="kh">
        <tr>
            <td>${kh.id}</td>
            <td>${kh.ten}</td>
            <td>${kh.sdt}</td>
            <td>${kh.maKH}</td>
            <td>${kh.trangThai}</td>
            <td>
                <a href="/BTVN_war_exploded/khach_hang/edit?maKH=${kh.maKH}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/khach_hang/delete?maKH=${kh.maKH}">Delete</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
<br>
<a href="/BTVN_war_exploded/khach_hang/create"><button>Thêm</button></a>
</body>
</html>
