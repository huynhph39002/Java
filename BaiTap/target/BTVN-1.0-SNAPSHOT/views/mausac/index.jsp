<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/12/2024
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            margin: 0 auto; /* Căn giữa table */
            width: 80%; /* Đặt chiều rộng của bảng */
            border-collapse: collapse; /* Gộp viền của các ô */
        }

        th, td {
            padding: 8px; /* Đặt padding cho các ô */
            text-align: left; /* Căn văn bản sang trái */
            border: 1px solid #ddd; /* Đặt viền cho các ô */
        }

        th {
            background-color: #f2f2f2; /* Đặt màu nền cho các thẻ <th> */
        }

        tr:nth-child(even) {
            background-color: #f2f2f2; /* Đặt màu nền cho các hàng chẵn */
        }
        /* CSS cho thẻ a */
        a {
            text-decoration: none; /* Loại bỏ gạch chân */
            color: #333; /* Màu văn bản */
            padding: 8px 16px; /* Đặt padding */
            background-color: #f2f2f2; /* Màu nền */
            border: 1px solid #ccc; /* Đặt viền */
            border-radius: 4px; /* Đặt góc cong */
            transition: background-color 0.3s, color 0.3s; /* Hiệu ứng chuyển đổi */
        }

        a:hover {
            background-color: #ddd; /* Màu nền khi di chuột qua */
            color: #555; /* Màu văn bản khi di chuột qua */
        }
    </style>
</head>
<body>
<a href="/BTVN_war_exploded/mausac/create">
    <button>Them</button></a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="ms">
        <tr>
            <td>${ms.id}</td>
            <td>${ ms.ma }</td>
            <td>${ ms.ten }</td>
            <td>${ ms.trangThai }</td>
            <td>
                <a href="/BTVN_war_exploded/mausac/edit?id=${ms.id}">Update</a>
            </td>
            <td>
                <a href="/BTVN_war_exploded/mausac/delete?id=${ms.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
