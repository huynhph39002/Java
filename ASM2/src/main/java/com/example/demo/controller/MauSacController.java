package com.example.demo.controller;


import com.example.demo.entities.MauSac;
import com.example.demo.repositories.MauSacRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {
    @Autowired
    private MauSacRepository msRepo;

    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model)
    {
        PageRequest p = PageRequest.of(pageNo, pageSize);
        String s = "%" + keyword + "%";
        Page<MauSac> ds = this.msRepo.findByTenLike(s, p);
        model.addAttribute("data", ds);
        return "mau_sac/index";
    }

//    @GetMapping("index")
//    public String index(
//            Model model,
//            @ModelAttribute("the_mau") MauSac m,
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "15") int limit
//    ) {
//        List<MauSac> ds = this.msRepo.findAll();
////        model.addAttribute("data", ds);
//        int totalItems = ds.size();
//        int totalPages = (int) Math.ceil((double) totalItems / limit);
//        int start = page * limit;
//        int end = Math.min(start + limit, totalItems);
//        List<MauSac> paginatedList = ds.subList(start, end);
//
//        model.addAttribute("data", paginatedList);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("pageSize", limit);
//
//        return "mau_sac/index";
//    }


    @GetMapping("create")
    public String create() {
        return "mau_sac/create";
    }

    //    @PostMapping("store")
//    public String store(MauSac mauSac)
//    {
//        this.msRepo.create(mauSac);
//        return "redirect:/mau-sac/index";
//    }
    @PostMapping("store")
    public String store(Model model, MauSac mauSac, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", mauSac);
            model.addAttribute("errors", errors);
            return "mau_sac/create";
        }
        msRepo.save(mauSac);
        return "redirect:/mau-sac/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.msRepo.deleteById(id);
        return "redirect:/mau-sac/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") MauSac mauSac, Model model) {

        model.addAttribute("data", mauSac);
        return "mau_sac/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(MauSac mauSac) {
//        this.msRepo.update(mauSac);
//        return "redirect:/mau-sac/index";
//    }
    @PostMapping("update/{id}")
    public String update(MauSac mauSac, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", mauSac);
            model.addAttribute("errors", errors);
            return "mau_sac/edit";
        }
        msRepo.save(mauSac);
        return "redirect:/mau-sac/index";
    }
//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, MauSac ms) {
//        MauSac search = msRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("ms", ms);
//        } else {
//            model.addAttribute("ms", ms);
//            model.addAttribute("errorMessage", "Không tìm thấy mau sac");
//        }
//        return "mau_sac/index";
//    }
}
