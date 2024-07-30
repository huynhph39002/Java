package controller;

import entities.KhachHang;
import entities.MauSac;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.KhachHangRepository;
import repositories.MauSacRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/khach_hang/create",
        "/khach_hang/store",
        "/khach_hang/edit",
        "/khach_hang/update",
        "/khach_hang/index",
        "/khach_hang/delete",
})
public class KhachHangServlet extends HttpServlet {
    private KhachHangRepository khRepo = new KhachHangRepository();
    List<KhachHang> ds = new ArrayList<>();

    public KhachHangServlet(){
        ds.add(new KhachHang(null, "Nhung", 862443023, "KH01", 1));
        ds.add(new KhachHang(null, "Nam", 862443023, "KH02", 0));
        ds.add(new KhachHang(null, "Mai", 862443023, "KH03", 1));
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
    )throws IOException, ServletException{
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
    )throws IOException, ServletException{
        request.setAttribute("ds", ds);
        request.getRequestDispatcher("/views/khach_hang/create.jsp")
                .forward(request, response);
    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String ten = request.getParameter("ten");
        String phone = request.getParameter("sdt");
        int sdt = Integer.parseInt(phone);
        String maKH = request.getParameter("maKH");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        KhachHang kh = new KhachHang(null, ten, sdt, maKH, trangThai);
        this.ds.add(kh);

        request.setAttribute("data", kh);
        request.setAttribute("ds",ds);

        request.getRequestDispatcher("/views/khach_hang/index.jsp")
                .forward(request,response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String maKH = request.getParameter("maKH");
        for (int i = 0; i < this.ds.size(); i++) {
            KhachHang c = this.ds.get(i);
            if (c.getMaKH().equals(maKH)) {
               request.setAttribute("kh", c);
            }
        }
        request.getRequestDispatcher("/views/khach_hang/edit.jsp")
                .forward(request,response);
    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String ten = request.getParameter("ten");
        String phone = request.getParameter("sdt");
        int sdt = Integer.parseInt(phone);
        String maKH = request.getParameter("maKH");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        KhachHang kh = new KhachHang(null, ten, sdt, maKH, trangThai);

        for (int i = 0; i < this.ds.size(); i++) {
            KhachHang c = this.ds.get(i);
            if (c.getMaKH().equals(kh.getMaKH())) {
                this.ds.set(i, kh);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/khach_hang/index");
    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        request.setAttribute("ds", khRepo.findAll());
        request.getRequestDispatcher("/views/khach_hang/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String maKH = request.getParameter("maKH");
        for (int i = 0; i < this.ds.size(); i++) {
            KhachHang c = this.ds.get(i);
            if (c.getMaKH().equals(maKH)) {
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/khach_hang/index");
    }

}
