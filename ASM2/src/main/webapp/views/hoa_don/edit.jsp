<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form method="POST" action="/hoa-don/update/${data.id}">
    <div>
        <label>ID nhan vien</label>
        <input type="text" name="idNV" value="${data.tenNV}">
        <c:if test="${ not empty errors['idNV'] }">
            <small style="color: red">${ errors["idNV"] }</small>
        </c:if>
    </div>
    <div>
        <label>ID khach hang</label>
        <input type="text" name="idKH" value="${data.idKH}">
        <c:if test="${ not empty errors['idKH'] }" >
            <small style="color: red">${ errors["idKH"] }</small>
        </c:if>
    </div>
    <div>
        <label>Ngay mua hang</label>
        <input type="text" name="ngayMuaHang" value="${data.ngayMuaHang}">
        <c:if test="${ not empty errors['ngayMuaHang'] }">
            <small style="color: red">${ errors["ngayMuaHang"] }</small>
        </c:if>
    </div>

    <div>

        <label >Trạng Thái</label>
        <select  name="trangThai" value="${data.trangThai}">
            <option value="1"  <c:if test="${sp.trangThai == 1}">selected</c:if>>Dang hoat dong</option>
            <option value="0"  <c:if test="${sp.trangThai == 0}">selected</c:if> >Ngung hoat dong </option>
        </select>
    </div>
    <div>
        <button>Sua</button>
    </div>
</form>
</body>
</html>