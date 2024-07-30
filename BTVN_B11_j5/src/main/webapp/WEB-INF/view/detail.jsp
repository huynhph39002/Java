<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/detail" >
    ma:<input name="maCoSo" type="text" value="${s.maCoSo}"><br>
    maTK:
    <select name="taiKhoanNganHang">
        <c:forEach items="${listtk}" var="t">
            <option value="${t.id}">${t.ma}</option>
        </c:forEach>
    </select><br>
    sdt:<input name="sdt" type="text" value="${s.sdt}">
    <br>
    ghichu:<input name="ghiChu" type="text"value="${s.ghiChu}">
    <br>
    trangThai:
    hoatDong<input value="${s.trangThai}" name="trangThai"  type="radio" checked>
    khongHoatDong<input value="${!s.trangThai}"name="trangThai"  type="radio" >
    <br>
    <a href="/co-so/hien-thi">quay lai</a>
</form>
</body>
</html>