package com.example.btvnbuoi9.Controller;

import com.example.btvnbuoi9.Entity.LoaiPhongBan;
import com.example.btvnbuoi9.Entity.PhongBan;
import com.example.btvnbuoi9.Repository.loaiphongbanRepository;
import com.example.btvnbuoi9.Repository.phongbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PhongbanController {
    private int globalIdpb;
    private int index;
    @Autowired
    private phongbanRepository rpopb;

    @Autowired
    private loaiphongbanRepository rpolpb;

    @GetMapping("/phong-ban")
    public String phongban(Model model){
        model.addAttribute("listcbb",rpolpb.findAll());
        return "hienthi";
    }
    @GetMapping("/phong-ban/hien-thi")
    public String hienthi(Model model,@RequestParam(value = "pageNo",defaultValue = "0") Integer pageNo){
        model.addAttribute("listcbb",rpolpb.findAll());
        model.addAttribute("list",rpopb.findAll());
        int size = rpopb.findAll().size();
        if (size%3 == 0){
            index = size/3;
        }
        else {
            index = size/3 + 1;
        }
        model.addAttribute("pagesize",index);
        Pageable pageable = PageRequest.of(pageNo,3);
        List<PhongBan> pageCate = rpopb.findAll(pageable).getContent();
        model.addAttribute("pagesize",index);
        model.addAttribute("list",pageCate);
        return "hienthi";
    }
    @PostMapping("/phong-ban/them")
    public String them(PhongBan pb){
        rpopb.save(pb);
        return "redirect:/phong-ban/hien-thi";
    }
    @GetMapping("/phong-ban/remove/{id}")
    public String xoa(@PathVariable Integer id ){
        rpopb.delete(rpopb.findById(id).get());
        return "redirect:/phong-ban/hien-thi";
    }
    @GetMapping("/phong-ban/view-update/{id}")
    public String viewupdate(@PathVariable Integer id, Model model){
        globalIdpb = id;
        model.addAttribute("listcbb",rpolpb.findAll());
        model.addAttribute("pb",rpopb.findById(globalIdpb).get());
        return "view-update";
    }
    @PostMapping("/phong-ban/update")
    public String update(PhongBan pb){
        pb.setId(globalIdpb);
        rpopb.save(pb);
        return "redirect:/phong-ban/hien-thi";
    }
}
