package com.sparta.deep01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    // login 페이지
    @GetMapping("/login")
    public String loginPage() {
        return "redirect:/login-form.html";
    }

    // login 처리
    @PostMapping("/login")
    public String login(String id, String password, Model model) {

        if (id.equals(password)) {
            model.addAttribute("loginId", id);
        }

        return "login-result";
    }
}
