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
        <th>ID</th>
        <th>Ten</th>
        <th>Ma NV</th>
        <th>Ten dang nhap</th>
        <th>Mat khau</th>
        <th>Trang thai</th>
        <th>Thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ds}" var="nv">
        <tr>
            <td>${nv.id}</td>
            <td>${nv.ten}</td>
            <td>${nv.maNV}</td>
            <td>${nv.tenDangNhap}</td>
            <td>${nv.matKhau}</td>
            <td>${nv.trangThai}</td>

            <td>
                <a href="/BTVN_war_exploded/nhan_vien/edit?maNV=${nv.maNV}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/nhan_vien/delete?maNV=${nv.maNV}">Delete</a>
            </td>

        </tr>

    </c:forEach>
    </tbody>
</table>
<a href="/BTVN_war_exploded/nhan_vien/create"><button>Them</button></a>
</body>
</html>
