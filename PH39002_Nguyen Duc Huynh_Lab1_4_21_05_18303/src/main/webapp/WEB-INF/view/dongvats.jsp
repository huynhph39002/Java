<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>

<div class="mt-4" >
    <form action="/dong-vat/search">
        <input name="ma" placeholder="ma">
        <button type="submit">Search</button>
    </form>

</div>

<%--<div class="mt-3--%>
<%--">--%>
<%--    <a class="btn btn-primary" href="/dong-vat/view-add">add</a>--%>
<%--</div>--%>

<form class="mt-3" method="post" action="/dong-vat/add">
    ma:<input name="ma" type="text">
    khu vuc:
    <select name="khuVuc">
        <option disabled>--lua chon--</option>
        <option value="ha noi">ha noi</option>
        <option value="bac giang">bac giang</option>
    </select>

    ten:<input name="ten" type="text">
    can nang:<input name="canNang" type="text">
    gioi tinh
    <input type="radio" name="gioiTinh" value="true" checked>hoat dong
    <input type="radio" name="gioiTinh" value="false" >khong hoat dong

    <button type="submit">add</button>

</form>

<table class="table">
    <thead>
    <tr>
        <th>ma</th>
        <th>ten</th>
        <th>gioiTinh</th>
        <th>canNang</th>
        <th>khuVuc</th>
        <th colspan="2">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dv}" var="d" >
        <tr>

            <td>${d.ma}</td>
            <td>${d.ten}</td>
            <td>${d.gioiTinh}</td>
            <td>${d.canNang}</td>
            <td>${d.khuVuc}</td>
            <td>
                <a href="/dong-vat/view-update">update</a>
            </td>
            <td>
                <a href="/dong-vat/remove?ma=${d.ma}">remove</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
