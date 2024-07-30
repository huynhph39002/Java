<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<%--<div class="container mt-3">--%>

<%--    <br>--%>
<%--    <!-- Nav pills -->--%>
<%--    <ul class="nav nav-pills" role="tablist">--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link active" data-bs-toggle="pill" href="#home">Home</a>--%>
<%--        </li>--%>
<%--        <li class="nav-item dropdown">--%>
<%--            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Quan ly san pham</a>--%>
<%--            <ul class="dropdown-menu">--%>
<%--                <li><a class="dropdown-item" href="/san-pham/index">San pham</a></li>--%>
<%--                <li><a class="dropdown-item" href="/spct/index">San pham chi tiet</a></li>--%>
<%--                <li><a class="dropdown-item" href="/mau-sac/index">Mau sac</a></li>--%>
<%--                <li><a class="dropdown-item" href="/kich-thuoc/index">Kich thuoc</a></li>--%>
<%--            </ul>--%>
<%--        </li>--%>
<%--        <li class="nav-item dropdown">--%>
<%--            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Quan ly hoa don</a>--%>
<%--            <ul class="dropdown-menu">--%>
<%--                <li><a class="dropdown-item" href="/hoa-don/index">Hoa don</a></li>--%>
<%--                <li><a class="dropdown-item" href="/hdct/index">Hoa don chi tiet</a></li>--%>
<%--            </ul>--%>
<%--        </li>--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link" href="/khach-hang/index">Quan ly khach hang</a>--%>
<%--        </li>--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link"  href="/nhan-vien/index">Quan ly nhan vien</a>--%>
<%--        </li>--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link"  href="/ban-hang/index">Ban hang</a>--%>
<%--        </li>--%>
<%--    </ul>--%>
<%--</div>--%>

<div class="container">
<form method="post" action="/add" class="mt-4">
    ma:<input name="ma" type="text">
    ten:<input name="ten" type="text">
    <br>
    <button type="submit" class="btn btn-Success mt-3" style="text-align: center">add</button>
</form>

<table class="table table-stripped">
    <thead>
    <tr>
        <th>ma</th>
        <th>ten</th>
        <th colspan="2">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="s" varStatus="i">
        <tr>
            <td>${s.ma}</td>
            <td>${s.ten}</td>
            <td>
                <a class="btn btn-Warning" href="/update/${s.id}">update</a>
            </td>
            <td>
                <a class="btn btn-danger"  href="/delete/${s.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div>
    <a class="btn btn-light" href="/home">quay lai</a>
</div>
</div>
</body>
</html>