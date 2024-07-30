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
<form method="POST" action="/BTVN_war_exploded/san_pham_chi_tiet/store">
    <div>
        <label>Ma SPCT</label>
        <input type="text" name="maSPCT">
    </div>
    <div>
        <label>ID kich thuoc</label>
        <input type="number" name="idKichThuoc">
    </div>
    <div>
        <label>ID mau sac</label>
        <input type="number" name="idMauSac">
    </div>
    <div>
        <label>ID san pham</label>
        <input type="number" name="idSanPham">
    </div>
    <div>
        <label>So luong</label>
        <input type="number" name="soLuong">
    </div>
    <div>
        <label>Don gia</label>
        <input type="number" name="donGia">
    </div>
    <div>
        <label>Trang thai</label>
        <input type="radio" name="trangThai" value="0" checked/>
        <label> Hoat dong</label>
        <input type="radio" name="trangThai" value="1"/>
        <label> Ngung Hoat dong</label>
    </div>
    <div>
        <button>Them</button>
    </div>
</form>
</body>
</html>
