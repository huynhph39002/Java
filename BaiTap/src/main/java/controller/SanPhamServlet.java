package controller;

import entities.MauSac;
import entities.SanPham;
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
        "/san_pham/index",
        "/san_pham/store",
        "/san_pham/create",
        "/san_pham/update",
        "/san_pham/edit",
        "/san_pham/delete",
})
public class SanPhamServlet extends HttpServlet {
    private SanPhamRepository spRepo = new SanPhamRepository();
    private List<SanPham> ds = new ArrayList<SanPham>();

    public SanPhamServlet(){
        ds.add(new SanPham(null, "01","Book", 1));
        ds.add(new SanPham(null, "03","Notebook", 1));
        ds.add(new SanPham(null, "10","Pen", 0));
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
    ) throws IOException, ServletException{
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
        request.getRequestDispatcher("/views/san_pham/create.jsp")
                .forward(request, response);
    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        SanPham sp = new SanPham(null, ma, ten, trangThai);
        this.ds.add(sp);

        request.setAttribute("data", sp);
        request.setAttribute("ds", ds);

        request.getRequestDispatcher("/views/san_pham/index.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham c = this.ds.get(i);
            if (c.getMa().equals(ma)) {
                request.setAttribute("sp", c);
            }
        }
        request.getRequestDispatcher("/views/san_pham/edit.jsp")
                .forward(request, response);


    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
       SanPham sp = new SanPham(null, ma, ten, trangThai);

        for (int i = 0; i < this.ds.size(); i++) {
            SanPham c = this.ds.get(i);
            if (c.getMa().equals(sp.getMa())) {
                this.ds.set(i, sp);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/san_pham/index");
    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        request.setAttribute("ds", spRepo.findAll());
        request.getRequestDispatcher("/views/san_pham/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham c = this.ds.get(i);
            if (c.getMa().equals(ma)) {
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/san_pham/index");
    }
}
