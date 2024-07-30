<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/3/2024
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <table >
        <thead>
        <tr>
            <td>id</td>
            <td>ten</td>
            <td>ma</td>
            <td>tenDangNhap</td>
            <td>matKhau</td>
            <td>trangThai</td>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${ds}" var="nv">
            <tr>
                <td>${nv.id}</td>
                <td>${nv.ten}</td>
                <td>${nv.ma}</td>
                <td>${nv.tenDangNhap}</td>
                <td>${nv.matKhau}</td>
                <td>${nv.trangThai}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</body>
</html>
