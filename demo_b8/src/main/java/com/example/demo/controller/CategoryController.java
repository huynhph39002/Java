package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    //goi ham repo
    @Autowired
    private CategoryRepos repo;

    @GetMapping("/hien-thi")
    public String hienThiDanhSach(Model model) {
        model.addAttribute("list", repo.findAll());

        // add hoac update => save
        //repo.save(thuc the);

        // xoa
        // C1:  repo.delete(thuc the);
        // C2:  repo.deleteById(khoa chinh);

        //detail
        //Category cate=repo.findById(khoa chinh).get();
        return "a";
    }

//    phan trang : page -> import domain

}
