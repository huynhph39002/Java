package com.example.demo.Controller;

import com.example.demo.entity.KhachHang;
import com.example.demo.Repository.KhachHangRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangRepos khRepos;
    @GetMapping("/khach-hang/index")
    public String show(Model model){
        model.addAttribute("listKH",khRepos.findAll());
        return "khach_hang/index";
    }

    @PostMapping("/addKH")
    public String addkh(KhachHang kh){
        khRepos.save(kh);
        return "redirect:/khach-hang/index";
    }
    @GetMapping("/deleteKH/{id}")
    public String delete(@PathVariable Integer id ){
        khRepos.delete((khRepos.findById(id).get()));
        return "redirect:/khach-hang/index";
    }
}
