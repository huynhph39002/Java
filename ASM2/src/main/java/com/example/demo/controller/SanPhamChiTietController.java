package com.example.demo.controller;


import com.example.demo.entities.*;
import com.example.demo.repositories.KichThuocRepository;
import com.example.demo.repositories.MauSacRepository;
import com.example.demo.repositories.SanPhamRepository;
import com.example.demo.repositories.SpctRepository;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("spct")
public class SanPhamChiTietController {
    @Autowired
    private SpctRepository spctRepo;
    private final SanPhamRepository sanPhamRepository;
    private final KichThuocRepository kichThuocRepository;
    private final MauSacRepository mauSacRepository;

    public SanPhamChiTietController(SanPhamRepository sanPhamRepository, KichThuocRepository kichThuocRepository, MauSacRepository mauSacRepository) {
        this.sanPhamRepository = sanPhamRepository;
        this.kichThuocRepository = kichThuocRepository;
        this.mauSacRepository = mauSacRepository;
    }

//    @GetMapping("index")
//    public String index(
//            @RequestParam(name = "page", defaultValue = "1") int pageNo,
//            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
//            @RequestParam(name = "id", defaultValue = "0") int id,
//            Model model) {
//        PageRequest p = PageRequest.of(pageNo - 1, pageSize); // PageRequest starts at 0
//        Page<SanPhamCT> ds;
//
//        if (id != 0) {
//            ds = this.spctRepo.findById(id, p);
//        } else {
//            ds = this.spctRepo.findAll(p); // if no id provided, fetch all with pagination
//        }
//
//        model.addAttribute("data", ds.getContent()); // Thêm nội dung của trang vào model
//        model.addAttribute("page", ds); // Thêm đối tượng Page cho thông tin phân trang
//        return "spct/index";
//    }

    @GetMapping("index")
    public String index(
            @RequestParam(name = "page", defaultValue = "1") int pageNo,
            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            Model model) {
        // Tạo đối tượng Pageable để phân trang
        PageRequest pageRequest = PageRequest.of(pageNo - 1, pageSize);
        String searchKeyword = "%" + keyword + "%";
        model.addAttribute("data", this.spctRepo.findAllWithPropName2(searchKeyword));
        return "spct/index";
    }


//    @GetMapping("index")
//    public String index(
//            Model model,
//            @ModelAttribute("data") SanPhamCT spct,
//            @RequestParam(name = "spId", defaultValue = "-1") int spId,
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "3") int limit
//    ) {
//        //SP
//        List<SanPham> dsSP = this.spRepo.findAll();
//        model.addAttribute("data_sp", dsSP);
//
//        //Mau
//        List<MauSac> dsMau = this.msRepo.findAll();
//        model.addAttribute("data_mau", dsMau);
//
//        //KT
//        List<KichThuoc> dsKT = this.ktRepo.findAll();
//        model.addAttribute("data_kt", dsKT);
//
//        //SPCT
//        List<SanPhamCT> dsSPCT = spId == -1 ? this.spctRepo.findAll() : this.spctRepo.findBySPId(spId);
////        model.addAttribute("data_SPCT", dsSPCT);
//
//        int totalItems = dsSPCT.size();
//        int totalPages = (int) Math.ceil((double) totalItems / limit);
//        int start = page * limit;
//        int end = Math.min(start + limit, totalItems);
//        List<SanPhamCT> paginatedList = dsSPCT.subList(start, end);
//
//        model.addAttribute("data_SPCT", paginatedList);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("pageSize", limit);
//
//        return "spct/index";
//    }

