package com.example.demo.Controller;

import com.example.demo.Enty.DangNhapEnTy;
import com.example.demo.Repository.DangNhaprepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DangNhapController {
    @Autowired
    DangNhaprepo dnrepo;

    @GetMapping("/login")
    public String login() {

        return "Login";
    }


    @PostMapping("/loginn")
    public String handleLogin(@RequestParam String ma, @RequestParam String matKhau, Model model , HttpSession session) {
        Boolean user = dnrepo.existsByMaAndMatKhau(ma, matKhau);
        if (user) {
            model.addAttribute("message", "Đăng nhập thành công!");
            session.setAttribute("username",ma);
            return "Home";
        } else {
            model.addAttribute("error", "Ten Dang Nhap Hoac Mat Khau Khong Dung");
            return "Login";
        }
    }
}
