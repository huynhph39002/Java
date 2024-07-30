package com.example.demo.controller;

import com.example.demo.entities.HoaDon;
import com.example.demo.repositories.HoaDonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("hoa-don")
public class HoaDonController {

    @Autowired
    private HoaDonRepository hdRepo;

    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model)
    {
        PageRequest p = PageRequest.of(pageNo, pageSize);
//        String s = "%" + keyword + "%";
//        Page<HoaDon> ds = this.hdRepo.findByTenLike(s, p);

        model.addAttribute("data", this.hdRepo.findAllWithPropName());
        return "hoa_don/index";
    }

    @GetMapping("create")
    public String create() {
        return "hoa_don/create";
    }

    //    @PostMapping("store")
//    public String store(SanPham sanPham) {
//        this.spRepo.create(sanPham);
//        return "redirect:/san-pham/index";
//    }
//    @PostMapping("store")
//    public String store(Model model, @Valid HoaDon hoaDon, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            Map<String, String> errors = new HashMap<>();
//            for (FieldError e : bindingResult.getFieldErrors()) {
//                errors.put(e.getField(), e.getDefaultMessage());
//            }
//            model.addAttribute("data", hoaDon);
//            model.addAttribute("errors", errors);
//            return "hoa_don/create";
//        }
//        hdRepo.create(hoaDon);
//        return "redirect:/hoa-don/index";
//    }


//    //query string
//    @GetMapping("delete/{id}")
//    public String delete(@PathVariable("id") Integer id) {
//        this.hdRepo.deleteById(id);
//        return "redirect:/hoa-don/index";
//    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") HoaDon hd, Model model) {

        model.addAttribute("data", hd);
        return "hoa_don/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(SanPham sanPham)
//    {
//        this.spRepo.update(sanPham);
//        return "redirect:/san-pham/index";
//    }
    @PostMapping("update/{id}")
    public String update(HoaDon hoaDon, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", hoaDon);
            model.addAttribute("errors", errors);
            return "hoa_don/edit";
        }
        hdRepo.save(hoaDon);
        return "redirect:/hoa-don/index";
    }
//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, HoaDon hd) {
//        HoaDon search = hdRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("hd", hd);
//        } else {
//            model.addAttribute("hd", hd);
//            model.addAttribute("errorMessage", "Không tìm thấy hoa don");
//        }
//        return "hoa_don/index";
//    }
}
