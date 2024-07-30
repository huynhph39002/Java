package controller;

import entities.KichThuoc;
import entities.MauSac;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.KichThuocRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/kich_thuoc/index",
        "/kich_thuoc/create",
        "/kich_thuoc/store",
        "/kich_thuoc/edit",
        "/kich_thuoc/update",
        "/kich_thuoc/delete",
})
public class KichThuocServlet extends HttpServlet {
    private List<KichThuoc> ds = new ArrayList<>();
    private KichThuocRepository ktRepo = new KichThuocRepository();

    public KichThuocServlet() {
        ds.add(new KichThuoc(null, "cm", "1", 1));
        ds.add(new KichThuoc(null, "dm", "2", 0));
        ds.add(new KichThuoc(null, "m", "3", 1));
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
        request.getRequestDispatcher("/views/kich_thuoc/create.jsp")
                .forward(request, response);

    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {

        String ten = request.getParameter("ten");
        String ma = request.getParameter("ma");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        KichThuoc kt = new KichThuoc(null, ten, ma, trangThai);
        this.ds.add(kt);

        request.setAttribute("data", kt);
        request.setAttribute("ds", ds);

        request.getRequestDispatcher("/views/kich_thuoc/index.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        for (int i = 0; i < this.ds.size(); i++) {
            KichThuoc c = this.ds.get(i);
            if (c.getMa().equals(ma)) {
                request.setAttribute("kt", c);
            }
        }
        request.getRequestDispatcher("/views/kich_thuoc/edit.jsp")
                .forward(request, response);
    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ten = request.getParameter("ten");
        String ma = request.getParameter("ma");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        KichThuoc kt = new KichThuoc(null, ten, ma, trangThai);

        for (int i = 0; i < this.ds.size(); i++) {
            KichThuoc c = this.ds.get(i);
            if (c.getMa().equals(kt.getMa())) {
                this.ds.set(i, kt);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/kich_thuoc/index");
    }


    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        request.setAttribute("ds", ktRepo.findAll() );
        request.getRequestDispatcher("/views/kich_thuoc/index.jsp")
                .forward(request, response);
    }


    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String ma = request.getParameter("ma");
        for (int i = 0; i < this.ds.size(); i++) {
            KichThuoc c = this.ds.get(i);
            if (c.getMa().equals(ma)) {
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/kich_thuoc/index");
    }
}
