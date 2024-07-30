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
<form method="POST" action="/BTVN_war_exploded/khach_hang/store">
    <div>
        <label>Tên </label>
        <input type="text" name="ten">
    </div>
    <div>
        <label>SDT</label>
        <input type="text" name="sdt">
    </div>
    <div>
        <label>Mã KH</label>
        <input type="text" name="maKH">
    </div>
    <div>
        <label>Trạng thái </label>
        <input type="radio" name="trangThai" value="0" checked />
        <label>Hoạt động</label>
        <input type="radio" name="trangThai" value="1"  />
        <label>Ngừng Hoạt động</label>
    </div>
    <div>
        <button>Thêm</button>
    </div>
</form>
</body>
</html>
