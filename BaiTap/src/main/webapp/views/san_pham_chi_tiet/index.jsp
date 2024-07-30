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
        <th>Ma SPCT</th>
        <th>Id kich thuoc</th>
        <th>Id mau sac</th>
        <th>So luong</th>
        <th>Don gia</th>
        <th>Trang thai</th>
        <th>Thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ds}" var="spct">
        <tr>
            <td>${spct.id}</td>
            <td>${spct.maSPCT}</td>
            <td>${spct.idKichThuoc}</td>
            <td>${spct.idMauSac}</td>
            <td>${spct.idSanPham}</td>
            <td>${spct.soLuong}</td>
            <td>${spct.donGia}</td>
            <td>${spct.trangThai}</td>
            <td>
                <a href="/BTVN_war_exploded/san_pham_chi_tiet/edit?maSPCT=${spct.maSPCT}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/san_pham_chi_tiet/delete?maSPCT=${spct.maSPCT}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/BTVN_war_exploded/san_pham_chi_tiet/create"><button>Them</button></a>
</body>
</html>
