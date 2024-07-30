<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 22/01/2023
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>
<table class="table mt-4">
    <thead>
    <tr>
        <th>id</th>
        <th>categoryCode</th>
        <th>categoryName</th>
        <th>productCode</th>
        <th>productName</th>
        <th>price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lst}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.category.categoryCode}</td>
            <td>${s.category.categoryName}</td>
            <td>${s.proCode}</td>
            <td>${s.proName}</td>
            <td>${s.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
