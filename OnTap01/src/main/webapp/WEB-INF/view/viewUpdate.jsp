<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/update">
    ten: <input name="ten" type="text" value="${l.ten}">
    so luong: <input name="soLuong" type="text"value="${l.soLuong}">
    trangThai: con<input value="${l.trangThai}" name="trangThai" type="radio" checked>  het<input value="${l.trangThai}" name="trangThai" type="radio">
    tenloaiphong:
    <select name="loaiPhong">
        <c:forEach var="llp" items="${lp}">
            <option value="${llp.id}">${llp.ten}</option>
        </c:forEach>
    </select>
    ghichu:<input value="${l.ghiChu}" name="ghiChu" type="text">
    <button type="submit">update</button>
</form>


</body>
</html>