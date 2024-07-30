package com.example.demo.controller;

import com.example.demo.entity.MauSac;
import com.example.demo.repos.MauSacRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MauSacController {

    @Autowired
    private MauSacRepos msPepos;

    @GetMapping("/mau-sac/index")
    public String showData(Model model){
        model.addAttribute("list",msPepos.findAll());
        return "mau_sac/index";
    }
    @PostMapping("/add")
    public String add(MauSac ms){
        msPepos.save(ms);
        return "redirect:/mau-sac/index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id ){
        msPepos.delete((msPepos.findById(id).get()));
        return "redirect:/mau-sac/index";
    }
}
