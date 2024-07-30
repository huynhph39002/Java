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
    <title>San pham</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${ sp.ma }</td>
            <td>${ sp.ten }</td>
            <td>${ sp.trangThai }</td>
            <td>
                <a href="/BTVN_war_exploded/san_pham/edit?ma=${sp.ma}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/san_pham/delete?ma=${sp.ma}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<a href="/BTVN_war_exploded/san_pham/create"><button>Them</button></a>
</body>
</html>
