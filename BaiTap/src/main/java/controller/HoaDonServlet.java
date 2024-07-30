package controller;

import entities.HoaDon;
import entities.MauSac;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.HoaDonRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/hoa_don/create",
        "/hoa_don/store",
        "/hoa_don/edit",
        "/hoa_don/update",
        "/hoa_don/index",
        "/hoa_don/delete",
})
public class HoaDonServlet extends HttpServlet {
    private HoaDonRepository hdRepo = new HoaDonRepository();
    private List<HoaDon> ds = new ArrayList<HoaDon>();

    public HoaDonServlet(){
        ds.add(new HoaDon("1", 1,1,"01-03-2014",0));
        ds.add(new HoaDon("2", 2,3,"01-03-2014",1));
        ds.add(new HoaDon("3", 3,5,"01-03-2014",0));

    }

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response

    ) throws IOException, ServletException{
        String uri = request.getRequestURI();
        if(uri.contains("create")){
            this.create(request, response);
        }else if(uri.contains("edit")){
            this.edit(request, response);
        }else if(uri.contains("delete")){
            this.delete(request, response);
        }else{
            this.index(request, response);
        }

    }

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String uri = request.getRequestURI();
        if(uri.contains("store")){
            this.store(request, response);
        }else if(uri.contains("update")){
            this.update(request, response);
        }else{
            //
        }
    }

    public void create(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        request.setAttribute("ds",ds);
        request.getRequestDispatcher("/views/hoa_don/create.jsp")
                .forward(request, response);
    }

    public void store(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String id = request.getParameter("id");

        String idNV = request.getParameter("idNhanVien");
        int idNhanVien = Integer.parseInt(idNV);
        String idKH = request.getParameter("idKhachHang");
        int idKhachHang = Integer.parseInt(idKH);
        String ngayMuaHang = request.getParameter("ngayMuaHang");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        HoaDon hd = new HoaDon(id, idNhanVien, idKhachHang, ngayMuaHang, trangThai);
        this.ds.add(hd);

        request.setAttribute("data", hd);
        request.setAttribute("ds", ds);

        request.getRequestDispatcher("/views/hoa_don/index.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String id = request.getParameter("id");
        for (int i = 0; i < this.ds.size(); i++) {
            HoaDon c = this.ds.get(i);
            if (c.getId().equals(id)) {
                request.setAttribute("hd", c);
            }
        }
        request.getRequestDispatcher("/views/hoa_don/edit.jsp")
                .forward(request, response);
    }

    public void update(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String id = request.getParameter("id");

        String idNV = request.getParameter("idNhanVien");
        int idNhanVien = Integer.parseInt(idNV);
        String idKH = request.getParameter("idKhachHang");
        int idKhachHang = Integer.parseInt(idKH);
        String ngayMuaHang = request.getParameter("ngayMuaHang");
        String ttS = request.getParameter("trangThai");
        int trangThai = Integer.parseInt(ttS);
        HoaDon hd = new HoaDon(id, idNhanVien, idKhachHang, ngayMuaHang, trangThai);

        for (int i = 0; i < this.ds.size(); i++) {
            HoaDon c = this.ds.get(i);
            if (c.getId().equals(hd.getId())) {
                this.ds.set(i, hd);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/hoa_don/index");
    }

    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        request.setAttribute("ds",hdRepo.findAll());
        request.getRequestDispatcher("/views/hoa_don/index.jsp")
                .forward(request, response);
    }

    public void delete(
            HttpServletRequest request,
            HttpServletResponse response
    )throws IOException, ServletException{
        String id = request.getParameter("id");

        for (int i = 0; i < this.ds.size(); i++) {
            HoaDon c = this.ds.get(i);
            if (c.getId().equals(id)) {
                this.ds.remove(i);
            }
        }
        response.sendRedirect("/BTVN_war_exploded/hoa_don/index");
    }


}
