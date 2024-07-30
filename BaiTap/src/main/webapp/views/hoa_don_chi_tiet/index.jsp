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
        <th>ID hoa don</th>
        <th>ID san pham ct</th>
        <th>So luong</th>
        <th>Don gia</th>
        <th>Trang thai</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="hdct">
        <tr>
            <td>${ hdct.id }</td>
            <td>${ hdct.idHoaDon }</td>
            <td>${ hdct.idSPCT }</td>
            <td>${ hdct.soLuong }</td>
            <td>${ hdct.donGia }</td>
            <td>${ hdct.trangThai }</td>
            <td>
                <a href="/BTVN_war_exploded/hoa_don_chi_tiet/edit?id=${hdct.id}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/hoa_don_chi_tiet/delete?id=${hdct.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/BTVN_war_exploded/hoa_don_chi_tiet/create">
    <button>Them</button>
</a>
</body>
</html>
