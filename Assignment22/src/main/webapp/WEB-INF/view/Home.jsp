<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">--%>
<%--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css">--%>

<%--    <link rel="stylesheet" type="text/css" href="styles.css">--%>
<%--    <link rel="stylesheet"--%>
<%--          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css">--%>
<%--    <style>--%>
<%--        @import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);--%>
<%--        @import url(https://fonts.googleapis.com/css?family=Titillium+Web:300);--%>

<%--        .fa-2x {--%>
<%--            font-size: 2em;--%>
<%--        }--%>

<%--        .fa, .bi {--%>
<%--            position: relative;--%>
<%--            display: table-cell;--%>
<%--            width: 60px;--%>
<%--            height: 36px;--%>
<%--            text-align: center;--%>
<%--            vertical-align: middle;--%>
<%--            font-size: 20px;--%>
<%--        }--%>

<%--        .main-menu:hover, nav.main-menu.expanded {--%>
<%--            width: 250px;--%>
<%--            overflow: visible;--%>
<%--        }--%>

<%--        .main-menu {--%>
<%--            background: #212121;--%>
<%--            border-right: 1px solid #e5e5e5;--%>
<%--            position: absolute;--%>
<%--            top: 0;--%>
<%--            bottom: 0;--%>
<%--            height: 100%;--%>
<%--            left: 0;--%>
<%--            width: 60px;--%>
<%--            overflow: hidden;--%>
<%--            -webkit-transition: width .05s linear;--%>
<%--            transition: width .05s linear;--%>
<%--            -webkit-transform: translateZ(0) scale(1, 1);--%>
<%--            z-index: 1000;--%>
<%--        }--%>

<%--        .main-menu > ul {--%>
<%--            margin: 7px 0;--%>
<%--        }--%>

<%--        .main-menu li {--%>
<%--            position: relative;--%>
<%--            display: block;--%>
<%--            width: 250px;--%>
<%--        }--%>

<%--        .main-menu li > a {--%>
<%--            position: relative;--%>
<%--            display: table;--%>
<%--            border-collapse: collapse;--%>
<%--            border-spacing: 0;--%>
<%--            color: #999;--%>
<%--            font-family: arial;--%>
<%--            font-size: 14px;--%>
<%--            text-decoration: none;--%>
<%--            -webkit-transform: translateZ(0) scale(1, 1);--%>
<%--            -webkit-transition: all .1s linear;--%>
<%--            transition: all .1s linear;--%>
<%--        }--%>

<%--        .main-menu .nav-icon {--%>
<%--            position: relative;--%>
<%--            display: table-cell;--%>
<%--            width: 60px;--%>
<%--            height: 36px;--%>
<%--            text-align: center;--%>
<%--            vertical-align: middle;--%>
<%--            font-size: 18px;--%>
<%--        }--%>

<%--        .main-menu .nav-text {--%>
<%--            position: relative;--%>
<%--            display: table-cell;--%>
<%--            vertical-align: middle;--%>
<%--            width: 190px;--%>
<%--            font-family: 'Titillium Web', sans-serif;--%>
<%--        }--%>

<%--        .main-menu > ul.logout {--%>
<%--            position: absolute;--%>
<%--            left: 0;--%>
<%--            bottom: 0;--%>
<%--        }--%>
<%--        .no-touch .scrollable.hover {--%>
<%--            overflow-y: hidden;--%>
<%--        }--%>

<%--        .no-touch .scrollable.hover:hover {--%>
<%--            overflow-y: auto;--%>
<%--            overflow: visible;--%>
<%--        }--%>

<%--        a:hover, a:focus {--%>
<%--            text-decoration: none;--%>
<%--        }--%>

<%--        nav {--%>
<%--            -webkit-user-select: none;--%>
<%--            -moz-user-select: none;--%>
<%--            -ms-user-select: none;--%>
<%--            -o-user-select: none;--%>
<%--            user-select: none;--%>
<%--        }--%>

<%--        nav ul, nav li {--%>
<%--            outline: 0;--%>
<%--            margin: 0;--%>
<%--            padding: 0;--%>
<%--        }--%>

<%--        .main-menu li:hover > a, nav.main-menu li.active > a, .dropdown-menu > li > a:hover, .dropdown-menu > li > a:focus, .dropdown-menu > .active > a, .dropdown-menu > .active > a:hover, .dropdown-menu > .active > a:focus, .no-touch .dashboard-page nav.dashboard-menu ul li:hover a, .dashboard-page nav.dashboard-menu ul li.active a {--%>
<%--            color: #fff;--%>
<%--            background-color: #000000;--%>
<%--        }--%>

<%--        .area {--%>
<%--            float: left;--%>
<%--            background: #e2e2e2;--%>
<%--            width: 100%;--%>
<%--            height: 100%;--%>
<%--        }--%>

<%--        @font-face {--%>
<%--            font-family: 'Titillium Web';--%>
<%--            font-style: normal;--%>
<%--            font-weight: 300;--%>
<%--            src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6)--%>
<%--        }--%>

