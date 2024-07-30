<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
    ma:<input name="maCoSo" type="text"  ><br>
    maTK:
    <select name="taiKhoanNganHang">
        <c:forEach items="${listtk}" var="t">
            <option value="${t.id}">${t.ma}</option>
        </c:forEach>
    </select><br>
    sdt:<input name="sdt" type="text" >
    <br>
    ghichu:<input name="ghiChu" type="text">
<br>
    trangThai:
    hoatDong<input value="1" name="trangThai"  type="radio" checked>
    khongHoatDong<input value="0" name="trangThai"  type="radio" >
<br>
    <button type="submit">add</button>
</form>

<table class="table ">
    <thead>
    <tr>
        <th>#</th>
        <th>ma</th>
        <th>matk</th>
        <th>sdt</th>
        <th>ghi chu</th>
        <th>trang thai</th>
        <th colspan="3">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}"  var="s" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${s.maCoSo}</td>
            <td>${s.taiKhoanNganHang.ma}</td>
            <td>${s.sdt}</td>
            <td>${s.ghiChu}</td>
            <td>${s.trangThai}</td>
            <td>
                <a href="/delete/${s.id}">delete</a>
            </td>
            <td>
                <a href="/detail/${s.id}">detail</a>
            </td>
<%--            <td>--%>
<%--                <a href="/view-update/${s.id}">update</a>--%>
<%--            </td>--%>
        </tr>

    </c:forEach>
    </tbody>

</table>


</body>
</html>