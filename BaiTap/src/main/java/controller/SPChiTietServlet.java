package controller;

import entities.MauSac;
import entities.SPChiTiet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.SanPhamRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/san_pham_chi_tiet/create",
        "/san_pham_chi_tiet/store",
        "/san_pham_chi_tiet/edit",
        "/san_pham_chi_tiet/update",
        "/san_pham_chi_tiet/index",
        "/san_pham_chi_tiet/delete",
})
public class SPChiTietServlet extends HttpServlet {
    private SanPhamRepository spctRepo = new SanPhamRepository();
    private List<SPChiTiet> ds = new ArrayList<>();

    public SPChiTietServlet(){
        ds.add(new SPChiTiet(null, "SP01", 1,1,1, 2, 230, 1));
        ds.add(new SPChiTiet(null, "SP02", 2,2,2, 22, 30, 0));
        ds.add(new SPChiTiet(null, "SP03", 3,3,3, 12, 20, 1));
    }
    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
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
    )throws IOException, ServletException {
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
    )throws IOException, ServletException {
        request.setAttribute("ds", ds);
        request.getRequestDispatcher("/views/san_pham_chi_tiet/create.jsp")
                .forward(request, response);
    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String maSPCT = request.getParameter("maSPCT");
        String idKT = request.getParameter("idKichThuoc");
        int idKichThuoc = Integer.parseInt(idKT);
        String idMS = request.getParameter("idMauSac");
        int idMauSac = Integer.parseInt(idMS);
        String idSP = request.getParameter("idSanPham");
        int idSanPham = Integer.parseInt(idSP);
        String sl = request.getParameter("soLuong");
        int soLuong = Integer.parseInt(sl);
        String dg = request.getParameter("donGia");
        double donGia = Double.parseDouble(dg);
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        SPChiTiet spct = new SPChiTiet(null, maSPCT, idKichThuoc, idMauSac, idSanPham, soLuong, donGia, trangThai);
        this.ds.add(spct);

        request.setAttribute("data", spct);
        request.setAttribute("ds",ds);

        request.getRequestDispatcher("/views/san_pham_chi_tiet/index.jsp")
                .forward(request,response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String ma = request.getParameter("maSPCT");
        for (int i = 0; i < this.ds.size(); i++) {
            SPChiTiet c = this.ds.get(i);
            if (c.getMaSPCT().equals(ma)) {
                request.setAttribute("spct", c);
            }
        }
        request.getRequestDispatcher("/views/san_pham_chi_tiet/edit.jsp")
                .forward(request, response);

    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String maSPCT = request.getParameter("maSPCT");
        String idKT = request.getParameter("idKichThuoc");
        int idKichThuoc = Integer.parseInt(idKT);
        String idMS = request.getParameter("idMauSac");
        int idMauSac = Integer.parseInt(idMS);
        String idSP = request.getParameter("idSanPham");
        int idSanPham = Integer.parseInt(idSP);
        String sl = request.getParameter("soLuong");
        int soLuong = Integer.parseInt(sl);
        String dg = request.getParameter("donGia");
        double donGia = Double.parseDouble(dg);
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        SPChiTiet spct = new SPChiTiet(null, maSPCT, idKichThuoc, idMauSac, idSanPham, soLuong, donGia, trangThai);

        String ma = request.getParameter("maSPCT");
        for (int i = 0; i < this.ds.size(); i++) {
            SPChiTiet c = this.ds.get(i);
            if (c.getMaSPCT().equals(spct.getMaSPCT())) {
                this.ds.set(i, spct);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/san_pham_chi_tiet/index");

    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        request.setAttribute("ds", spctRepo.findAll());
        request.getRequestDispatcher("/views/san_pham_chi_tiet/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String ma = request.getParameter("maSPCT");
        for (int i = 0; i < this.ds.size(); i++) {
            SPChiTiet c = this.ds.get(i);
            if (c.getMaSPCT().equals(ma)) {
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/san_pham_chi_tiet/index");
    }
}
