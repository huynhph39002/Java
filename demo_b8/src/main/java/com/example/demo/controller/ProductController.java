package com.example.demo.controller;

import com.example.demo.repository.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

   //goi ham repo
    @Autowired
    private ProductRepos rope;

    @GetMapping("/hien-thi-product")
    public String showData(Model model){
        model.addAttribute("lst",rope.findAll());
        return "pro";
    }
}
