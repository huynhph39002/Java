<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/detail{id}" method="post" >
    ma:<input type="text" name="ma" value="${t.ma}"><br>
    maKH:<select name="khachHang">
    <c:forEach items="${listkh}" var="t">
        <option value="${t.id}"> ${t.ma}</option>
    </c:forEach>
</select>
    <br>
    tenKH:<input type="text" value="${t.khachHang.ten}">
    <br>
    NgayTao:<input type="text" name="ngayTao"value="${t.ngayTao}">
    <br>
    Ten:<input type="text" name="ten" value="${t.ten}">
    <br>
    trangThai:
    <c:out value="${t.trangThai==1?'hoat dong':''}"/>
<%--    hoatDong<input type="radio" name="trangThai" value="1" ${t.trangThai==0?'checked':''}>--%>
<%--    khongHoatDong<input type="radio" name="trangThai" value="0" ${t.trangThai!=0?'':'checked'}>--%>
</form>

<a href="/dat-phong/hien-thi">quay lai</a>
<%--<table>--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th>#</th>--%>
<%--        <th>maP</th>--%>
<%--        <th>maKH</th>--%>
<%--        <th>tenP</th>--%>
<%--        <th>ngayTao</th>--%>
<%--        <th>trangThai</th>--%>
<%--        <th colspan="3">action</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${list}" var="s" varStatus="i">--%>
<%--        <tr>--%>
<%--            <td>${i.index+1}</td>--%>
<%--            <td>${s.ma}</td>--%>
<%--            <td>${s.khachHang.ma}</td>--%>
<%--            <td>${s.ten}</td>--%>
<%--            <td>${s.ngayTao}</td>--%>
<%--            <td>${s.trangThai}</td>--%>
<%--            <td>--%>
<%--                <a href="/delete/${s.id}">delete</a>--%>
<%--            </td><td>--%>
<%--                <a href="/detail/${s.id}">detail</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>
</body>
</html>