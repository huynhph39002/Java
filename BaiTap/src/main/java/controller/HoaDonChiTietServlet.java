package controller;

import entities.HoaDonChiTiet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.HoaDonChiTietRepo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/hoa_don_chi_tiet/create",
        "/hoa_don_chi_tiet/store",
        "/hoa_don_chi_tiet/edit",
        "/hoa_don_chi_tiet/update",
        "/hoa_don_chi_tiet/index",
        "/hoa_don_chi_tiet/delete",
})
public class HoaDonChiTietServlet extends HttpServlet {
    private HoaDonChiTietRepo hdctRepo = new HoaDonChiTietRepo();
    private List<HoaDonChiTiet> ds = new ArrayList<>();

    public HoaDonChiTietServlet(){
        ds.add(new HoaDonChiTiet("3", 1,1,03,250,0));
        ds.add(new HoaDonChiTiet("6", 2,2,10,50,0));
        ds.add(new HoaDonChiTiet("8", 3,3,30,20,0));
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
        request.getRequestDispatcher("/views/hoa_don_chi_tiet/create.jsp")
                .forward(request, response);
    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String id = request.getParameter("id");

        String IDHoaDon = request.getParameter("idHoaDon");
        int idHoaDon = Integer.parseInt(IDHoaDon);
        String IDSPCT = request.getParameter("idSPCT");
        int idSPCT = Integer.parseInt(IDSPCT);
        String sl = request.getParameter("soLuong");
        int soLuong = Integer.parseInt(sl);
        String dg = request.getParameter("donGia");
        int donGia = Integer.parseInt(dg);
        String ts = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ts);
        HoaDonChiTiet hdct = new HoaDonChiTiet(id, idHoaDon, idSPCT, soLuong, donGia, trangThai);
        this.ds.add(hdct);

        request.setAttribute("data", hdct);
        request.setAttribute("ds", ds);

        request.getRequestDispatcher("/views/hoa_don_chi_tiet/index.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String id = request.getParameter("id");

        for (int i = 0; i < this.ds.size(); i++) {
            HoaDonChiTiet c = this.ds.get(i);
            if (c.getId().equals(id)) {
                request.setAttribute("hdct", c);
            }
        }
        request.getRequestDispatcher("/views/hoa_don_chi_tiet/edit.jsp")
                .forward(request, response);
    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String id = request.getParameter("id");

        String IDHoaDon = request.getParameter("idHoaDon");
        int idHoaDon = Integer.parseInt(IDHoaDon);
        String IDSPCT = request.getParameter("idSPCT");
        int idSPCT = Integer.parseInt(IDSPCT);
        String sl = request.getParameter("soLuong");
        int soLuong = Integer.parseInt(sl);
        String dg = request.getParameter("donGia");
        int donGia = Integer.parseInt(dg);
        String ts = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ts);
        HoaDonChiTiet hdct = new HoaDonChiTiet(id, idHoaDon, idSPCT, soLuong, donGia, trangThai);

        for (int i = 0; i < this.ds.size(); i++) {
            HoaDonChiTiet c = this.ds.get(i);
            if (c.getId().equals(hdct.getId())) {
                this.ds.set(i, hdct);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/hoa_don_chi_tiet/index");
    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        request.setAttribute("ds", hdctRepo.findAll());
        request.getRequestDispatcher("/views/hoa_don_chi_tiet/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException {
        String id = request.getParameter("id");

        for (int i = 0; i < this.ds.size(); i++) {
            HoaDonChiTiet c = this.ds.get(i);
            if (c.getId().equals(id)) {
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/hoa_don_chi_tiet/index");
    }

}
