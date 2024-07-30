<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body class="container" style="width: 40%">
<form method="POST" action="/nhan-vien/store">
    <div>
        <label class="form-lable">Ten</label>
        <input class="form-control" type="text" name="ten" value="${data.ten}">
        <c:if test="${ not empty errors['ten'] }" >
            <small style="color: red">${ errors["ten"] }</small>
        </c:if>
    </div>
    <div>
        <label class="form-lable">Ma NV</label>
        <input class="form-control" type="text" name="maNV" value="${data.maNV}">
        <c:if test="${ not empty errors['maNV'] }">
            <small style="color: red">${ errors["maNV"] }</small>
        </c:if>
    </div>
    <div>
        <label class="form-lable">Ten dang nhap</label>
        <input class="form-control" type="text" name="tenDangNhap" value="${data.tenDangNhap}">
        <c:if test="${ not empty errors['tenDangNhap'] }">
            <small style="color: red">${ errors["tenDangNhap"] }</small>
        </c:if>
    </div>
    <div>
        <label class="form-lable">Mat khau</label>
        <input class="form-control" type="text" name="matKhau" value="${data.matKhau}">
        <c:if test="${ not empty errors['matKhau'] }">
            <small style="color: red">${ errors["matKhau"] }</small>
        </c:if>
    </div>
    <div>
        <label class="form-lable">Trang thai</label>
        <select class="form-control" name="trangThai" value="${data.trangThai}">
            <option value="1">Dang hoat dong</option>
            <option value="">Ngung hoat dong</option>
        </select>
        <c:if test="${ not empty errors['trangThai'] }">
            <small style="color: red">${ errors["trangThai"] }</small>
        </c:if>
    </div>
    <div class="mt-3" style="text-align: center">
        <button class="btn btn-success" type="submit">Luu</button>
    </div>
</form>
</body>
</html>