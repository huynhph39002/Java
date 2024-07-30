package controllers;

import entitys.SanPham;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositones.SanPhamRep;

import java.io.IOException;
import java.util.List;

@WebServlet("/san-pham/index")
public class SanPhamServlet extends HttpServlet {
     SanPhamRep spRep=new SanPhamRep();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SanPham> s=spRep.findAll();
        req.setAttribute("s",s);
        req.getRequestDispatcher("/views/sp/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
