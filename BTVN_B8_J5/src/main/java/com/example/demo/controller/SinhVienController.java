package com.example.demo.controller;

import com.example.demo.entity.SinhVien;
import com.example.demo.repos.SinhVienRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienController {
    //goi ham repo
    @Autowired
    private SinhVienRepos repo;

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        model.addAttribute("list",repo.findAll());
        model.addAttribute("action", "/add");
        return "a";
    }

    @PostMapping("/add")
    public String add(SinhVien s){
        repo.save(s);
        return "redirect:/hien-thi";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("id") Long id){
        repo.deleteById(id);
        return "redirect:/hien-thi";
    }

    @GetMapping("/view-update")
    public String viewUpdate(Model model,@RequestParam("id") Long id){
        model.addAttribute("s",repo.getById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(SinhVien s){
        repo.save(s);
        return "redirect:/hien-thi";
    }

}
