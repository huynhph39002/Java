<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post" border="3">
    <div class="mt-3">
        <label>Ten Phong </label>
        <input name="ten" value="${ll.ten}" type="text">
    </div>
    <div class="mt-3">
        <label>ma Phong </label>
        <input name="ma" value="${ll.ma}" type="text">
    </div>
    <div class="mt-3">
        <label>Trang Thai:</label>
        <input name="trangThai" value="1"${ll.trangThai==1?'checked':''} type="radio" checked> <label>Con Phong</label>
        <input name="trangThai" value="0"${ll.trangThai==0?'checked':''} type="radio"><label>Het Phong</label>
    </div>

    <div class="mt-3">
        <label>Loai Phong</label>
        <select name="loaiPhong">
            <c:forEach items="${listLoai}" var="lp">
                <option value="${lp.id}">${lp.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mt-3">
        <label>So Luong:</label>
        <input type="text" value="${ll.soLuong}" name="soLuong">
    </div>
    <div class="mt-3">
        <label>Ghi Chu:</label>
        <input type="text" value="${ll.ghiChu}" name="ghiChu">
    </div>
    <div class="mt-3">
        <button type="submit">add</button>
    </div>
</form>

<table class="table" border="3">
    <thead>
    <tr>
        <th>ten phong</th>
        <th>ma phong</th>
        <th>so luong phong</th>
        <th>trang thai</th>
        <th>ten loai phong</th>
        <th>ghi chu</th>
        <th colspan="2">hanh dong</th>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${list}" var="l">
    <<tr>
    <td>${l.ten}</td>
    <td>${l.ma}</td>
    <td>${l.soLuong}</td>
    <td>${l.trangThai==1?'con phong':'het phong'}</td>
    <td>${l.loaiPhong.ten}</td>
    <td>${l.ghiChu}</td>
    <td>
        <a class="btn btn-light" href="/detail/${l.id}">detail</a>
    </td>
    <td>
        <a class="btn btn-light" href="/delete/${l.id}">delete</a>
    </td>
    </tr>
</c:forEach>
    </tbody>
</table>
</body>
</html>