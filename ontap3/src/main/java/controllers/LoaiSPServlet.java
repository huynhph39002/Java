package controllers;

import entitys.LoaiSP;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import repo.LoaiSPRepo;

import java.io.IOException;
import java.lang.management.LockInfo;
import java.util.ArrayList;
import java.util.List;

@WebServlet({
        "/index",
        "/create",
        "/store",
        "/delete",
})
public class LoaiSPServlet extends HttpServlet {
    private LoaiSPRepo lrepo=new LoaiSPRepo();
    List<LoaiSP> lst=new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri=request.getRequestURI();
        if (uri.contains("create")){
            this.create(request,response);
        }else if (uri.contains("delete")){
            this.delete(request,response);
        }else{
            this.index(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri=request.getRequestURI();
        if (uri.contains("store")){
            this.store(request,response);
        }else{

        }

    }
    protected void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    request.getRequestDispatcher("/views/create.jsp").forward(request,response);
    }
    protected void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("lst",this.lrepo.findAll());
        request.getRequestDispatcher("/views/index.jsp").forward(request,response);

    }
    protected void store(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String maa=request.getParameter("ma");
        String tee=request.getParameter("ten");
        LoaiSP l=new LoaiSP(null,maa,tee);
        this.lrepo.create(l);
        request.setAttribute("data",l);
        request.setAttribute("lst",lst);
        response.sendRedirect("/ontap3_war_exploded/index");
    }
    protected void delete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String ids=request.getParameter("id");
            int id=Integer.parseInt(ids);
            LoaiSP l=this.lrepo.findById(id);
            this.lrepo.delete(l);
            response.sendRedirect("/ontap3_war_exploded/index");
    }
}
