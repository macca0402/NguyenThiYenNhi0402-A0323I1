package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.ILoginService;
import com.example.demo.validate.LoginnValidate;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private ILoginService loginService;
    @Autowired
    private LoginnValidate validate;
    @GetMapping("/list")
    public String findAll(Model model){
        model.addAttribute("list",loginService.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("login",new Login());
        return "/create";
    }
    @PostMapping("/create")
    public String create(@Validated @ModelAttribute(value = "login") Login login,BindingResult bindingResult){
        validate.validate(login,bindingResult);
        if(bindingResult.hasErrors()){
            return "/create";
        }
        loginService.create(login);
        return "redirect:/list";
    }
}
