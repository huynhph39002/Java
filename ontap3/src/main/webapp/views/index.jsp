<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/19/2024
  Time: 8:41 PM
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
        <th>chuc nang</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lst}" var="l">
        <tr>
            <td>${l.id}</td>
            <td>${l.ma}</td>
            <td>${l.ten}</td>
            <td>
                <a href="/ontap3_war_exploded/delete?id=${l.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