//    @PostMapping("store")
//    public String store(Model model, @Valid SanPhamCT spct, BindingResult validResult,
//                        @RequestParam(name = "spId", defaultValue = "-1") int spId,
//                        @RequestParam(defaultValue = "0") int page,
//                        @RequestParam(defaultValue = "3") int limit
//    ) {
//        if (validResult.hasErrors()) {
//            List<FieldError> listError = validResult.getFieldErrors();
//            Map<String, String> errors = new HashMap<>();
//            for (FieldError fe : listError) {
//                errors.put(fe.getField(), fe.getDefaultMessage());
//            }
//            model.addAttribute("errors", errors);
//            model.addAttribute("the_spct", spct);
//
//            //SP
//            List<SanPham> dsSP = this.spRepo.findAll();
//            model.addAttribute("data_sp", dsSP);
//
//            //Mau
//            List<MauSac> dsMau = this.msRepo.findAll();
//            model.addAttribute("data_mau", dsMau);
//
//            //KT
//            List<KichThuoc> dsKT = this.ktRepo.findAll();
//            model.addAttribute("data_kt", dsKT);
//
//            //SPCT
//            List<SanPhamCT> dsSPCT = spId == -1 ? this.spctRepo.findAll() : this.spctRepo.findBySPId(spId);
////        model.addAttribute("data_SPCT", dsSPCT);
//
//            int totalItems = dsSPCT.size();
//            int totalPages = (int) Math.ceil((double) totalItems / limit);
//            int start = page * limit;
//            int end = Math.min(start + limit, totalItems);
//            List<SanPhamCT> paginatedList = dsSPCT.subList(start, end);
//
//            model.addAttribute("data_SPCT", paginatedList);
//            model.addAttribute("totalPages", totalPages);
//            model.addAttribute("currentPage", page);
//            model.addAttribute("pageSize", limit);
//
//            return "spct/index";
//        }
//        this.spctRepo.create(spct);
//        return "redirect:/spct/index";
//    }
//
//    @PostMapping("update/{id}")
//    public String update(
//            Model model,
//            @Valid SanPhamCT spct,
//            BindingResult validResult,
//            @RequestParam(name = "spId", defaultValue = "-1") int spId,
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "3") int limit
//    ) {
//        if (validResult.hasErrors()) {
//            List<FieldError> listError = validResult.getFieldErrors();
//            Map<String, String> errors = new HashMap<>();
//            for (FieldError fe : listError) {
//                errors.put(fe.getField(), fe.getDefaultMessage());
//            }
//            model.addAttribute("errors", errors);
//            model.addAttribute("the_spct", spct);
//
//            //SP
//            List<SanPham> dsSP = this.spRepo.findAll();
//            model.addAttribute("data_sp", dsSP);
//
//            //Mau
//            List<MauSac> dsMau = this.msRepo.findAll();
//            model.addAttribute("data_mau", dsMau);
//
//            //KT
//            List<KichThuoc> dsKT = this.ktRepo.findAll();
//            model.addAttribute("data_kt", dsKT);
//
//            //SPCT
//            List<SanPhamCT> dsSPCT = spId == -1 ? this.spctRepo.findAll() : this.spctRepo.findBySPId(spId);
////            model.addAttribute("data_SPCT", dsSPCT);
//
//            int totalItems = dsSPCT.size();
//            int totalPages = (int) Math.ceil((double) totalItems / limit);
//            int start = page * limit;
//            int end = Math.min(start + limit, totalItems);
//            List<SanPhamCT> paginatedList = dsSPCT.subList(start, end);
//
//            model.addAttribute("data_SPCT", paginatedList);
//            model.addAttribute("totalPages", totalPages);
//            model.addAttribute("currentPage", page);
//            model.addAttribute("pageSize", limit);
//
//            return "spct/index";
//        }
//        this.spctRepo.update(spct);
//        return "redirect:/spct/index";
//    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.spctRepo.deleteById(id);
        return "redirect:/spct/index";
    }


    //    @GetMapping("/search")
//    public String search(@RequestParam("id") int id, Model model, SanPhamCT s) {
//        SanPhamCT search = spctRepo.findById(id);
//        if (search != null) {
//            model.addAttribute("data_SPCT", List.of(search));
//            model.addAttribute("s", s);
//        } else {
//            model.addAttribute("s", s);
//            model.addAttribute("errorMessage", "Không tìm thấy sản phẩm chi tiết");
//        }
//        return "spct/index";
//    }
//

//    @GetMapping("index")
//    public String index(
//            @RequestParam(name = "page", defaultValue = "1") int pageNo,
//            @RequestParam(name = "limit", defaultValue = "10") int pageSize,
//            @RequestParam(name = "keyword", defaultValue = "") String keyword,
//            Model model)
//    {
//        PageRequest p = PageRequest.of(pageNo, pageSize);
//        String s = "%" + keyword + "%";
//        Page<SanPhamCT> ds = this.spctRepo.findByTenSP(s, p);
//        System.out.println(" Dong 237  : " + ds);
//        model.addAttribute("data", ds);
//        return "spct/index";
//    }

    @GetMapping("create")
    public String create(Model model) {
        List<SanPham> product = this.sanPhamRepository.findAll();
        model.addAttribute("product", product);
        List<MauSac> color = this.mauSacRepository.findAll();
        model.addAttribute("color", color);
        List<KichThuoc> size = this.kichThuocRepository.findAll();
        model.addAttribute("size", size);
        return "spct/create";
    }

    @PostMapping("store")
    public String store(Model model, SanPhamCT sanPhamCT){
        List<SanPham> product = this.sanPhamRepository.findAll();
        model.addAttribute("product", product);
        List<MauSac> color = this.mauSacRepository.findAll();
        model.addAttribute("color", color);
        List<KichThuoc> size = this.kichThuocRepository.findAll();
        model.addAttribute("size", size);
        this.spctRepo.save(sanPhamCT);
        return "redirect:/spct/index";
    }
}
