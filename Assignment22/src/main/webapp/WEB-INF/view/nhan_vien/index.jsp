<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
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
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
        }

        h2 {
            margin-top: 0;
            margin-bottom: 30px;
            text-align: center;
        }

        input[type="text"],
        input[type="password"],
        input[type="date"],
        select,
        button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
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
</head>
<body>
<%--<div class="container mt-3">--%>

<%--    <br>--%>
<%--    <!-- Nav pills -->--%>
<%--    <ul class="nav nav-pills" role="tablist">--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link active" data-bs-toggle="pill" href="#home">Home</a>--%>
<%--        </li>--%>
<%--        <li class="nav-item dropdown">--%>
<%--            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Quan ly san pham</a>--%>
<%--            <ul class="dropdown-menu">--%>
<%--                <li><a class="dropdown-item" href="/san-pham/index">San pham</a></li>--%>
<%--                <li><a class="dropdown-item" href="/spct/index">San pham chi tiet</a></li>--%>
<%--                <li><a class="dropdown-item" href="/mau-sac/index">Mau sac</a></li>--%>
<%--                <li><a class="dropdown-item" href="/kich-thuoc/index">Kich thuoc</a></li>--%>
<%--            </ul>--%>
<%--        </li>--%>
<%--        <li class="nav-item dropdown">--%>
<%--            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Quan ly hoa don</a>--%>
<%--            <ul class="dropdown-menu">--%>
<%--                <li><a class="dropdown-item" href="/hoa-don/index">Hoa don</a></li>--%>
<%--                <li><a class="dropdown-item" href="/hdct/index">Hoa don chi tiet</a></li>--%>
<%--            </ul>--%>
<%--        </li>--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link" href="/khach-hang/index">Quan ly khach hang</a>--%>
<%--        </li>--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link"  href="/nhan-vien/index">Quan ly nhan vien</a>--%>
<%--        </li>--%>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link"  href="/ban-hang/index">Ban hang</a>--%>
<%--        </li>--%>
<%--    </ul>--%>
<%--</div>--%>


<%--<form method="post" action="/add" class="mt-4">--%>
<%--    ma:<input name="ma" type="text">--%>
<%--    ten:<input name="ten" type="text">--%>
<%--    <br>--%>
<%--    <button type="submit" class="btn btn-Success mt-3" style="text-align: center">add</button>--%>
<%--</form>--%>
<div class="text-center mx-5">
    <table class="table table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>Id</th>
            <th>Mã</th>
            <th>Tên</th>
            <th>Tên Đệm</th>
            <th>Họ</th>
            <th>Giới Tính</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>SĐT</th>
            <th>Mật Khẩu</th>
            <th>Id CH</th>
            <th>Id CV</th>
            <th>Id Gửi BC</th>
            <th>Trạng Thái</th>
            <th colspan="2">Thao Tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listNV}" var="n">
            <tr>
                <td>${n.id}</td>
                <td>${n.ma}</td>
                <td>${n.ten}</td>
                <td>${n.tenDem}</td>
                <td>${n.ho}</td>
                <td>${n.gioiTinh}</td>
                <td>${n.ngaySinh}</td>
                <td>${n.diaChi}</td>
                <td>${n.sdt}</td>
                <td>${n.matKhau}</td>
                <td>${n.idCH}</td>
                <td>${n.idCV}</td>
                <td>${n.idGuiBC}</td>
                <td>${n.trangThai}</td>
                <td>
                    <!-- Các nút thao tác như xem, sửa, xóa -->
                    <a href="/updateNV/${n.id}" class="btn btn-primary btn-sm">Sửa</a>
                </td>
                <td>
                    <a href="/deleteNV/${n.id}" class="btn btn-danger btn-sm">Xóa</a>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="container">
    <h2>Thêm mới Nhân viên</h2>
    <form action="/addNV" method="POST">
        <input type="text" id="ma" name="ma" placeholder="Mã nhân viên" required>
        <input type="text" id="ten" name="ten" placeholder="Tên" required>
        <input type="text" id="tenDem" name="tenDem" placeholder="Tên đệm">
        <input type="text" id="ho" name="ho" placeholder="Họ" required>
        <input type="text" id="ngaySinh" name="ngaySinh" placeholder="Ngày sinh (dd/MM/yyyy)" required>
        <%--            <input type="date" id="ngaySinh" name="ngaySinh" required>--%>
        <select id="gioiTinh" name="gioiTinh">
            <option value="Nam">Nam</option>
            <option value="Nữ">Nữ</option>
        </select>
        <input type="text" id="diaChi" name="diaChi" placeholder="Địa chỉ" required>
        <input type="text" id="sdt" name="sdt" placeholder="Số điện thoại" required>
        <input type="password" id="matKhau" name="matKhau" placeholder="Mật khẩu" required>
        <button type="submit">Thêm mới</button>
    </form>
</div>
<div>
    <a class="btn btn-light" href="/loginn">quay lai</a>
</div>

</body>
</html>