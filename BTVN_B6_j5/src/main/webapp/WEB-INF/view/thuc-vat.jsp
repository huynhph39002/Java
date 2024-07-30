<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>

<div class="container mt-4">
    <form action="/thuc-vat/tim-kiem" class="mb-4">
        <div class="input-group">
            <input type="text" class="form-control" name="ten" placeholder="Tên"/>
            <button type="submit" class="btn btn-primary">Search</button>
        </div>
    </form>

    <form action="/thuc-vat/add" method="post" class="mb-4">
        <div class="mb-3">
            <label for="id" class="form-label">id:</label>
            <input type="text" class="form-control" id="id" name="id" value="${s.id}" />
            <span class="text-danger">${checkid}</span>
        </div>
        <div class="mb-3">
            <label for="loai" class="form-label">Loai cay:</label>
            <input type="text" class="form-control" id="loai" name="loai" value="${s.loai}"/>
            <span class="text-danger">${checkloai}</span>
        </div>
        <div class="mb-3">
            <label for="ten" class="form-label">Tên:</label>
            <input type="text" class="form-control" id="ten" name="ten" value="${s.ten}"/>
            <span class="text-danger">${checkten}</span>
        </div>
        <div class="mb-3">
            <label for="tuoi" class="form-label">Tuổi:</label>
            <input type="number" class="form-control" id="tuoi" name="tuoi" value="${s.tuoi}"/>
            <span class="text-danger">${checktuoi}</span>
        </div>
        <div class="mb-3">
            <label  class="form-label">Khu vuc:</label>
            <input type="text" class="form-control"  name="khuVuc" value="${s.khuVuc}"/>
            <span class="text-danger">${checkkhu}</span>
        </div>
        <div class="mb-3">
            <label  class="form-label">Gioi tinh:</label>
            <label>nam</label>
            <input type="radio" name="gioiTinh" value="true" checked>
            <label>nu</label>
            <input type="radio" name="gioiTinh" value="false">
        </div>
        <button type="submit" class="btn btn-success" >Add</button>
    </form>

    <table class="table table-bordered">
        <thead class="table-dark">
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Loại</th>
            <th>Số tuổi</th>
            <th>Khu vực</th>
            <th>Giới tinh</th>
            <th colspan="2" class="text-center">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${tv}" var="s" varStatus="abc">
            <tr>
                <td>${abc.index+1}</td>
                <td>${s.ten}</td>
                <td>${s.loai}</td>
                <td>${s.tuoi}</td>
                <td>${s.khuVuc}</td>
                <td>${s.gioiTinh}</td>
<%--                <td class="text-center">--%>
<%--                    <a href="/giang-vien/detail?maGV=${s.maGV}" class="btn btn-info btn-sm" onclick="return confirm('Bạn có chắc chắn muốn xem chi tiết giảng viên này?')">Detail</a>--%>
<%--                </td>--%>
                <td class="text-center">
                    <a href="/thuc-vat/remove?id=${s.id}" class="btn btn-danger btn-sm" onclick="return confirm('Bạn có chắc chắn muốn xóa thuc vat này?')">Delete</a>
                </td>
                <td class="text-center">
                    <a href="/thuc-vat/view-update?id=${s.id}" class="btn btn-warning btn-sm" onclick="return confirm('Bạn có chắc chắn muốn cập nhật thông tin thuc vat  này?')">Update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href="/thuc-vat/hien-thi-tat-ca" class="btn btn-secondary mt-3">Quay lại</a>
</div>


<%--<div>--%>
<%--    <form action="/giang-vien/tim-kiem">--%>
<%--        Tên: <input name="ten"/>--%>
<%--        <button type="submit">Search</button>--%>
<%--    </form>--%>
<%--</div>--%>

<%--<br>--%>

<%--<form action="/giang-vien/add" method="post">--%>
<%--    <br/>--%>
<%--    Ma: <input type="text" name="maGV" value="${s.maGV}"/>--%>
<%--    <span style="color: red">${checkma}</span>--%>
<%--    <br/>--%>
<%--    Tên: <input type="text" name="ten" value="${s.ten}"/>--%>
<%--    <span style="color: red">${checkten}</span>--%>
<%--    <br/>--%>
<%--    Tuổi: <input type="number" name="tuoi" value="${s.tuoi}"/>--%>
<%--    <span style="color: red">${checktuoi}</span>--%>
<%--    <br/>--%>

<%--    Que quan: <input type="text" name="queQuan" value="${s.queQuan}"/>--%>
<%--    <span style="color: red">${checkque}</span>--%>
<%--    <br/>--%>

<%--    <button type="submit">Add</button>--%>

<%--</form>--%>

<%--<br>--%>
<%--<table class="table">--%>


<%--    <thead>--%>
<%--    <tr>--%>
<%--        <td>Ma GV</td>--%>
<%--        <td>Ten</td>--%>
<%--        <td>Tuoi</td>--%>
<%--        <td>Que Quan</td>--%>
<%--        <td colspan="3">Action</td>--%>
<%--    </tr>--%>

<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${gv}" var="s" varStatus="abc">--%>
<%--        <tr>--%>

<%--            <td>${s.maGV}</td>--%>
<%--            <td>${s.ten}</td>--%>
<%--            <td>${s.tuoi}</td>--%>
<%--            <td>${s.queQuan}</td>--%>
<%--            <td>--%>
<%--                <a href="/giang-vien/detail?maGV=${s.maGV}">--%>
<%--                    <button> detail</button>--%>
<%--                </a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/giang-vien/remove?maGV=${s.maGV}">--%>
<%--                    <button>delete</button>--%>
<%--                </a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/giang-vien/view-update?maGV=${s.maGV}">--%>
<%--                    <button> update</button>--%>
<%--                </a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>

<%--</table>--%>
<%--<br>--%>
<%--<button><a href="/giang-vien/hien-thi-tat-ca">quay lai</a></button>--%>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
