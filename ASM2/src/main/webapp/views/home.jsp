<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
    <!-- Tab panes -->
<%--    <div class="tab-content">--%>
<%--        <div id="home" class="container tab-pane active"><br>--%>
<%--            <h3>HOME</h3>--%>
<%--            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>--%>
<%--        </div>--%>
<%--        <div id="menu1" class="container tab-pane fade"><br>--%>
<%--            <h3>Menu 1</h3>--%>
<%--            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>--%>
<%--        </div>--%>
<%--        <div id="menu2" class="container tab-pane fade"><br>--%>
<%--            <h3>Menu 2</h3>--%>
<%--            <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>--%>
<%--        </div>--%>
<%--    </div>--%>

<a href="redirect:/iindex">quay lai</a>
</body>
</html>
