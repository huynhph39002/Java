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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          crossorigin="anonymous">
</head>
<body>

<div class="container-fluid">
    <main id="main" class="main">
        <div class="datatable-container">
            <div class="row">
                <div class="col-md-8">
                    <h4>Danh sách hóa đơn</h4>
                    <table class="table table-bordered">
                        <thead class="table-warning">

                        </thead>
                        <tbody>
                        <c:forEach items="${data_hd}" var="hd">

                        </c:forEach>
                        </tbody>
                    </table>
                    <h4>Danh sách hóa đơn chi tiết</h4>
                    <table class="table table-bordered">
                        <thead class="table-warning">
                        <tr>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${data_hdct}" var="hdct">

                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-4">
                    <h3>Thông tin đơn hàng</h3>
                    <div>
                        <form>
                            <div class="mt-3">
                                <label class="form-label">SĐT</label>
                                <input type="text" name="sdt" id="sdt" class="form-control" placeholder="Nhập sđt"/>
                            </div>
                            <button type="submit" class="btn btn-success mt-3">Search</button>
                        </form>

                    </div>
                    <div class="">
                        <form>
                            <div class="mt-3">
                                <label class="form-label">ID Hóa Đơn</label>
                                <input type="text" name="idHoaDon" id="idHoaDon" class="form-control"
                                       value="${hoaDon != null ? hoaDon.id : ''}" readonly/>
                            </div>
                            <div class="mt-3">
                                <label class="form-label">Tên Khách Hàng</label>
                                <input type="text"
                                       value="${khachHang != null ? khachHang.ten : 'Khách hàng chưa xác định'}"
                                       name="tenKhachHang" id="tenKhachHang" class="form-control" readonly/>
                            </div>
                            <div class="mt-3">
                                <label class="form-label">Tên Nhân Viên</label>
                                <input type="text" name="tenNV" id="tenNV" class="form-control"
                                       value="${nhanVien != null ? nhanVien.ten : 'Nhân viên chưa xác định'}"
                                       readonly/>
                            </div>
                            <div class="mt-3">
                                <label class="form-label">Tổng Tiền</label>
                                <input type="text" name="tongTien" id="tongTien" class="form-control"
                                       :value="${tongTien}" readonly/>
                            </div>

                            <div class="mt-3 mb-3 me-3">
                                <button class="btn btn-primary" type="submit">Tạo Hóa Đơn</button>
                            </div>
                        </form>
                        <!-- Phần code thanh toan-->
                        <!-- Button mở modal -->
                        <button type="button" class="btn btn-success btn-sm" data-bs-toggle="modal"
                                data-bs-target="#confirmPaymentModal">
                            Thanh Toán
                        </button>

                    </div>
                </div>
            </div>


        </div>
    </main>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
</body>
</html>