<%--    </style>--%>
<%--    <style>--%>
<%--        @import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);--%>
<%--        @import url(https://fonts.googleapis.com/css?family=Titillium+Web:300);--%>

<%--        .fa-2x {--%>
<%--            font-size: 2em;--%>
<%--        }--%>

<%--        .fa, .bi {--%>
<%--            position: relative;--%>
<%--            display: table-cell;--%>
<%--            width: 60px;--%>
<%--            height: 36px;--%>
<%--            text-align: center;--%>
<%--            vertical-align: middle;--%>
<%--            font-size: 20px;--%>
<%--        }--%>

<%--        .main-menu:hover, nav.main-menu.expanded {--%>
<%--            width: 250px;--%>
<%--            overflow: visible;--%>
<%--        }--%>

<%--        .main-menu {--%>
<%--            background: #212121;--%>
<%--            border-right: 1px solid #e5e5e5;--%>
<%--            position: absolute;--%>
<%--            top: 0;--%>
<%--            bottom: 0;--%>
<%--            height: 100%;--%>
<%--            left: 0;--%>
<%--            width: 60px;--%>
<%--            overflow: hidden;--%>
<%--            -webkit-transition: width .05s linear;--%>
<%--            transition: width .2s linear;--%>
<%--            -webkit-transform: translateZ(0) scale(1, 1);--%>
<%--            z-index: 1000;--%>
<%--        }--%>

<%--        .main-menu > ul {--%>
<%--            margin: 7px 0;--%>
<%--        }--%>

<%--        .main-menu li {--%>
<%--            position: relative;--%>
<%--            display: block;--%>
<%--            width: 250px;--%>
<%--        }--%>

<%--        .main-menu li > a {--%>
<%--            position: relative;--%>
<%--            display: table;--%>
<%--            border-collapse: collapse;--%>
<%--            border-spacing: 0;--%>
<%--            color: #999;--%>
<%--            font-family: arial;--%>
<%--            font-size: 14px;--%>
<%--            text-decoration: none;--%>
<%--            -webkit-transform: translateZ(0) scale(1, 1);--%>
<%--            -webkit-transition: all .1s linear;--%>
<%--            transition: all .1s linear;--%>
<%--        }--%>

<%--        .main-menu .nav-icon {--%>
<%--            position: relative;--%>
<%--            display: table-cell;--%>
<%--            width: 60px;--%>
<%--            height: 36px;--%>
<%--            text-align: center;--%>
<%--            vertical-align: middle;--%>
<%--            font-size: 18px;--%>
<%--        }--%>

<%--        .main-menu .nav-text {--%>
<%--            position: relative;--%>
<%--            display: table-cell;--%>
<%--            vertical-align: middle;--%>
<%--            width: 190px;--%>
<%--            font-family: 'Titillium Web', sans-serif;--%>
<%--        }--%>

<%--        .main-menu > ul.logout {--%>
<%--            position: absolute;--%>
<%--            left: 0;--%>
<%--            bottom: 0;--%>
<%--        }--%>

<%--        .no-touch .scrollable.hover {--%>
<%--            overflow-y: hidden;--%>
<%--        }--%>

<%--        .no-touch .scrollable.hover:hover {--%>
<%--            overflow-y: auto;--%>
<%--            overflow: visible;--%>
<%--        }--%>

<%--        a:hover, a:focus {--%>
<%--            text-decoration: none;--%>
<%--        }--%>

<%--        nav {--%>
<%--            -webkit-user-select: none;--%>
<%--            -moz-user-select: none;--%>
<%--            -ms-user-select: none;--%>
<%--            -o-user-select: none;--%>
<%--            user-select: none;--%>
<%--        }--%>

<%--        nav ul, nav li {--%>
<%--            outline: 0;--%>
<%--            margin: 0;--%>
<%--            padding: 0;--%>
<%--        }--%>

<%--        .main-menu li:hover > a, nav.main-menu li.active > a, .dropdown-menu > li > a:hover, .dropdown-menu > li > a:focus, .dropdown-menu > .active > a, .dropdown-menu > .active > a:hover, .dropdown-menu > .active > a:focus, .no-touch .dashboard-page nav.dashboard-menu ul li:hover a, .dashboard-page nav.dashboard-menu ul li.active a {--%>
<%--            color: #fff;--%>
<%--            background-color: #000000;--%>
<%--        }--%>

<%--        .area {--%>
<%--            float: left;--%>
<%--            background: #e2e2e2;--%>
<%--            width: 100%;--%>
<%--            height: 100%;--%>
<%--        }--%>

<%--        @font-face {--%>
<%--            font-family: 'Titillium Web';--%>
<%--            font-style: normal;--%>
<%--            font-weight: 300;--%>
<%--            src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6)--%>
<%--        }--%>

