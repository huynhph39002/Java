<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<body>
<form method="POST" action="/spct/store">

    <div class="my-3">
        <label class="form-lable">Tên sản phẩm</label>
        <select name="idSP" class="form-select me-2">
            <%--            <option value="">Lựa chọn</option>--%>
            <c:forEach var="i" items="${product}">
                <option value="${i.id}">${i.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="my-3">
        <label class="form-lable">Tên màu sắc</label>
        <select name="idMauSac" class="form-select me-2">
            <%--            <option value="">Lựa chọn</option>--%>
            <c:forEach var="i" items="${color}">
                <option value="${i.id}">${i.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="my-3">
        <label class="form-lable">Tên kích thước</label>
        <select name="idKichThuoc" class="form-select me-2">
            <%--            <option value="">Lựa chọn</option>--%>
            <c:forEach var="i" items="${size}">
                <option value="${i.id}">${i.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <label>Ma SPCT</label>
        <input type="text" name="maSPCT" value="${data.maSPCT}">
        <c:if test="${ not empty errors['maSPCT'] }">
            <small style="color: red">${ errors["maSPCT"] }</small>
        </c:if>
    </div>
    <div>
        <label>So luong</label>
        <input type="number" name="soLuong" value="${data.soLuong}">
        <c:if test="${ not empty errors['soLuong'] }">
            <small style="color: red">${ errors["soLuong"] }</small>
        </c:if>
    </div>
    <div>
        <label>Don gia</label>
        <input type="number" name="donGia" value="${data.donGia}">
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
            <small style="color: red">${ errors["thaiTrang"] }</small>
        </c:if>
    </div>
    <div>
        <button class="btn btn-success" type="submit">Luu</button>
    </div>
</form>
</body>
</html>
