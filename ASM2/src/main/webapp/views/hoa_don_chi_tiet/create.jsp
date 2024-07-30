
<%@ page  language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/hoa-don-chi-tiet/store">

    <div>
        <label>ID hoa don</label>
        <input type="text" name="idHD" value="${data.idHD}">
        <c:if test="${ not empty errors['idHD'] }">
            <small style="color: red">${ errors["idHD"] }</small>
        </c:if>
    <div>
        <label>ID SPCT</label>
        <input type="text" name="idSPCT" value="${data.idSPCT}">
        <c:if test="${ not empty errors['idSPCT'] }">
            <small style="color: red">${ errors["idSPCT"] }</small>
        </c:if>
    </div>
    <div>
        <label>So luong</label>
        <input type="text" name="soLuong" value="${data.soLuong}">
        <c:if test="${ not empty errors['soLuong'] }">
            <small style="color: red">${ errors["soLuong"] }</small>
        </c:if>
    </div>
    <div>
        <label>Don gia</label>
        <input type="text" name="donGia" value="${data.donGia}">
        <c:if test="${ not empty errors['donGia'] }">
            <small style="color: red">${ errors["donGia"] }</small>
        </c:if>
    </div>

    <div>
        <label>Trang thai</label>
        <select name="trangThai" value="${data.trangThai}">
            <option value="1">Dang hoat dong</option>
            <option value="0">Ngung hoat dong</option>
        </select>
        <c:if test="${ not empty errors['trangThai'] }">
            <small style="color: red">${ errors["trangThai"] }</small>
        </c:if>
    </div>
    <div>
        <button>Luu</button>
    </div>
</form>
</body>
</html>
