package controllers;

import entity.SanPham;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.SanPhamRepo;


import java.io.IOException;
import java.util.List;

@WebServlet({"/index","/create"})

public class SanPhamServlet extends HttpServlet {
    private SanPhamRepo spRep=new SanPhamRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      if(req.getRequestURI().contains("create")){
          req.getRequestDispatcher("/views/sp/create.jsp").forward(req,resp);
      }else{
        List<SanPham> ds=spRep.findAll();
        req.setAttribute("ds",ds);
        req.getRequestDispatcher("/views/sp/index.jsp").forward(req,resp);
    }}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String ma=req.getParameter("ma");
        String ten=req.getParameter("ten");
        String tg=req.getParameter("trangThai");
        int trangThai=Integer.parseInt(tg);
        SanPham s=new SanPham(null,ma,ten,trangThai);
        this.spRep.create(s);
//        req.getRequestDispatcher("/views/sp/create.jsp").forward(req,resp);
    }
}
