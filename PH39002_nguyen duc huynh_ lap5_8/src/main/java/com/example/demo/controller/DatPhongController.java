package com.example.demo.controller;

import com.example.demo.repos.DatPhongRepos;
import com.example.demo.repos.KhachHangRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DatPhongController {

    private int loadId;

    @Autowired
    private DatPhongRepos dprepos;

    @Autowired
    private KhachHangRepos khrepos;

    @GetMapping("/dat-phong/hien-thi")
    public String showData(Model model){
        model.addAttribute("listkh",khrepos.findAll());
        model.addAttribute("list",dprepos.findAll());
        return "hienthi";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        dprepos.delete((dprepos.findById(id).get()));
        return "redirect:/dat-phong/hien-thi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id,Model model){
        loadId=id;
        model.addAttribute("listkh",khrepos.findAll());
        model.addAttribute("t",dprepos.findById(id).get());
        return "view";
    }
}
