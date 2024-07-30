package controllers;

import entitys.KhachHang;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositones.KhachHangRep;

import java.io.IOException;
import java.util.List;

@WebServlet("/khach-hang/index")
public class KhachHangServlet extends HttpServlet {
private KhachHangRep khRep=new KhachHangRep();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<KhachHang> ds=khRep.findAll();
        request.setAttribute("ds",ds);
        request.getRequestDispatcher("/views/kh/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
