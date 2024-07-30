package controller;

import entities.KhachHang;
import entities.NhanVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.NhanVienRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/nhan_vien/create",
        "/nhan_vien/store",
        "/nhan_vien/edit",
        "/nhan_vien/update",
        "/nhan_vien/index",
        "/nhan_vien/delete",
})
public class NhanVienServlet extends HttpServlet {
    private NhanVienRepository nvRepo = new NhanVienRepository();
    private List<NhanVien> ds = new ArrayList<>();

    public NhanVienServlet() {
        ds.add(new NhanVien(null, "Lan", "NV01", "Lan01", "123", 1));
        ds.add(new NhanVien(null, "Mai", "NV02", "Mai01", "123", 0));
        ds.add(new NhanVien(null, "Hoa", "NV03", "Hoa01", "123", 0));
    }

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else {
            this.index(request, response);
        }
    }

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String uri = request.getRequestURI();
        if (uri.contains("store")) {
            this.store(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        } else {
            //
        }
    }

    public void create(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        request.setAttribute("ds", ds);
        request.getRequestDispatcher("/views/nhan_vien/create.jsp")
                .forward(request, response);
    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ten = request.getParameter("ten");
        String maNV = request.getParameter("maNV");
        String tenDangNhap = request.getParameter("tenDangNhap");
        String matKhau = request.getParameter("matKhau");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        NhanVien nv = new NhanVien(null, ten, maNV, tenDangNhap, matKhau, trangThai);
        this.ds.add(nv);

        request.setAttribute("data", nv);
        request.setAttribute("ds", ds);

        request.getRequestDispatcher("/views/nhan_vien/index.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String maNV = request.getParameter("maNV");
        for (int i = 0; i < this.ds.size(); i++) {
            NhanVien c = this.ds.get(i);
            if (c.getMaNV().equals(maNV)){
                request.setAttribute("nv",c);
            }
        }
        request.getRequestDispatcher("/views/nhan_vien/edit.jsp")
                .forward(request, response);
    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ten = request.getParameter("ten");
        String maNV = request.getParameter("maNV");
        String tenDangNhap = request.getParameter("tenDangNhap");
        String matKhau = request.getParameter("matKhau");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        NhanVien nv = new NhanVien(null, ten, maNV, tenDangNhap, matKhau, trangThai);

        for (int i = 0; i < this.ds.size(); i++) {
            NhanVien c = this.ds.get(i);
            if (c.getMaNV().equals(nv.getMaNV())){
                this.ds.set(i, nv);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/nhan_vien/index");
    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        request.setAttribute("ds", nvRepo.findAll());
        request.getRequestDispatcher("/views/nhan_vien/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String maNV = request.getParameter("maNV");
        for (int i = 0; i < this.ds.size(); i++) {
            NhanVien c = this.ds.get(i);
            if (c.getMaNV().equals(maNV)){
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/nhan_vien/index");
    }

}
