package com.example.ung_dung_muon_sach.controller.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("")
    public String home(){
        return "home/menu";
    }
    @GetMapping("/menu/admin")
    public String admin(){
        return "home/admin";
    }
    @GetMapping("/menu/reader")
    public String reader(){
        return "home/reader";
    }

}
