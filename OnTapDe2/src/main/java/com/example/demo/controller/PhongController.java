package com.example.demo.controller;

import com.example.demo.entity.Phong;
import com.example.demo.repos.LoaiPhongRepos;
import com.example.demo.repos.PhongRepos;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhongController {
    private int loadId;
    @Autowired
    private LoaiPhongRepos lprepos;

    @Autowired
    private PhongRepos prepos;

    @GetMapping("/hien-thi")
    public String showData(Model model) {
        model.addAttribute("listLoai", lprepos.findAll());
        model.addAttribute("list", prepos.findAll());
        return "hienthi";
    }

    @PostMapping("/add")
    public String add(Phong p) {
        prepos.save(p);
        return "redirect:/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id, Model model) {
    loadId=id;
    model.addAttribute("listLoai",lprepos.findAll());
    model.addAttribute("ll",prepos.findById(id).get());
        model.addAttribute("list", prepos.findAll());
    return "hienthi";

    }
    @GetMapping("/delete/{id}")
    public String dele(@PathVariable Integer id){
        prepos.delete(prepos.findById(id).get());
        return "redirect:/hien-thi";
    }
}