<%--    </style>--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div class="container mt-3">

    <br>
    <!-- Nav pills -->
    <ul class="nav nav-pills" role="tablist">
        <li class="nav-item">
            <a class="nav-link active" data-bs-toggle="pill" href="#home">Home</a>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Quan ly san pham</a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="/san-pham/index">San pham</a></li>
                <li><a class="dropdown-item" href="/spct/index">San pham chi tiet</a></li>
                <li><a class="dropdown-item" href="/mau-sac/index">Mau sac</a></li>
                <li><a class="dropdown-item" href="/kich-thuoc/index">Kich thuoc</a></li>
            </ul>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Quan ly hoa don</a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="/hoa-don/index">Hoa don</a></li>
                <li><a class="dropdown-item" href="/hdct/index">Hoa don chi tiet</a></li>
            </ul>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/khach-hang/index">Quan ly khach hang</a>
        </li>
        <li class="nav-item">
            <a class="nav-link"  href="/nhan-vien/index">Quan ly nhan vien</a>
        </li>
        <li class="nav-item">
            <a class="nav-link"  href="/ban-hang/index">Ban hang</a>
        </li>
    </ul>
</div>
<%--<div class="container-fluid">--%>
<%--    <div class="row">--%>
<%--        <!-- Sidebar -->--%>
<%--        <nav class="col-md-3 main-menu">--%>
<%--            <ul>--%>
<%--                <li>--%>
<%--                    <a href="/loginn#">--%>
<%--                        <i class="fa fa-home fa-2x"></i>--%>
<%--                        <span class="nav-text">Trang chủ</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li class="has-subnav">--%>
<%--                    <a href="/nhan-vien/index">--%>
<%--                        <i class="bi bi-person-circle fa-2x"></i>--%>
<%--                        <span class="nav-text">Nhan Vien</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li class="has-subnav">--%>
<%--                    <a href="/san-pham/index">--%>
<%--                        <i class="bi bi-phone fa-2x"></i>--%>
<%--                        <span class="nav-text">Sản phẩm </span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li class="has-subnav">--%>
<%--                    <a href="/khach-hang/index">--%>
<%--                        <i class="fa fa-camera-retro fa-2x"></i>--%>
<%--                        <span class="nav-text">khach hang</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="fa fa-film fa-2x"></i>--%>
<%--                        <span class="nav-text">Surveying Tutorials</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="fa fa-book fa-2x"></i>--%>
<%--                        <span class="nav-text">Surveying Jobs</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="fa fa-cogs fa-2x"></i>--%>
<%--                        <span class="nav-text">Tools & Resources</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="fa fa-map-marker fa-2x"></i>--%>
<%--                        <span class="nav-text">Member Map</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="fa fa-info fa-2x"></i>--%>
<%--                        <span class="nav-text">Documentation</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--            </ul>--%>
<%--             <div>--%>
<%--                 <span style="color: white"> ${sessionScope.username}</span>--%>
<%--             </div>--%>
<%--            <ul class="logout">--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="fa fa-power-off fa-2x"></i>--%>
<%--                        <span class="nav-text">Logout</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--            </ul>--%>
<%--        </nav>--%>

<%--        <!-- Main Content --><div class="col-md-11 ml-md-5"> <!-- Adjusted class -->--%>
<%--        <section class="banner">--%>
<%--            <h1>Welcome to Phone Store</h1>--%>
<%--            <p>Your one-stop shop for the latest smartphones</p>--%>
<%--        </section>--%>

<%--        <section class="featured-products container">--%>
<%--            <h2>Featured Products</h2>--%>
<%--            <div class="row">--%>
<%--                <div class="col-md-4">--%>
<%--                    <div class="card product">--%>
<%--                        <img src="phone1.jpg" class="card-img-top" alt="Phone 1">--%>
<%--                        <div class="card-body">--%>
<%--                            <h5 class="card-title">Phone Model 1</h5>--%>
<%--                            <p class="card-text">$499.99</p>--%>
<%--                            <a href="#" class="btn btn-primary">Buy Now</a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-md-4">--%>
<%--                    <div class="card product">--%>
<%--                        <img src="phone2.jpg" class="card-img-top" alt="Phone 2">--%>
<%--                        <div class="card-body">--%>
<%--                            <h5 class="card-title">Phone Model 2</h5>--%>
<%--                            <p class="card-text">$599.99</p>--%>
<%--                            <a href="#" class="btn btn-primary">Buy Now</a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-md-4">--%>
<%--                    <div class="card product">--%>
<%--                        <img src="phone3.jpg" class="card-img-top" alt="Phone 3">--%>
<%--                        <div class="card-body">--%>
<%--                            <h5 class="card-title">Phone Model 3</h5>--%>
<%--                            <p class="card-text">$699.99</p>--%>
<%--                            <a href="#" class="btn btn-primary">Buy Now</a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </section>--%>
<%--    </div>--%>

<%--    </div>--%>
<%--</div>--%>

</body>
</html>
