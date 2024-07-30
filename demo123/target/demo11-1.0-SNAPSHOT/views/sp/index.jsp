<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2024
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <th>trangThai</th>

    </tr>
    </thead>

    <tbody>
    <c:forEach items="${s}" var="sp">
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
