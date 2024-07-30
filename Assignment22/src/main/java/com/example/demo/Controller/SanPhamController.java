package com.example.demo.Controller;

import com.example.demo.Repository.SanPhamRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SanPhamController {
    @Autowired
    private SanPhamRepos spRepis;

    @GetMapping("/san-pham/index")
    public String show(Model model){
        model.addAttribute("list",spRepis.findAll());
        return "Home";
    }

}
