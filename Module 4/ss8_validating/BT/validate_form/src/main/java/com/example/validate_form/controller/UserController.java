package com.example.validate_form.controller;

import com.example.validate_form.entity.User;
import com.example.validate_form.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private IUserService service;
    @GetMapping("/list")
    public String findAll(Model model){
        model.addAttribute("list",service.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("user",new User());
        return "/create";
    }
    @PostMapping ("/create")
    public String create(Model model, @Validated @ModelAttribute User user, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "/create";
        } else{
            model.addAttribute("result","Khoi tao thanh cong");
            service.create(user);
            return "redirect:/create";
        }

    }
}
