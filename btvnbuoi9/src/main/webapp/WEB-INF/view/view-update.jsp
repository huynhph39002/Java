<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Quản Lý Phòng Ban</h1>
<form action="/phong-ban/update" method="post">
    Mã phòng ban: <input type="text" name="ma" value="${pb.ma}">
    <br>
    Tên: <input type="text" name="ten" value="${pb.ten}">
    <br>
    Số lượng phòng ban: <input type="text" name="soLuongPhongBan" value="${pb.soLuongPhongBan}">
    <br>
    Số lượng nhân viên: <input type="text" name="soLuongNhanVien" value="${pb.soLuongNhanVien}">
    <br>
    Trạng thái: Hoạt động<input type="radio" value="0" name="trangThai" ${pb.trangThai == 0 ?'checked':''}> Ngừng Hoạt động<input ${pb.trangThai!=0?'checked':''} value="1" name="trangThai" type="radio">
    <br>
    Mã loại phòng ban:
    <select class="form-select" name="loaiPhongBan">
        <c:forEach items="${listcbb}" var="cbb">
            <option value="${cbb.id}">${cbb.ma}</option>
        </c:forEach>
    </select>
    <br>
    <button type="submit">update</button>
</form>
</body>
</html>