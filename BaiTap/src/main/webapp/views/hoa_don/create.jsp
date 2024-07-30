<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/14/2024
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/BTVN_war_exploded/hoa_don/store">
    <div>
        <label>ID </label>
        <input type="text" name="id">
    </div>
    <div>
        <label>ID NV</label>
        <input type="number" name="idNhanVien">
    </div>
    <div>
        <label>ID KH</label>
        <input type="number" name="idKhachHang">
    </div>
    <div>
        <label>Ngày mua</label>
        <input type="text" name="ngayMuaHang">
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="1" checked />
        <label>Đang hoạt động</label>
        <input type="radio" name="trangThai" value="0" />
        <label>Ngừng hoạt động</label>
    </div>
    <div>
        <button>Thêm</button>
    </div>
</form>
</body>
</html>
