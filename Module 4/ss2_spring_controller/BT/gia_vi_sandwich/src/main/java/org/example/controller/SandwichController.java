package org.example.controller;

import org.example.service.SandwichIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @Autowired
    private SandwichIService service;
    @GetMapping("/list")
    public String listOption(Model model){
        model.addAttribute("list",service.findAll());
        return "sandwich/list";
    }
    @GetMapping("/test")
    public String showTest(@RequestParam(value="choice") String[] value,Model model){

        // các giá trị choice trên thanh url sẽ hiện lên --> nhờ có @requestparam value ="choice" sẽ lấy những cái đc đc chọn
        model.addAttribute("list",service.findAll());
        StringBuilder builder=new StringBuilder();
        boolean flag=true;
        for(int i=0;i<value.length;i++){
            if(flag){
                flag=false;
            } else{
                builder.append(",");
            }
            builder.append(value[i]);
        }
        for(int i=0;i<value.length;i++){
            model.addAttribute("result",builder);
        }
        return "sandwich/list";
    }
}