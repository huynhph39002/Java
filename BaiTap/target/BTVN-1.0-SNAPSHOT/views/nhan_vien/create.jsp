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
<form method="POST" action="/BTVN_war_exploded/nhan_vien/store">
    <div>
        <label>Tên</label>
        <input type="text" name="ten">
    </div>
    <div>
        <label>Mã NV</label>
        <input type="text" name="maNV">
    </div>
    <div>
        <label>Tên đăng nhập</label>
        <input type="text" name="tenDangNhap">
    </div>
    <div>
        <label>Mật khẩu</label>
        <input type="text" name="matKhau">
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="0" checked />
        <label>Hoạt động</label>
        <input type="radio" name="trangThai" value="1"  />
        <label>Ngừng Hoạt động</label>
    </div>
    <div>
        <button>Thêm </button>
    </div>

</form>
</body>
</html>
