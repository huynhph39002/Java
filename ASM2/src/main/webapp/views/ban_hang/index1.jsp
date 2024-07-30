<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head th:replace="/layout/head :: head"></head>
<!-- Header -->
<div th:replace="/layout/header :: header"></div>
<body>
<!-- Side bar -->
<div th:replace="/layout/sidebar :: sidebar"></div>

<div class="container-fluid">
    <main id="main" class="main">
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        <h2 class="text-center">Bán Hàng Tại Quầy</h2>
        <div class="datatable-container">
            <div class="row">
                <div class="col-md-8">
                    <h4>Danh sách hóa đơn</h4>
                    <table class="table table-bordered">
                        <thead class="table-warning">
                        <tr>
                            <th data-sortable="true">ID</th>
                            <th data-sortable="true">Nhân Viên</th>
                            <th data-sortable="true">Khách Hàng</th>
                            <th data-sortable="true">Ngày Tạo</th>
                            <th data-sortable="true">Tổng Tiền</th>
                            <th data-sortable="true">Trạng thái</th>
                            <th data-sortable="true">Actions</th>
                        </tr>
                        </thead>
                        <tbody th:each="pr : ${hd}">
                        <tr th:if="${pr.trangThai == 0}">
                            <td th:text="${pr.id}"></td>
                            <td th:text="${pr.nhanVien.getTen()}"></td>
                            <td th:text="${pr.khachHang.getTen()}"></td>
                            <td th:text="${pr.ngayMuaHang}"></td>
                            <td th:text="${pr.tongTien != null ? pr.tongTien : totalAmount}"></td>
                            <td th:text="${pr.trangThai == 1 ? 'Đã thanh toán' : 'Chờ thanh toán'}"></td>
                            <td style="width: 1px" class="text-nowrap">
                                <a type="button" class="btn btn-warning"
                                   th:href="@{/admin/detail-order/{id}(id=${pr.id})}">Detail</a>
                            </td>
                        </tr>
                        </tbody>
                    </table>

                    <h4>Danh sách hóa đơn chi tiết</h4>
                    <table class="table table-bordered">
                        <thead class="table-warning">
                        <tr>
                            <th data-sortable="true">ID</th>
                            <th data-sortable="true">Hóa đơn ID</th>
                            <th data-sortable="true">Tên Sản Phẩm</th>
                            <th data-sortable="true">Số Lượng</th>
                            <th data-sortable="true">Đơn Giá</th>
                            <th data-sortable="true">Thành Tiền</th>
                            <th data-sortable="true">Trạng thái</th>
                            <th data-sortable="true">Actions</th>
                        </tr>
                        </thead>
                        <tbody th:each="pr : ${hdct}">
                        <tr th:if="${pr.trangThai == 0}">
                            <td th:text="${pr.id}"></td>
                            <td th:text="${pr.hoaDon.id}"></td>
                            <td th:text="${pr.sanPhamChiTiet.sanPham.ten}"></td>
                            <td th:text="${pr.soLuong}"></td>
                            <td th:text="${pr.donGia}"></td>
                            <td th:text="${pr.soLuong * pr.donGia}"></td> <!-- Tính thành tiền -->
                            <td th:text="${pr.trangThai}"></td>
                            <td style="width: 1px" class="text-nowrap">
                                <!-- Nút mở modal -->
                                <button type="button" class="btn btn-warning mb-2" data-bs-toggle="modal"
                                        data-bs-target="#updateModal_${a.id}">
                                    <i class="fa-solid fa-edit"></i> Cập nhật
                                </button>
                                <!-- Modal -->
                                <div class="modal fade" id="updateModal_${a.id}" tabindex="-1"
                                     aria-labelledby="updateModalLabel_${a.id}" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="updateModalLabel_${a.id}">Cập nhật
                                                    số lượng sản phẩm</h5>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                        aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                <!-- Form nhập số lượng -->
                                                <form method="post" th:action="@{/admin/updateSPCT/{id}(id=${pr.sanPhamChiTiet.id})}">
                                                    <input type="hidden" name="idHoaDon"
                                                           th:value="${pr.hoaDon.id}">
                                                    <input type="hidden" name="idCTSP"
                                                           th:value="${pr.sanPhamChiTiet.id}">
                                                    <input type="hidden" name="id" th:value="${pr.id}">
                                                    <input type="hidden" name="soLuongTrongGio"
                                                           th:value="${pr.soLuong}">
                                                    <div class="form-group">
                                                        <label class="form-label">Số lượng thay đổi:</label>
                                                        <input type="text" class="form-control" name="soLuongThayDoi">
                                                        <input type="hidden" name="soLuongThayDoi"
                                                               th:value="${pr.sanPhamChiTiet.soLuong}"/>
                                                    </div>
                                                    <button type="submit" class="btn btn-warning mt-2">Cập nhật</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <form th:action="@{/admin/deleteSPCT/{id}(id=${pr.id})}" method="get">
                                    <!--                                    <input type="hidden" name="id" th:value="${pr.id}"/>-->
                                    <input type="hidden" name="idHoaDon" th:value="${pr.hoaDon.id}"/>
                                    <input type="hidden" name="idCTSP" th:value="${pr.sanPhamChiTiet.id}"/>
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="mt-3" th:if="${error2}">
                        <span class="text-danger" th:text="${error}"></span>
                    </div>
                </div>
                <div class="col-md-4">
                    <h3>Thông tin đơn hàng</h3>
                    <div>
                        <form method="get" th:action="@{/admin/search}">
                            <div class="mt-3">
                                <label class="form-label">SĐT</label>
                                <input type="text" name="sdt" id="sdt" class="form-control" placeholder="Nhập sđt"/>
                            </div>
                            <button type="submit" class="btn btn-success mt-3">Search</button>
                        </form>

                        <div class="mt-3" th:if="${error}">
                            <span class="text-danger" th:text="${error}"></span>
                        </div>
                    </div>
                    <div class="">
                        <form th:action="@{/admin/create-order}" method="post">
                            <input type="hidden" name="id" th:value="${khachHang != null ? khachHang.id : ''}"/>
                            <div class="mt-3">
                                <label class="form-label">ID Hóa Đơn</label>
                                <input type="text" name="idHoaDon" id="idHoaDon" class="form-control"
                                       th:value="${hoaDon != null ? hoaDon.id : ''}" readonly/>
                            </div>
                            <div class="mt-3">
                                <label class="form-label">Tên Khách Hàng</label>
                                <input type="text"
                                       th:value="${khachHang != null ? khachHang.ten : 'Khách hàng chưa xác định'}"
                                       name="tenKhachHang" id="tenKhachHang" class="form-control" readonly/>
                            </div>
                            <div class="mt-3">
                                <label class="form-label">Tên Nhân Viên</label>
                                <input type="text" name="tenNV" id="tenNV" class="form-control"
                                       th:value="${nhanVien != null ? nhanVien.ten : 'Nhân viên chưa xác định'}"
                                       readonly/>
                            </div>
                            <div class="mt-3">
                                <label class="form-label">Tổng Tiền</label>
                                <input type="text" name="tongTien" id="tongTien" class="form-control"
                                       th:value="${tongTien}" readonly/>
                            </div>
                            <div class="mt-3" th:if="${error}">
                                <span class="text-danger" th:text="${error}"></span>
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
                        <!-- Modal -->
                        <div class="modal fade" id="confirmPaymentModal" tabindex="-1"
                             aria-labelledby="confirmPaymentModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="confirmPaymentModalLabel">Xác nhận thanh
                                            toán</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <p>Bạn có chắc chắn muốn thanh toán không?</p>
                                    </div>
                                    <div class="modal-footer">
                                        <!-- Form thanh toán -->
                                        <form th:action="@{/admin/thanhToanHD}" method="GET">
                                            <input type="hidden" name="idKH"
                                                   th:value="${hoaDon != null ? hoaDon.khachHang.id : null}"/>
                                            <input type="hidden" name="idNV"
                                                   th:value="${hoaDon != null ? hoaDon.nhanVien.id : null}"/>
                                            <input type="hidden" name="idHoaDon"
                                                   th:value="${hoaDon != null ? hoaDon.id : null}"/>
                                            <button type="submit" class="btn btn-success"
                                                    th:disabled="${hoaDon == null}">Thanh Toán
                                            </button>
                                            <!--Chèn thêm khi click button thanh toán-->
                                        </form>
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
                                            Hủy
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div class="row">
                <h4>Danh sách chi tiết sản phẩm</h4>
                <table class="table table-bordered">
                    <thead class="table-warning">
                    <tr>
                        <th>ID</th>
                        <th>Mã</th>
                        <th>Tên Sản Phẩm</th>
                        <th>Tên kích thước</th>
                        <th>Tên màu sắc</th>
                        <th>Số lượng</th>
                        <th>Đơn giá</th>
                        <th>Trạng thái</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody th:each="pr : ${spct}">
                    <tr>
                        <td th:text="${pr.id}"></td>
                        <td th:text="${pr.maSpct}"></td>
                        <td th:text="${pr.sanPham.getTen()}"></td>
                        <td th:text="${pr.kichThuoc.getTen()}"></td>
                        <td th:text="${pr.mauSac.getTen()}"></td>
                        <td th:text="${pr.soLuong}"></td>
                        <td th:text="${pr.donGia}"></td>
                        <td th:text="${pr.trangThai}"></td>
                        <td>
                            <!-- Button để mở modal -->
                            <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                                    data-bs-target="#modal_${pr.id}">
                                <i class="fa-solid fa-plus"></i> Thêm vào giỏ
                            </button>
                            <!-- Modal -->
                            <div class="modal fade" id="modal_${pr.id}" tabindex="-1"
                                 aria-labelledby="modalLabel_${pr.id}"
                                 aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="modalLabel_${pr.id}">Nhập số lượng muốn mua</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                    aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            <!-- Form nhập số lượng -->
                                            <form method="post" th:action="@{/admin/add}">
                                                <input type="hidden" name="spctId" th:value="${pr.id}"/>
                                                <input type="hidden" name="id"
                                                       th:value="${hoaDon != null ? hoaDon.id : ''}"/>
                                                <!-- Truyền ID của sản phẩm chi tiết -->
                                                <div class="mb-3">
                                                    <label class="form-label">Số lượng:</label>
                                                    <input type="number" class="form-control"
                                                           name="soLuong" required>
                                                    <input type="hidden" name="soLuong" th:value="${pr.soLuong}"/>
                                                </div>
                                                <button type="submit" class="btn btn-primary">Thêm vào giỏ hàng</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
                <div th:if="${error}" class="alert alert-danger mt-3" role="alert">
                    <p th:text="${error}"></p>
                </div>
                <!-- Điều khiển phân trang -->
                <div th:if="${totalPages > 1}">
                    <div class="row col-sm-10">
                        <div class="col-sm-2">
                            Total Rows: [[${totalItems}]]
                        </div>
                        <div class="col-sm-6">
                            <nav aria-label="Page navigation">
                                <ul class="pagination justify-content-end">
                                    <li class="page-item">
                                        <a class="page-link" th:if="${currentPage > 1}"
                                           th:href="@{'?keyword=' + (${keyword != null and keyword != '' ? keyword : ''}) + '&pageNo=' + (${currentPage} - 1)}"
                                           aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                        <span class="page-link" th:unless="${currentPage > 1}"
                                              aria-hidden="true">&laquo;</span>
                                    </li>
                                    <!--Chạy tuần tự từ 1 đến totalPages(ctrl) mỗi lần chạy i tăng 1 đơn vị-->
                                    <span th:each="i: ${#numbers.sequence(1, totalPages)}">
                        <li class="page-item" th:classappend="${currentPage == i} ? 'active'">
                            <a class="page-link"
                               th:href="@{'?keyword=' + (${keyword != null and keyword != '' ? keyword : ''}) + '&pageNo=' + ${i}}"
                               th:text="${i}"></a>
                        </li>
                    </span>
                                    <li class="page-item">
                                        <a class="page-link" th:if="${currentPage < totalPages}"
                                           th:href="@{'?keyword=' + (${keyword != null and keyword != '' ? keyword : ''}) + '&pageNo=' + (${currentPage} + 1)}"
                                           aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                        <span class="page-link" th:unless="${currentPage < totalPages}"
                                              aria-hidden="true">&raquo;</span>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>


<!-- End #main -->
<!-- ======= Footer ======= -->
<div th:replace="/layout/footer :: footer"></div>

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
        class="bi bi-arrow-up-short"></i></a>
<div th:replace="/layout/script :: script"></div>

</body>
</html>