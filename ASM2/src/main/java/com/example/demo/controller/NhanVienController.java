package com.example.demo.controller;

import com.example.demo.entities.NhanVien;
import com.example.demo.repositories.NhanVienRepository;

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
@RequestMapping("nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienRepository nvRepo;


    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model)
    {
        PageRequest p = PageRequest.of(pageNo, pageSize);
        String s = "%" + keyword + "%";
        Page<NhanVien> ds = this.nvRepo.findByTenLike(s, p);
        model.addAttribute("data", ds);
        return "nhan_vien/index";
    }

    @GetMapping("create")
    public String create() {
        return "nhan_vien/create";
    }

    //    @PostMapping("store")
//    public String store(NhanVien nhanVien)
//    {
//        this.nvRepo.create(nhanVien);
//        return "redirect:/nhan-vien/index";
//    }
    @PostMapping("store")
    public String store(Model model, NhanVien nhanVien, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", nhanVien);
            model.addAttribute("errors", errors);
            return "nhan_vien/create";
        }
        nvRepo.save(nhanVien);
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.nvRepo.deleteById(id);
        return ("redirect:/nhan-vien/index");
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") NhanVien nv, Model model) {

        model.addAttribute("data", nv);
        return "nhan_vien/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(NhanVien nhanVien)
//    {
//        this.nvRepo.update(nhanVien);
//        return "redirect:/nhan-vien/index";
//    }
    @PostMapping("update/{id}")
    public String update(NhanVien nhanVien, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", nhanVien);
            model.addAttribute("errors", errors);
            return "nhan_vien/edit";
        }
        nvRepo.save(nhanVien);
        return "redirect:/nhan-vien/index";
    }
//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, NhanVien nv) {
//        NhanVien search = nvRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("nv", nv);
//        } else {
//            model.addAttribute("nv", nv);
//            model.addAttribute("errorMessage", "Không tìm thấy nhan vien");
//        }
//        return "nhan_vien/index";
//    }
}
