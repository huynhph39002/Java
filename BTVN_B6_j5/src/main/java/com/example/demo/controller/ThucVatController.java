package com.example.demo.controller;

import com.example.demo.entity.ThucVat;
import com.example.demo.service.ThucVatService;
import org.eclipse.tags.shaded.org.apache.bcel.generic.MONITORENTER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ThucVatController {
    private ThucVatService service = new ThucVatService();

    @GetMapping("/thuc-vat/hien-thi-tat-ca")
    public String showData(Model model) {
        model.addAttribute("tv", service.getAll());
        return "thuc-vat";
    }

    @PostMapping("/thuc-vat/add")
    public String addTV(@RequestParam("id") Integer id,
                        @RequestParam("ten") String ten,
                        @RequestParam("loai") String loai,
                        @RequestParam("tuoi") String tuoiS,
                        @RequestParam("khuVuc") String khuVuc,
                        @RequestParam("gioiTinh") Boolean gioiTinh,Model model) {
        Boolean check=true;
        Integer tuoi=null;
        if(id==null){
            model.addAttribute("checkid","id khong duoc trong trong");
            check=false;
        }if (ten.trim().isEmpty()){
            model.addAttribute("checkten","ten khong duoc trong");
            check=false;
        }if (loai.trim().isEmpty()){
            model.addAttribute("checkloai","loai khong duoc trong");
            check=false;
        }
        if (tuoiS.trim().isEmpty()){
            model.addAttribute("checktuoi","tuoi khong duoc trong");
            check=false;
        }else{
            try {
                tuoi=Integer.parseInt(tuoiS);
                if (tuoi<18){
                    model.addAttribute("checktuoi","tuoi phai lon hon 18");
                    check=false;
                }
            }catch (Exception e){

            }

        }if(khuVuc.trim().isEmpty()){
            model.addAttribute("checkkhu","khu vuc khong duoc trong trong");
            check=false;
        }
        if (!check) {
            model.addAttribute("s", new ThucVat(id,ten,loai,tuoi,gioiTinh,khuVuc));
            model.addAttribute("tv",service.getAll());
            return "thuc-vat"; // Assuming this is your form view
        }
        ThucVat tv = new ThucVat(id,ten,loai,tuoi,gioiTinh,khuVuc);
//        tv.setId(id);
//        tv.setTen(ten);
//        tv.setLoai(loai);
//        tv.setTuoi(tuoi);
//        tv.setKhuVuc(khuVuc);
//        tv.setGioiTinh(gioiTinh);
        service.add(tv);
        return "redirect:/thuc-vat/hien-thi-tat-ca";
    }

    @GetMapping("/thuc-vat/remove")
    public String delete(@RequestParam("id") Integer id) {
        service.delete(id);
        return "redirect:/thuc-vat/hien-thi-tat-ca";
    }

    @GetMapping("/thuc-vat/view-update")
    public String viewUpdatee(@RequestParam("id") Integer id, Model model) {
        ThucVat tv = service.detail(id);
        model.addAttribute("s", tv);
        return "update-thuvat";
    }

    @PostMapping("/thuc-vat/update")
    public String updateeee(@RequestParam("id") Integer id,
                            @RequestParam("ten") String ten,
                            @RequestParam("loai") String loai,
                            @RequestParam("tuoi") Integer tuoi,
                            @RequestParam("khuVuc") String khuVuc,
                            @RequestParam("gioiTinh") Boolean gioiTinh) {
        ThucVat t = new ThucVat(id, ten, loai, tuoi, gioiTinh, khuVuc);
        service.update(t);
        return "redirect:/thuc-vat/hien-thi-tat-ca";
    }

    @GetMapping("/thuc-vat/tim-kiem")
    public String searchh(@RequestParam("ten") String ten, Model model) {
        List<ThucVat> t = service.search(ten);
        model.addAttribute("tv", t);
        return"thuc-vat";

    }
}