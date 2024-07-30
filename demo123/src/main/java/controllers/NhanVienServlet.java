package controllers;

import entitys.NhanVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositones.NhanVienRep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/nhan-vien/index")
public class NhanVienServlet extends HttpServlet {
    private NhanVienRep nvRep=new NhanVienRep();
//    List<NhanVien> ds=new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<NhanVien> ds=nvRep.findAll();
        request.setAttribute("ds",ds);
        request.getRequestDispatcher("/views/nv/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
