package com.example.demo.controller;

import com.example.demo.entities.SanPham;
import com.example.demo.repositories.SanPhamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
@RequestMapping("san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamRepository spRepo;

    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model)
    {
        PageRequest p = PageRequest.of(pageNo, pageSize);
        String s = "%" + keyword + "%";
        Page<SanPham> ds = this.spRepo.findByTenLike(s, p);
        model.addAttribute("data", ds);
        return "san_pham/index";
    }

//    @GetMapping("index")
//    public String index(
//            Model model,
//            @ModelAttribute("the_sp") SanPham sanPham,
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "3") int limit
//    ) {
//        List<SanPham> ds = this.spRepo.findAll();
////        model.addAttribute("data", ds);
//        int totalItems = ds.size();
//        int totalPages = (int) Math.ceil((double) totalItems / limit);
//        int start = page * limit;
//        int end = Math.min(start + limit, totalItems);
//        List<SanPham> paginatedList = ds.subList(start, end);
//
//        model.addAttribute("data", paginatedList);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("pageSize", limit);
//
//        return "san_pham/index";
//    }

    @GetMapping("create")
    public String create() {
        return "san_pham/create";
    }

    //    @PostMapping("store")
//    public String store(SanPham sanPham) {
//        this.spRepo.create(sanPham);
//        return "redirect:/san-pham/index";
//    }
    @PostMapping("store")
    public String store(Model model, SanPham sp, BindingResult validateResult) {
        if (validateResult.hasErrors()) {
            System.out.println("Errrorr");
            List<FieldError> listFieldError = validateResult.getFieldErrors();
            Map<String, String> errors = new HashMap<>();
            for (FieldError e: listFieldError) {
                errors.put(e.getField(), e.getDefaultMessage());
            }

            model.addAttribute("errors", errors);
            model.addAttribute("data", sp);
            return "san_pham/create";
        }

        this.spRepo.save(sp);
        return "redirect:/san-pham/index";
    }

    //query string
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.spRepo.deleteById(id);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") SanPham sp, Model model) {
        model.addAttribute("data", sp);
        return "san_pham/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(SanPham sanPham)
//    {
//        this.spRepo.update(sanPham);
//        return "redirect:/san-pham/index";
//    }
    @PostMapping("update/{id}")
    public String update(SanPham sanPham, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", sanPham);
            model.addAttribute("errors", errors);
            return "san_pham/edit";
        }
        spRepo.save(sanPham);
        return "redirect:/san-pham/index";
    }

//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, SanPham s) {
//        SanPham search = spRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("s", s);
//        } else {
//            model.addAttribute("s", s);
//            model.addAttribute("errorMessage", "Không tìm thấy sản phẩm");
//        }
//        return "san_pham/index";
//    }
}
