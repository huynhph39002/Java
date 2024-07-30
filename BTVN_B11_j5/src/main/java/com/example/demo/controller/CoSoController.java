package com.example.demo.controller;

import com.example.demo.entity.CoSo;
import com.example.demo.repos.CoSoRepos;
import com.example.demo.repos.TaiKhoanNganHangRepos;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CoSoController {
    private int loatID;
@Autowired
    private CoSoRepos csrepos;
@Autowired
    private TaiKhoanNganHangRepos tkrepos;

@GetMapping("/co-so")
    public String coso(Model model){
    model.addAttribute("listtk",tkrepos.findAll());
    return "hienthi";
}

@GetMapping("/co-so/hien-thi")
    public String showData(Model model){
    model.addAttribute("listtk",tkrepos.findAll());
    model.addAttribute("list",csrepos.findAll());
    return "hienthi";
}

@PostMapping("/add")
    public String add(CoSo coSo){
    csrepos.save(coSo);
    return "redirect:/co-so/hien-thi";
}

@GetMapping("/delete/{id}")
    public String dele(@PathVariable Integer id){
    csrepos.delete(csrepos.findById(id).get());
    return "redirect:/co-so/hien-thi";
}

@GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id ,Model model){
    loatID =id;
    model.addAttribute("listtk",tkrepos.findAll());
    model.addAttribute("s",csrepos.findById(id).get());

    return "detail";
}


//    @GetMapping("/detail/{id}")
//    public String detail(@PathVariable Integer id,Model model){
//        loatID=id;
//        model.addAttribute("listcs",tkRepos.findAll());
//        model.addAttribute("s",coSoRepos.findById(id).get());
//        return "detail";
//    }
//    @GetMapping("/view-update/{id}")
//    public String voewUD(@PathVariable Integer id,Model model){
//        loatID=id;
//        model.addAttribute("listcs",tkRepos.findAll());
//        model.addAttribute("s",coSoRepos.findById(id).get());
//        return "view_update";
//    }
//    @PostMapping("/update")
//    public String update(CoSo coSo){
//       coSo.setId(loatID);
//       coSoRepos.save(coSo);
//       return "redirect:/co-so/hien-thi";
//    }



}
