package com.example.demo.Controller;

import com.example.demo.Enty.NhanVien;
import com.example.demo.Repository.DangNhaprepo;
import com.example.demo.Repository.NhanVienReois;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


@Controller
public class NhanVienController {
@Autowired
    DangNhaprepo repo;
@Autowired
    NhanVienReois nvRepos;
    @GetMapping("/nhan-vien/index")
    public String nhanvienhienthi(Model model){
       model.addAttribute("listNV" ,nvRepos.findAll());
        return "nhan_vien/index";
    }
    @PostMapping("/addNV")
    public String addNV(NhanVien nv, @RequestParam("ngaySinh") String ngaySinhString){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinh;
        try {
            ngaySinh = sdf.parse(ngaySinhString);
        } catch (ParseException e) {
            // Xử lý lỗi khi không thể chuyển đổi chuỗi ngày tháng
            e.printStackTrace();
            // Trả về hoặc chuyển hướng tới một trang lỗi
            return "error";
        }
        nv.setNgaySinh(ngaySinh);
        nvRepos.save(nv);
        return "redirect:/nhan-vien/index";
    }


    @GetMapping("/deleteNV/{id}")
    public String deleteNV(@PathVariable Integer id ){
        nvRepos.delete((nvRepos.findById(id).get()));
        return "redirect:/nhan-vien/index";
    }
}
