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
<form method="POST" action="/khach-hang/store">
    <div>
        <label class="form-lable">Mã KH</label>
        <input class="form-control" type="text" name="maKH" value="${data.maKH}">
        <c:if test="${not empty errors['maKH']}">
            <small style="color:red;">${errors['maKH']}</small>
        </c:if>
    </div>
    <div>
        <label class="form-lable" >Tên </label>
        <input class="form-control" type="text" name="ten" value="${data.ten}">
        <c:if test="${not empty errors['ten']}">
            <small style="color:red;">${errors['ten']}</small>
        </c:if>
    </div>
    <div>
        <label class="form-lable">SDT</label>
        <input class="form-control" type="text" name="sdt" value="${data.sdt}">
        <c:if test="${not empty errors['sdt']}">
            <small style="color:red;">${errors['sdt']}</small>
        </c:if>
    </div>

    <div>
        <label class="form-lable">Trang thai</label>
        <select class="form-control" name="trangThai" value="${data.trangThai}" >
            <option value="1">Dang hoat dong</option>
            <option value="0">Ngung hoat dong</option>

        </select>
    </div> <c:if test="${not empty errors['trangThai']}">
    <small style="color:red;">${errors['trangThai']}</small>
</c:if>
    <div>
        <button class="btn btn-success" type="submit">Luu</button>
    </div>
</form>
</body>
</html>