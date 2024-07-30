<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/20/2024
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/nguyenduchuynh_ph39002_war_exploded/nhan-vien/store">
    <div>
        <label>ma</label>
        <input type="text" name="ma">
    </div>
    <div>
        <label>ten</label>
        <input type="text" name="ten">
    </div>
    <div>
        <label>tenDem</label>
        <input type="text" name="tenDem">
    </div>
    <div>
        <label>ho</label>
        <input type="text" name="ho">
    </div>
    <div>
        <label>gioiTinh</label>
        <input type="radio" name="gioiTinh" value="1" checked>
        <label>nam</label>
        <input type="radio" name="gioiTinh" value="0" >
        <label>nu</label>
    </div>

    <div>
        <label>ngaySinh</label>
        <input type="date" name="ngaySinh">
    </div>

    <div>
        <label>diaChi</label>
        <input type="text" name="diaChi">
    </div>

    <div>
    <label>sdt</label>
    <input type="text" name="sdt">
    </div>
    <label>matKhau</label>
    <input type="text" name="matKhau">
    </div>

    <div>
    <label>idCV</label>
    <input type="text" name="idCV">
    </div>

    <div>
        <label>trangThai</label>
        <input type="radio" name="trangThai" value="1" checked>
        <label>hoat dong </label>
        <input type="radio" name="trangThai" value="0" >
        <label>khong hoat dong</label>
    </div>

    <div>
        <button>them</button>
    </div>
</form>

</body>
</html>
