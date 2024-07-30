package com.example.demo.controller;

import com.example.demo.entities.KichThuoc;
import com.example.demo.repositories.KichThuocRepository;

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
@RequestMapping("kich-thuoc")
public class KichThuocController {
    @Autowired
    private KichThuocRepository ktRepo;

    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model)
    {
        PageRequest p = PageRequest.of(pageNo, pageSize);
        String s = "%" + keyword + "%";
        Page<KichThuoc> ds = this.ktRepo.findByTenLike(s, p);
        model.addAttribute("data", ds);
        return "kich_thuoc/index";
    }
//    @GetMapping("index")
//    public String index(
//            Model model,
//            @ModelAttribute("the_kt") KichThuoc kichThuoc,
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "3") int limit
//    ) {
//        List<KichThuoc> ds = this.ktRepo.findAll();
////        model.addAttribute("data", ds);
//        int totalItems = ds.size();
//        int totalPages = (int) Math.ceil((double) totalItems / limit);
//        int start = page * limit;
//        int end = Math.min(start + limit, totalItems);
//        List<KichThuoc> paginatedList = ds.subList(start, end);
//
//        model.addAttribute("data", paginatedList);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("pageSize", limit);
//
//        return "kich_thuoc/index";
//    }

    @GetMapping("create")
    public String create() {
        return "kich_thuoc/create";
    }

    @PostMapping("store")
    public String store(Model model, KichThuoc kichThuoc, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", kichThuoc);
            model.addAttribute("errors", errors);
            return "kich_thuoc/create";
        }
        ktRepo.save(kichThuoc);
        return "redirect:/kich-thuoc/index";
    }


    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.ktRepo.deleteById(id);
        return "redirect:/kich-thuoc/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") KichThuoc kt, Model model) {
        model.addAttribute("data", kt);
        return "kich_thuoc/edit";
    }

    //    @PostMapping("update/{id}")
//    public String update(KichThuoc kt){
//        this.ktRepo.update(kt);
//        return "redirect:/kich-thuoc/index";
//    }
    @PostMapping("update/{id}")
    public String update(KichThuoc kichThuoc, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : bindingResult.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("data", kichThuoc);
            model.addAttribute("errors", errors);
            return "kich_thuoc/edit";
        }
        ktRepo.save(kichThuoc);
        return "redirect:/kich-thuoc/index";
    }

//    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, KichThuoc kt) {
//        KichThuoc search = ktRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data", List.of(search));
//            model.addAttribute("kt", kt);
//        } else {
//            model.addAttribute("kt", kt);
//            model.addAttribute("errorMessage", "Không tìm thấy kich thuoc");
//        }
//        return "kich_thuoc/index";
//    }
}
