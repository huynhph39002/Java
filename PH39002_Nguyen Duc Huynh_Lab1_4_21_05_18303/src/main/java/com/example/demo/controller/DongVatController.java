package com.example.demo.controller;

import com.example.demo.entity.DongVat;
import com.example.demo.service.DongVatService;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DongVatController {
private DongVatService service=new DongVatService();
    @GetMapping("/dong-vat/hien-thi-tat-ca")
    public String showData(Model model){
        model.addAttribute("dv",service.getAll());
        return "dongvats";
    }

    @GetMapping("/dong-vat/remove")
    public String xoa(@RequestParam("ma") String ma){
        service.remove(ma);
        return "redirect:/dong-vat/hien-thi-tat-ca";
    }
   @PostMapping("/dong-vat/add")
    public String add(DongVat dv){
        service.add(dv);
        return "redirect:/dong-vat/hien-thi-tat-ca";
   }

}
