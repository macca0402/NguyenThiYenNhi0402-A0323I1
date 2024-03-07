package com.example.demo.codegym.vn.controller;

import com.example.demo.codegym.vn.entity.User;
import com.example.demo.codegym.vn.service.UserService;
import com.example.demo.codegym.vn.utils.UserUtils;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserUtils utils;

    @GetMapping("/login")
    public String showLogin(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        if (user != null) {
            return "redirect:/product/list";
        }
        return "login/index";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          Model model,
                          HttpSession session
    ) {
        User user = userService.getUserByUserName(username);
        if (user == null || !utils.checkPassword(user.getPassword(), password))
        {
            model.addAttribute("message", "User không tồn tại hoặc sai password ");
            return "login/index";
        }
        session.setAttribute("user", user);
        return "redirect:/product/list";
    }

    @GetMapping("/authorize")
    public String authorize() {
        return "login/403";
    }
}
