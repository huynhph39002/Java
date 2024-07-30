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
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>

<div class="container">
    <form class="mt-4" action="/add" method="post">

        <div>Id lop: <input type="text" name="id" value="${ss.id}" disabled></div>

        <div class="mt-2"> Ten lop: <input type="text" name="name" value="${ss.name}"></div>

        <div class="mt-2"> Dia diem lop hoc: <input type="text" name="diaChi" value="${ss.diaChi}"></div>

        <div class="mt-2">
            <button type="submit">add</button>
        </div>

    </form>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>ten</th>
            <th>dia diem</th>
            <th colspan="2">action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="ss">
            <tr>
                <td>${ss.id}</td>
                <td>${ss.name}</td>
                <td>${ss.diaChi}</td>
                <td>
                    <button><a href="/view-update?id=${ss.id}">edit</a></button>
                </td>
                <td>
                    <button><a href="/remove?id=${ss.id}">remove</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
