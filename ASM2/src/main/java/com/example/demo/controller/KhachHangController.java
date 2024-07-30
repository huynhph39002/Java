package com.example.demo.controller;


import com.example.demo.entities.KhachHang;
import com.example.demo.repositories.KhachHangRepository;

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
@RequestMapping("khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangRepository khRepo;


  @GetMapping("index")

  public String index(
          @RequestParam(name = "page", defaultValue = "1") int pageNo,
          @RequestParam(name = "limit", defaultValue = "10") int pageSize,
          @RequestParam(name = "keyword", defaultValue = "") String keyword,
          Model model)
  {
      PageRequest p = PageRequest.of(pageNo,pageSize);
      String s = "%" + keyword +"%";
      Page<KhachHang> ds = this.khRepo.findByTenLike(s,p);
      model.addAttribute("data", ds);
      return "khach_hang/index";
  }

    @GetMapping("create")
    public String create() {
        return "khach_hang/create";
    }

    @PostMapping("store")
    public String store(Model model, KhachHang khachHang, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", khachHang);
            model.addAttribute("errors", errors);
            return "khach_hang/create";
        }
        khRepo.save(khachHang);
        return "redirect:/khach-hang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.khRepo.deleteById(id);
        return "redirect:/khach-hang/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") KhachHang kh, Model model) {

        model.addAttribute("data", kh);
        return "khach_hang/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(KhachHang khachHang)
//    {
//        this.khRepo.update(khachHang);
//        return "redirect:/khach-hang/index";
//    }
    @PostMapping("update/{id}")
    public String update(KhachHang khachHang, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", khachHang);
            model.addAttribute("errors", errors);
            return "khach_hang/edit";
        }
        khRepo.save(khachHang);
        return "redirect:/khach-hang/index";
    }
//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, KhachHang kh) {
//        KhachHang search = khRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("kh", kh);
//        } else {
//            model.addAttribute("kh", kh);
//            model.addAttribute("errorMessage", "Không tìm thấy khach hang");
//        }
//        return "khach_hang/index";
//    }
}
