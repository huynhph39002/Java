package com.example.demo.controller;

import com.example.demo.entities.HoaDonChiTiet;
import com.example.demo.repositories.HdctRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("hdct")
public class HoaDonCTController {
    @Autowired
    private HdctRepository hdctRepo;

    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model)
    {
        PageRequest p = PageRequest.of(pageNo, pageSize);
//        String s = "%" + keyword + "%";
//        Page<SanPham> ds = this.hdctRepo.findByTenLike(s, p);
        List<HoaDonChiTiet> ds = this.hdctRepo.findAll();
        model.addAttribute("data", ds);
        return "hoa_don_chi_tiet/index";
    }

//    @GetMapping("index")
//    public String index(
//            Model model,
//            @ModelAttribute("the_hdct") HoaDonCT hoaDonCT,
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "3") int limit
//    ) {
//        List<HoaDonCT> ds = this.hdctRepo.findAll();
////        model.addAttribute("data", ds);
//        int totalItems = ds.size();
//        int totalPages = (int) Math.ceil((double) totalItems / limit);
//        int start = page * limit;
//        int end = Math.min(start + limit, totalItems);
//        List<HoaDonCT> paginatedList = ds.subList(start, end);
//
//        model.addAttribute("data", paginatedList);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("pageSize", limit);
//
//        return "hoa_don_chi_tiet/index";
//    }

    @GetMapping("create")
    public String create() {
        return "hoa_don_chi_tiet/create";
    }

    //    @PostMapping("store")
//    public String store(SanPham sanPham) {
//        this.spRepo.create(sanPham);
//        return "redirect:/san-pham/index";
//    }
//    @PostMapping("store")
//    public String store(Model model, @Valid HoaDonCT hoaDonChiTiet, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            Map<String, String> errors = new HashMap<>();
//            for (FieldError e : bindingResult.getFieldErrors()) {
//                errors.put(e.getField(), e.getDefaultMessage());
//            }
//            model.addAttribute("data", hoaDonChiTiet);
//            model.addAttribute("errors", errors);
//            return "hoa_don_chi_tiet/create";
//        }
//        hdctRepo.create(hoaDonChiTiet);
//        return "redirect:/hoa-don-chi-tiet/index";
//    }


//    //query string
//    @GetMapping("delete/{id}")
//    public String delete(@PathVariable("id") Integer id) {
//        this.hdctRepo.deleteById(id);
//        return "redirect:/hoa-don-chi-tiet/index";
//    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") HoaDonChiTiet hdct, Model model) {

        model.addAttribute("data", hdct);
        return "hoa_don_chi_tiet/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(SanPham sanPham)
//    {
//        this.spRepo.update(sanPham);
//        return "redirect:/san-pham/index";
//    }
    @PostMapping("update/{id}")
    public String update(HoaDonChiTiet hoaDonChiTiet, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", hoaDonChiTiet);
            model.addAttribute("errors", errors);
            return "hoa_don_chi_tiet/edit";
        }
        hdctRepo.save(hoaDonChiTiet);
        return "redirect:/hoa-don-chi-tiet/index";
    }
//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, HoaDonCT hdct) {
//        HoaDonCT search = hdctRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("hdct", hdct);
//        } else {
//            model.addAttribute("hdct", hdct);
//            model.addAttribute("errorMessage", "Không tìm thấy HDCT");
//        }
//        return "hoa_don_chi_tiet/index";
//    }
//
}
