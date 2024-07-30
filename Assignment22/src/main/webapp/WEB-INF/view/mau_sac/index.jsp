
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
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
        @import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);
        @import url(https://fonts.googleapis.com/css?family=Titillium+Web:300);

        .fa-2x {
            font-size: 2em;
        }

        .fa, .bi {
            position: relative;
            display: table-cell;
            width: 60px;
            height: 36px;
            text-align: center;
            vertical-align: middle;
            font-size: 20px;
        }

        .main-menu:hover, nav.main-menu.expanded {
            width: 250px;
            overflow: visible;
        }

        .main-menu {
            background: #212121;
            border-right: 1px solid #e5e5e5;
            position: absolute;
            top: 0;
            bottom: 0;
            height: 100%;
            left: 0;
            width: 60px;
            overflow: hidden;
            -webkit-transition: width .05s linear;
            transition: width .2s linear;
            -webkit-transform: translateZ(0) scale(1, 1);
            z-index: 1000;
        }

        .main-menu > ul {
            margin: 7px 0;
        }

        .main-menu li {
            position: relative;
            display: block;
            width: 250px;
        }

        .main-menu li > a {
            position: relative;
            display: table;
            border-collapse: collapse;
            border-spacing: 0;
            color: #999;
            font-family: arial;
            font-size: 14px;
            text-decoration: none;
            -webkit-transform: translateZ(0) scale(1, 1);
            -webkit-transition: all .1s linear;
            transition: all .1s linear;
        }

        .main-menu .nav-icon {
            position: relative;
            display: table-cell;
            width: 60px;
            height: 36px;
            text-align: center;
            vertical-align: middle;
            font-size: 18px;
        }

        .main-menu .nav-text {
            position: relative;
            display: table-cell;
            vertical-align: middle;
            width: 190px;
            font-family: 'Titillium Web', sans-serif;
        }

        .main-menu > ul.logout {
            position: absolute;
            left: 0;
            bottom: 0;
        }

        .no-touch .scrollable.hover {
            overflow-y: hidden;
        }

        .no-touch .scrollable.hover:hover {
            overflow-y: auto;
            overflow: visible;
        }

        a:hover, a:focus {
            text-decoration: none;
        }

        nav {
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            -o-user-select: none;
            user-select: none;
        }

        nav ul, nav li {
            outline: 0;
            margin: 0;
            padding: 0;
        }

        .main-menu li:hover > a, nav.main-menu li.active > a, .dropdown-menu > li > a:hover, .dropdown-menu > li > a:focus, .dropdown-menu > .active > a, .dropdown-menu > .active > a:hover, .dropdown-menu > .active > a:focus, .no-touch .dashboard-page nav.dashboard-menu ul li:hover a, .dashboard-page nav.dashboard-menu ul li.active a {
            color: #fff;
            background-color: #000000;
        }

        .area {
            float: left;
            background: #e2e2e2;
            width: 100%;
            height: 100%;
        }

        @font-face {
            font-family: 'Titillium Web';
            font-style: normal;
            font-weight: 300;
            src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6)
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
<div class="container">
    <h2>Thêm mới Mau Sac</h2>
    <form action="${action}" method="POST">
        <input type="text" id="ma" name="ma" placeholder="Mã" value="${lh1.ma}" required>
        <input type="text" id="ten" name="ten" placeholder="Tên"value="${lh1.ten}" required>
        <button type="submit">${lh1==null?"Add":"Update"}</button>
    </form>

</div>
<div class="text-center mx-5">

    <table class="table table-bordered">
        <thead class="thead-dark">
    <tr>
<%--        <th>id</th>--%>
        <th>ma</th>
        <th>ten</th>
        <th colspan="2">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listMS}" var="s" >
        <tr>
<%--            <td>${s.id}</td>--%>
            <td>${s.ma}</td>
            <td>${s.ten}</td>
            <td>
                <a class="btn btn-Warning" href="/mau-sac/viewU/${s.id}">update</a>
            </td>
            <td>
                <a class="btn btn-danger"  href="/delete/${s.id}">delete</a>
            </td>
        </tr>
    </c:forEach>

    <c:if test="${listMS.size()==0}">
        <tr>
            <td colspan="4">Dữ liệu trống</td>
        </tr>
    </c:if>
    </tbody>
    </table>

    <div id="#">
        <c:if test="${numpage>1}">
            <button><a href="/mau-sac/index?page=0"><<</a></button>
            <c:forEach begin="1" end="${numpage}" var="page">
                <button><a href="/mau-sac/index?page=${page-1}">${page}</a></button>
            </c:forEach>
            <button><a href="/mau-sac/index?page=${numpage-1}">>></a></button>
        </c:if>
    </div>
<%--    <ul class="pagination">--%>
<%--        <c:forEach begin="0" end="${pagesize-1}" var="i">--%>
<%--            <li><a href="/mau-sac/index?pageNo=${i}">${i}</a></li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>
<div>
    <a class="btn btn-light" href="/loginn">quay lai</a>
</div>
</div>
</body>
</html>