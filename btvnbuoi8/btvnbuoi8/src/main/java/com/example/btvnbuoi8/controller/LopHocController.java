package com.example.btvnbuoi8.controller;

import com.example.btvnbuoi8.entity.LopHoc;
import com.example.btvnbuoi8.repository.LopHocRepository;
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
public class LopHocController {
    @Autowired
    private LopHocRepository lopHocRepository;

    @GetMapping("hien-thi")
    public String hienThi(Model mol,@RequestParam(value = "page", defaultValue = "0") Integer page) {
        mol.addAttribute("lstLH", getAllLopHoc(page, mol));
        mol.addAttribute("action", "/add");
        return "lop-hoc";
    }

    @PostMapping("/add")
    public String add(LopHoc lh) {
        lopHocRepository.save(lh);
        return "redirect:/hien-thi";
    }

    @GetMapping("/update/{ma}")
    public String viewUpdate(Model mol, @PathVariable("ma") Long ma) {
        mol.addAttribute("lh1", lopHocRepository.getById(ma));
        mol.addAttribute("lstLH", getAllLopHoc(0,mol));
        mol.addAttribute("action", "/update");
        return "lop-hoc";
    }

    @PostMapping("/update")
    public String update(LopHoc lh) {
        lopHocRepository.save(lh);
        return "redirect:/hien-thi";
    }

    @GetMapping("/xoa/{ma}")
    public String xoa(@PathVariable Long ma) {
        lopHocRepository.deleteById(ma);
        return "redirect:/hien-thi";
    }

    @PostMapping("/search")
    public String search(@RequestParam(value = "timTenLop", required = false) String ten,
                         @RequestParam(value = "timDiaDiemLop", required = false) String diaDiem,
                         Model mol) {
        String timTen = "%" + ten + "%";
        String timDiaChi = "%" + diaDiem + "%";
        mol.addAttribute("action", "/add");
        if (ten.trim().isEmpty() && diaDiem.trim().isEmpty()) {
            mol.addAttribute("lstLH", lopHocRepository.findAll());
        } else {
            mol.addAttribute("lstLH", lopHocRepository.getByKeyWord(timTen, timDiaChi));
        }
        return "lop-hoc";
    }

    private List<LopHoc> getAllLopHoc(Integer page, Model mol) {
        int pagesize = 5;
        Pageable pageable = PageRequest.of(page, pagesize);
        Page<LopHoc> lopHocPage = lopHocRepository.findAll(pageable);
        mol.addAttribute("numpage", lopHocPage.getTotalPages());
        return lopHocPage.getContent();
    }
}
