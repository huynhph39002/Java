package controller;

import entities.MauSac;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.MauSacRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({

        "/mausac/create",
        "/mausac/store",
        "/mausac/edit",
        "/mausac/update",
        "/mausac/index",
        "/mausac/delete",
})
public class MauSacServlet extends HttpServlet {
    private MauSacRepository msRepo = new MauSacRepository();
    private List<MauSac> ds = new ArrayList<MauSac>();

    public MauSacServlet() {
        ds.add(new MauSac(null, "1", "Red", 1));
        ds.add(new MauSac(null, "2", "Green", 0));
        ds.add(new MauSac(null, "3", "Black", 1));
    }

    @Override
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

    @Override
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

        request.getRequestDispatcher("/views/mausac/create.jsp")
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
        MauSac ms = new MauSac(null, ma, ten, trangThai);
        this.msRepo.create(ms);
        System.out.println(ms.getMa());
        System.out.println(ms.getTen());

        request.setAttribute("data", ms);
        request.setAttribute("ds", this.msRepo.findAll());

        request.getRequestDispatcher("/views/mausac/index.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String idS = request.getParameter("id");
        int id = Integer.parseInt(idS);

        request.setAttribute("ms", msRepo.findById(id));
        request.getRequestDispatcher("/views/mausac/edit.jsp")
                .forward(request, response);


    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String idS = request.getParameter("id");
        int id = Integer.parseInt(idS);
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        MauSac ms = new MauSac(id, ma, ten, trangThai);
        this.msRepo.update(ms);

        response.sendRedirect("/BTVN_war_exploded/mausac/index");
    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        request.setAttribute("ds", msRepo.findAll());
        request.getRequestDispatcher("/views/mausac/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        String idS = request.getParameter("id");
        int id = Integer.parseInt(idS);
        MauSac ms = this.msRepo.findById(id);
        this.msRepo.delete(ms);

        response.sendRedirect("/BTVN_war_exploded/mausac/index");
    }
}
