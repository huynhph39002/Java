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
        <th>Id NV</th>
        <th>Id KH</th>
        <th>Ngày mua hàng</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ds}" var="hd">
        <tr>
            <td>${hd.id}</td>
            <td>${hd.idNhanVien}</td>
            <td>${hd.idKhachHang}</td>
            <td>${hd.ngayMuaHang}</td>
            <td>${hd.trangThai}</td>
            <td>
                <a href="/BTVN_war_exploded/hoa_don/edit?id=${hd.id}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/hoa_don/delete?id=${hd.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/BTVN_war_exploded/hoa_don/create">
    <button>Them</button>
</a>
</body>
</html>
