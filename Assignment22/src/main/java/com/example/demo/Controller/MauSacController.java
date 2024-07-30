package com.example.demo.Controller;


import com.example.demo.Enty.MauSac;
import com.example.demo.Repository.MauSacRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MauSacController {

    @Autowired
    private MauSacRepos msPepos;

    @GetMapping("/mau-sac/index")
    public String showData(Model model,@RequestParam(value = "page", defaultValue = "0") Integer page){
        model.addAttribute("listMS",getAllMauSac(page,model));
        model.addAttribute("action","/addMS");
        return "mau_sac/index";
    }
    @PostMapping("/addMS")
    public String add(MauSac ms){
        msPepos.save(ms);
        return "redirect:/mau-sac/index";
    }
    @GetMapping("/mau-sac/viewU")
    public String viewU(Model mol, @PathVariable("id") Integer id) {
        mol.addAttribute("lh1", msPepos.getById(id));
        mol.addAttribute("listMS", getAllMauSac(0, mol));
        mol.addAttribute("action", "/update");
        return "mau_sac/index";
    }
    @PostMapping("/mau-sac/update")
    public String upsateMS( MauSac ms){
        msPepos.save(ms);
        return "redirect:/mau-sac/index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id ){
        msPepos.delete((msPepos.findById(id).get()));
        return "redirect:/mau-sac/index";
    }

    private List<MauSac> getAllMauSac(Integer page, Model mol) {
        int pagesize = 5;
        Pageable pageable = PageRequest.of(page, pagesize);
        Page<MauSac> MauSacPage = msPepos.findAll(pageable);
        mol.addAttribute("numpage", MauSacPage.getTotalPages());
        return MauSacPage.getContent();
    }
}
