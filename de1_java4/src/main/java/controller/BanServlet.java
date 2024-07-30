package controller;

import entitys.Ban;
import jakarta.servlet.annotation.WebServlet;
import org.apache.commons.beanutils.BeanUtils;
import repo.BanRepo;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet({"/ban/hienThi",
             "/ban/add",
             "/ban/store",
             "/ban/detail",
             "/ban/chiTiet",
             "/ban/delete",})
public class BanServlet extends HttpServlet {
    private BanRepo bR=new BanRepo();
  private   List<Ban> lst=new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uri=request.getRequestURI();
        if(uri.contains("add")){
            this.add(request, response);
        } else if(uri.contains("chiTiet")){
            this.detail(request,response);
        }else if(uri.contains("delete")){
            this.delete(request,response);
        }else{
            this.hienThi(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri=request.getRequestURI();
        if(uri.contains("store")){
            this.store(request,response);
        }else if(uri.contains("detail")){
            this.detail(request,response);
        }else{

        }
    }

    public void hienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("lst",bR.findAll());
    request.getRequestDispatcher("/views/index.jsp").forward(request,response);

    }
    public void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    Ban bb=new Ban();
//    try {
//        BeanUtils.populate(bb,request.getParameterMap());
//
//    }catch (Exception e){
//        e.printStackTrace();
//    }

        String mas=request.getParameter("ma");
        String tens=request.getParameter("ten");
        Date ngaySinh=new Date();
        String soThichh=request.getParameter("soThich");
        String gioiTinhh=request.getParameter("gioiTinh");
        String idmqh=request.getParameter("idMQH");
        String tss=request.getParameter("trangThai");

        int gioiTinh=Integer.parseInt(gioiTinhh);
        int idMQH=Integer.parseInt(idmqh);
        int trangThai = Integer.parseInt(tss);
        Ban bb=new Ban(null,mas,tens,ngaySinh,soThichh,gioiTinh,idMQH,trangThai);
    this.bR.add(bb);
    request.setAttribute("data", bb);
    request.setAttribute("lst", lst);
    response.sendRedirect("/de1_java4_war_exploded/ban/hienThi");
    }


    public void add(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.getRequestDispatcher("/views/add.jsp").forward(request,response);

    }
    public void delete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String ids=request.getParameter("id");
            int id=Integer.parseInt(ids);
            Ban b=this.bR.findByid(id);
            this.bR.delete(b);
            response.sendRedirect("/de1_java4_war_exploded/ban/hienThi");

    }
    public void chiTiet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ids=request.getParameter("id");
        int id=Integer.parseInt(ids);
        request.setAttribute("b",bR.findByid(id));
        request.getRequestDispatcher("/views/chiTiet.jsp").forward(request,response);

    }
    public void detail(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ids=request.getParameter("id");
        String mas=request.getParameter("ma");
        String tens=request.getParameter("ten");
        Date ngaySinh=new Date();
        String soThichh=request.getParameter("soThich");
        String gioiTinhh=request.getParameter("gioiTinh");
        String idmqh=request.getParameter("idMQH");
        String tss=request.getParameter("trangThai");
        int id=Integer.parseInt(ids);
        int gioiTinh=Integer.parseInt(gioiTinhh);
        int idMQH=Integer.parseInt(idmqh);
        int trangThai = Integer.parseInt(tss);
        Ban bb=new Ban(id,mas,tens,ngaySinh,soThichh,gioiTinh,idMQH,trangThai);
        this.bR.detail(bb);
         response.sendRedirect("/de1_java4_war_exploded/ban/hienThi");
    }


}
