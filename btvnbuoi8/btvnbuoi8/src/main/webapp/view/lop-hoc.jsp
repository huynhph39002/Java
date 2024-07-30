<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/search" method="post">
    <p>Tên Lớp: <input type="text" name="timTenLop" value="${param.timTenLop}"></p>
    <p>Địa điểm Lớp Học: <input type="text" name="timDiaDiemLop" value="${param.timDiaDiemLop}"></p>
    <button>Search</button>
</form>
<hr>
<form action="${action}" method="post">
    <p>ID Lớp: <input type="text" name="id"value="${lh1.id}" readonly></p>
    <p>Tên Lớp: <input type="text" name="tenLop" value="${lh1.tenLop}"></p>
    <p>Địa điểm Lớp Học: <input type="text" name="diaDiemLop" value="${lh1.diaDiemLop}"></p>
    <button>${lh1==null?"Add":"Update"}</button>
</form>
<hr>
<table border="1">
    <tr>
        <th>ID Lớp Học</th>
        <th>Tên Lớp Học</th>
        <th>Địa Điểm Lớp Học</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${lstLH}" var="lh">
        <tr>
            <td>${lh.id}</td>
            <td>${lh.tenLop}</td>
            <td>${lh.diaDiemLop}</td>
            <td>
                <button><a href="/update/${lh.id}">Edit</a></button>
                <button><a href="/xoa/${lh.id}">Remove</a></button>
            </td>
        </tr>
    </c:forEach>
    <c:if test="${lstLH.size()==0}">
        <tr>
            <td colspan="4">Dữ liệu trống</td>
        </tr>
    </c:if>
</table>
<c:if test="${numpage>1}">
    <button><a href="/hien-thi?page=0"><<</a></button>
    <c:forEach begin="1" end="${numpage}" var="page">
        <button><a href="/hien-thi?page=${page-1}">${page}</a></button>
    </c:forEach>
    <button><a href="/hien-thi?page=${numpage-1}">>></a></button>
</c:if>
</body>
</html>