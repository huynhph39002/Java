<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/5/2024
  Time: 10:15 AM
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
        <th>Trang Thai</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ds}" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.ma}</td>
            <td>${sp.ten}</td>
            <td>${sp.trangThai}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
