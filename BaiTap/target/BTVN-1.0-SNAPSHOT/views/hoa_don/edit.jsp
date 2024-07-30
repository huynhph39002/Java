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
<form method="POST" action="/BTVN_war_exploded/hoa_don/update">
    <div>
        <label>ID </label>
        <input type="number" name="id" value="${hd.id}">
    </div>
    <div>
        <label>ID NV</label>
        <input type="number" name="idNhanVien" value="${hd.idNhanVien}" />
    </div>
    <div>
        <label>ID KH</label>
        <input type="number" name="idKhachHang" value="${hd.idKhachHang}" />
    </div>
    <div>
        <label>Ngày mua</label>
        <input type="text" name="ngayMuaHang" value="${hd.ngayMuaHang}" />
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="1"
        ${hd.trangThai == 1? "checked":""} />
        <label>Đang hoạt động</label>
        <input type="radio" name="trangThai" value="0"
        ${hd.trangThai == 0? "checked":""}  />
        <label>Ngừng hoạt động</label>
    </div>
    <div>
        <button>Cap nhat</button>
    </div>
</form>
</body>
</html>
