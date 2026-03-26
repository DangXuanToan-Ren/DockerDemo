package com.example.dangxuantoan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Đặng Xuân Toàn - đã test CI/CD thành công");
        return "index";
    }
}


