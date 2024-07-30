<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/19/2024
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="POST"action="/de1_java4_war_exploded/ban/detail?id=${b.id}">

    <div>
        <label>ma</label>
        <input type="text"name="ma" value="${b.ma}">
    </div>
    <div>
        <label>ten</label>
        <input type="text"name="ten" value="${b.ten}">
    </div>
    <div>
        <label>ngaySinh</label>
        <input type="date"name="ngaySinh"value="${b.ngaySinh}">
    </div>
    <div>
        <label>soThich</label>
        <input type="text"name="soThich"value="${b.soThich}">
    </div>
    <div>
        <label>gioiTinh</label>
        <input type="radio"name="gioiTinh" value="1"
        ${b.gioiTinh ==1 ? "checked" : ""}>
        <label>nam</label>
        <input type="radio"name="gioiTinh" value="0"
        ${b.trangThai ==0 ? "checked" : ""}>
        <label>nu</label>
    </div>
    <div>
        <label>idMQH</label>
        <input type="text"name="idMQH"value="${b.idMQH}">
    </div>
    <div>
        <label>trangThai</label>
        <input type="radio"name="trangThai" value="1"
        ${b.trangThai ==1 ? "checked" : ""}>
        <label>hoat dong</label>
        <input type="radio"name="trangThai" value="0"
        ${b.trangThai ==0 ? "checked" : ""}>
        <label>khong hoat dong</label>
    </div>
    <div>
        <button>Add</button>
    </div>
</form>

</body>
</html>
