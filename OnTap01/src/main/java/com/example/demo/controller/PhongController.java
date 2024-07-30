package com.example.demo.controller;

import com.example.demo.entity.Phong;
import com.example.demo.repos.LoaiPhongRepos;
import com.example.demo.repos.PhongRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhongController {
private int loadid;
    @Autowired
    private PhongRepos pRepos;

    @Autowired
    private LoaiPhongRepos lpRepos;

    @GetMapping("/hien-thi")
    public String show(Model model){
        model.addAttribute("lp",lpRepos.findAll());
        model.addAttribute("list",pRepos.findAll());
        return "hienthi";
    }
    @PostMapping("/add")
    public String add(Phong p){
        pRepos.save(p);
        return "redirect:/hien-thi";
    }
    @GetMapping("/delete/{id}")
    public String dele(@PathVariable Integer id){
        pRepos.delete(pRepos.findById(id).get());
        return "redirect:/hien-thi";
    }
    @GetMapping("/view-update/{id}")
    public String viewU(@PathVariable Integer id,Model model){
        loadid=id;
        model.addAttribute("lp",lpRepos.findAll());
        model.addAttribute("list",pRepos.findAll());
        model.addAttribute("l",pRepos.findById(id).get());
        return "viewUpdate";
    }
    @PostMapping("/update")
    public String up(Phong p){
        p.setId(loadid);
        pRepos.save(p);
        return "redirect:/hien-thi";
    }
}
