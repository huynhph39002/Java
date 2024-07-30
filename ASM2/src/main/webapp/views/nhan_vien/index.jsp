<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>

<div class="col-10 offset-1">

    <form class="mt-3 col-8 offset-2" action="/nhan-vien/index">
        <div class="row">
            <div class="col-8">
                <label class="col-2">Tên</label>
                <div class="col-10">
                    <input name="keyword" class="form-control" />
                </div>
            </div>
            <div class="mt-2 col-3">
                <button class="btn btn-light">Tìm kiếm</button>
            </div>

        </div>
    </form>
    <div >
        <a href="/nhan-vien/create"><button class="btn btn-light">Thêm mới</button></a>
    </div>


    <div class="col-10 offset-1">
        <table class="table table-stripped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Ten</th>
                <th>Ma NV</th>
                <th>Ten dang nhap</th>
                <th>Mat khau</th>
                <th>Trang thai</th>
                <th colspan="2">Thao tac</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${data.content}" var="nv">
                <tr>
                    <td>${nv.id}</td>
                    <td>${nv.ten}</td>
                    <td>${nv.maNV}</td>
                    <td>${nv.tenDangNhap}</td>
                    <td>${nv.matKhau}</td>
                    <td>${nv.trangThai==1 ? "Dang hoat dong": "Ngung hoat dong"}</td>
                    <td>
                        <a href="/nhan-vien/delete/${nv.id}">Delete</a>
                    </td>
                    <td>
                        <a href="/nhan-vien/edit/${nv.id}">Update</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item">
                <a class="page-link" href="/nhan-vien/index?page=${data.number - 1}">Previous</a>
            </li>
            <c:forEach begin="1" end="${ data.totalPages }" var="page">
                <c:if test="${ page == 1 || page == data.totalPages || ( page >= data.number - 1 && page <= data.number + 1 ) }">
                    <li class="page-item">
                        <a class="page-link"
                           href="/nhan-vien/index?page=${page}">
                                ${ page }
                        </a>
                    </li>
                </c:if>
            </c:forEach>
            <li class="page-item"><a class="page-link" href="/nhan-vien/index?page=${data.number + 1}">Next</a></li>
        </ul>
    </nav>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>