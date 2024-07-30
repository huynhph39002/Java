<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Quản Lý Phòng Ban</h1>
<form action="/phong-ban/them" method="post">
    Mã phòng ban: <input type="text" name="ma">
    <br>
    Tên: <input type="text" name="ten">
    <br>
    Số lượng phòng ban: <input type="text" name="soLuongPhongBan">
    <br>
    Số lượng nhân viên: <input type="text" name="soLuongNhanVien">
    <br>
    Trạng thái: Hoạt động<input type="radio" value="0" name="trangThai" checked> Ngừng Hoạt động<input value="1" name="trangThai" type="radio">
    <br>
    Mã loại phòng ban:
    <select name="loaiPhongBan">
        <c:forEach items="${listcbb}" var="cbb">
            <option value="${cbb.id}">${cbb.ma}</option>
        </c:forEach>
    </select>
    <br>
    <button type="submit">Thêm</button>
</form>
<a href="phong-ban/hien-thi"><button type="submit">hienthi</button></a>
<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>ID</th>
        <th>Mã</th>
        <th>Phòng Ban</th>
        <th>Số lượng phòng ban</th>
        <th>Số lượng nhân viên</th>
        <th>Trạng thái</th>
        <th>Tên loại phòng ban</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ctg" varStatus="i">
        <tr>
            <th>${i.index}</th>
            <th>${ctg.id}</th>
            <th>${ctg.ma}</th>
            <th>${ctg.ten}</th>
            <th>${ctg.soLuongPhongBan}</th>
            <th>${ctg.soLuongNhanVien}</th>
            <th>${ctg.trangThai}</th>
            <th>${ctg.loaiPhongBan.ten}</th>
            <th>
                <a href="/phong-ban/view-update/${ctg.id}">Update</a>
                <a href="/phong-ban/remove/${ctg.id}">Remove</a>
            </th>
        </tr>
    </c:forEach>
    </tbody>
</table>
<ul class="pagination">
    <c:forEach begin="0" end="${pagesize-1}" var="i">
        <li><a href="hien-thi?pageNo=${i}">${i}</a></li>
    </c:forEach>
</ul>
</body>
</html>