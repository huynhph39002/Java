<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh Sách Khách Hàng</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 400px;
            margin: 50px auto;
            background: #fff;
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
        }
        h2 {
            margin-top: 0;
            margin-bottom: 30px;
            text-align: center;
        }
        input[type="text"],
        input[type="password"],
        input[type="date"],
        button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="text"],
        input[type="password"],
        input[type="date"] {
            font-size: 16px;
        }
        button {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            cursor: pointer;
            font-size: 18px;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 20px;
        }

        .banner {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            font-size: 18px;
            text-align: left;
            background-color: #fff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
        }

        table thead {
            background-color: #009879;
            color: #ffffff;
        }

        table th, table td {
            padding: 12px 15px;
            border: 1px solid #ddd;
        }

        table tbody tr {
            border-bottom: 1px solid #dddddd;
        }

        table tbody tr:nth-of-type(even) {
            background-color: #f3f3f3;
        }

        table tbody tr:last-of-type {
            border-bottom: 2px solid #009879;
        }

        table tbody tr:hover {
            background-color: #f1f1f1;
        }

        table th {
            font-weight: bold;
        }

        table td {
            font-size: 16px;
        }
    </style>
</head>
<body>
<div class="text-center mx-5">



<%--    <form action="/addKH" method="POST">--%>
<%--        <div class="form-group">--%>
<%--            <label for="ma">Mã:</label>--%>
<%--            <input type="text" class="form-control" id="ma" name="ma" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="ten">Tên:</label>--%>
<%--            <input type="text" class="form-control" id="ten" name="ten" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="tenDem">Tên Đệm:</label>--%>
<%--            <input type="text" class="form-control" id="tenDem" name="tenDem">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="ho">Họ:</label>--%>
<%--            <input type="text" class="form-control" id="ho" name="ho" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="ngaySinh">Ngày Sinh:</label>--%>
<%--            <input type="date" class="form-control" id="ngaySinh" name="ngaySinh" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="sdt">Số Điện Thoại:</label>--%>
<%--            <input type="text" class="form-control" id="sdt" name="sdt" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="diaChi">Địa Chỉ:</label>--%>
<%--            <input type="text" class="form-control" id="diaChi" name="diaChi" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="thanhPho">Thành Phố:</label>--%>
<%--            <input type="text" class="form-control" id="thanhPho" name="thanhPho">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="quocGia">Quốc Gia:</label>--%>
<%--            <input type="text" class="form-control" id="quocGia" name="quocGia">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="matKhau">Mật Khẩu:</label>--%>
<%--            <input type="password" class="form-control" id="matKhau" name="matKhau" required>--%>
<%--        </div>--%>
<%--        <button type="submit" class="btn btn-primary">Thêm mới</button>--%>
<%--    </form>--%>

    <h1>Danh Sách Khách Hàng</h1>
    <table class="table table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>Id</th>
            <th>Mã</th>
            <th>Tên</th>
            <th>Tên Đệm</th>
            <th>Họ</th>
            <th>Ngày Sinh</th>
            <th>SĐT</th>
            <th>Địa Chỉ</th>
            <th>Thành Phố</th>
            <th>Quốc Gia</th>
            <th>Mật Khẩu</th>
            <th colspan="2">Thao Tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listKH}" var="kh">
            <tr>
                <td>${kh.id}</td>
                <td>${kh.ma}</td>
                <td>${kh.ten}</td>
                <td>${kh.tenDem}</td>
                <td>${kh.ho}</td>
                <td>${kh.ngaySinh}</td>
                <td>${kh.sdt}</td>
                <td>${kh.diaChi}</td>
                <td>${kh.thanhPho}</td>
                <td>${kh.quocGia}</td>
                <td>${kh.matKhau}</td>
                <td>
                    <a class="btn btn-Warning" href="/update/${kh.id}">update</a>
                </td>
                <td>
                    <a class="btn btn-danger"  href="/deleteKH/${kh.id}">delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="container">
    <h2>Thêm mới Khách Hàng</h2>
    <form action="/addKH" method="POST">
        <input type="text" id="ma" name="ma" placeholder="Mã" required>
        <input type="text" id="ten" name="ten" placeholder="Tên" required>
        <input type="text" id="tenDem" name="tenDem" placeholder="Tên Đệm">
        <input type="text" id="ho" name="ho" placeholder="Họ" required>
        <input type="date" id="ngaySinh" name="ngaySinh" required>
        <input type="text" id="sdt" name="sdt" placeholder="Số Điện Thoại" required>
        <input type="text" id="diaChi" name="diaChi" placeholder="Địa Chỉ" required>
        <input type="text" id="thanhPho" name="thanhPho" placeholder="Thành Phố">
        <input type="text" id="quocGia" name="quocGia" placeholder="Quốc Gia">
        <input type="password" id="matKhau" name="matKhau" placeholder="Mật Khẩu" required>
        <button type="submit">Thêm mới</button>
    </form>
</div>

<a href="/loginn" class="btn btn-light">
    quay lai
</a>
</body>
</html>
