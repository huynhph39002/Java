<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2024
  Time: 6:57 PM
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
        <th>sdt</th>
        <th>trangThai</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${ds}" var="kh">
        <tr>
            <td>${kh.id}</td>
            <td>${kh.ma}</td>
            <td>${kh.ten}</td>
            <td>${kh.sdt}</td>
            <td>${kh.trangThai}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
