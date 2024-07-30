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
<form method="POST" action="/BTVN_war_exploded/hoa_don_chi_tiet/store">
    <div>
        <label>ID</label>
        <input type="text" name="id">
    </div>
    <div>
        <label>ID hoa don</label>
        <input type="number" name="idHoaDon">
    </div>
    <div>
        <label>ID SPCT</label>
        <input type="number" name="idSPCT">
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
        <input type="radio" name="trangThai" value="0" checked>
        <label>Hoat dong</label>
        <input type="radio" name="trangThai" value="1" >
        <label>Ngung hoat dong</label>

    </div>
    <div>
        <button>Them</button>
    </div>
</form>
</body>
</html>
