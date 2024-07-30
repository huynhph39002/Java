<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/20/2024
  Time: 2:43 PM
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
    <th>hoTen</th>
    <th>gioiTinh</th>
    <th>ngaySinh</th>
    <th>diaChi</th>
    <th>sdt</th>
    <th>idCV</th>
    <th>trangThai</th>

</tr>
</thead>
    <tbody>
    <c:forEach items="${lst}" var="nv">
        <tr>
            <td>${nv.id}</td>
            <td>${nv.ma}</td>
            <td>${nv.ho} ${nv.tenDem} ${nv.ten} </td>
            <td>${nv.gioiTinh}</td>
            <td>${nv.ngaySinh}</td>
            <td>${nv.diaChi}</td>
            <td>${nv.sdt}</td>
            <td>${nv.matKhau}</td>
            <td>${nv.idCV}</td>
            <td>${nv.trangThai}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
