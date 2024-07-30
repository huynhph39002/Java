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
<%--    <style>--%>
<%--        .center-form {--%>
<%--            height: 100vh;--%>
<%--            display: flex;--%>

<%--            align-items: ;--%>
<%--        }--%>
<%--    </style>--%>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>
<form  class="container mt-4" action="/update?id=${s.id}"  method="post">

    <div>Id lop:<input type="text" name="id" value="${s.id}" disabled></div>

    <div class="mt-2"> Ten lop: <input type="text" name="name" value="${s.name}"></div>

    <div class="mt-2"> Dia diem lop hoc: <input type="text" name="diaChi" value="${s.diaChi}"></div>

    <div class="mt-2">
        <button type="submit">update</button>
    </div>

</form>

</body>
</html>