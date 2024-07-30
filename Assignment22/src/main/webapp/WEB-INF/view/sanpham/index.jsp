<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css">

    <link rel="stylesheet" type="text/css" href="styles.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css">
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
<div class="container-fluid">

        <!-- Main Content --><div class="col-md-11 ml-md-5"> <!-- Adjusted class -->
        <section class="banner">
            <h3>Quan ly san pham</h3>
<%--            <p>Your one-stop shop for the latest smartphones</p>--%>
        </section>
        <div class="container">
            <h2>them moi san pham</h2>
            <form action="/addSP" method="POST">
                <input type="text" id="ma" name="ma" placeholder="Mã" required>
                <input type="text" id="ten" name="ten" placeholder="Tên" required>
                <button type="submit">Thêm mới</button>
            </form>

        </div>



        <table>
            <thead>
            <tr>
                <TH>id</TH>
                <TH>ma</TH>
                <TH>ten</TH>
                <TH colspan="2">action</TH>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.ma}</td>
                    <td>${s.ten}</td>
                    <td> <a href="updateSP?id=${n.id}" class="btn btn-primary btn-sm">Sửa</a></td>
                    <td> <a href="deleteSP?id=${n.id}" class="btn btn-danger btn-sm">Xóa</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>




        <a class="btn btn-light" href="/mau-sac/index">mau sac</a>
    </div>

</div>
</body>
</html>
