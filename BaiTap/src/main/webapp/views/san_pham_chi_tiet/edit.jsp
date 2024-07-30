<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/14/2024
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/BTVN_war_exploded/san_pham_chi_tiet/update">
    <div>
        <label>Ma SPCT</label>
        <input type="text" name="maSPCT" value="${spct.maSPCT}">
    </div>
    <div>
        <label>ID kich thuoc</label>
        <input type="number" name="idKichThuoc" value="${spct.idKichThuoc}">
    </div>
    <div>
        <label>ID mau sac</label>
        <input type="number" name="idMauSac" value="${spct.idMauSac}">
    </div>
    <div>
        <label>ID san pham</label>
        <input type="number" name="idSanPham" value="${spct.idSanPham}">
    </div>
    <div>
        <label>So luong</label>
        <input type="number" name="soLuong" value="${spct.soLuong}">
    </div>
    <div>
        <label>Don gia</label>
        <input type="number" name="donGia" value="${spct.donGia}">
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="1"
        ${spct.trangThai == 1? "checked":""} />
        <label>Đang hoạt động</label>
        <input type="radio" name="trangThai" value="0"
        ${spct.trangThai == 0? "checked":""}  />
        <label>Ngừng hoạt động</label>
    </div>
    <div>
        <button>Cap nhat</button>
    </div>
</form>
</body>
</html>
