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
<form method="POST" action="/BTVN_war_exploded/hoa_don_chi_tiet/update">
    <div>
        <label>ID</label>
        <input type="text" name="id" value="${hdct.id}">
    </div>
    <div>
        <label>ID hoa don</label>
        <input type="number" name="idHoaDon" value="${hdct.idHoaDon}">
    </div>
    <div>
        <label>ID SPCT</label>
        <input type="number" name="idSPCT" value="${hdct.idSPCT}">
    </div>
    <div>
        <label>So luong</label>
        <input type="number" name="soLuong" value="${hdct.soLuong}">
    </div>
    <div>
        <label>Don gia</label>
        <input type="number" name="donGia" value="${hdct.donGia}">
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="1"
        ${hdct.trangThai == 1? "checked":""} />
        <label>Đang hoạt động</label>
        <input type="radio" name="trangThai" value="0"
        ${hdct.trangThai == 0? "checked":""}  />
        <label>Ngừng hoạt động</label>
    </div>
    <div>
        <button>Cập nhật</button>
    </div>
</form>
</body>
</html>
