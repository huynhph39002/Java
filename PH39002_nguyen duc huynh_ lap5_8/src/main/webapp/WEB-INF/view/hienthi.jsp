<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/detail/${id}" >--%>
<%--    ma:<input type="text" name="ma" value="${s.ma}"><br>--%>
<%--    maKH:<select name="khachHang">--%>
<%--    <c:forEach items="${listkh}" var="t">--%>
<%--        <option value="${t.id}"> ${t.ma}</option>--%>
<%--    </c:forEach>--%>
<%--</select>--%>
<%--    <br>--%>
<%--    NgayTao:<input type="date" name="ngayTao"value="${s.ngayTao}">--%>
<%--    <br>--%>
<%--    Ten:<input type="text" name="ten" value="${s.ten}">--%>
<%--    <br>--%>
<%--    trangThai:--%>
<%--    hoatDong<input type="radio" name="trangThai" value="${s.trangThai}">--%>
<%--    khongHoatDong<input type="radio" name="trangThai" value="${!s.trangThai}">--%>
<%--</form>--%>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>maP</th>
        <th>maKH</th>
        <th>tenP</th>
        <th>ngayTao</th>
        <th>trangThai</th>
        <th colspan="2">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="s" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${s.ma}</td>
            <td>${s.khachHang.ma}</td>
            <td>${s.ten}</td>
            <td>${s.ngayTao}</td>
            <td>${s.trangThai}</td>
            <td>
                <a href="/delete/${s.id}">delete</a>
            </td><td>
                <a href="/detail/${s.id}">detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>