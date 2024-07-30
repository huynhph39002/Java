<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/12/2024
  Time: 3:29 PM
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
        <th>Tên</th>
        <th>Mã</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="kt">
        <tr>
            <td>${kt.id}</td>
            <td>${ kt.ten }</td>
            <td>${ kt.ma }</td>
            <td>${ kt.trangThai }</td>
            <td>
                <a href="/BTVN_war_exploded/kich_thuoc/edit?ma=${kt.ma}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/kich_thuoc/delete?ma=${kt.ma}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<a href="/BTVN_war_exploded/kich_thuoc/create">
    <button>Them</button>
</a>
</body>
</html>
