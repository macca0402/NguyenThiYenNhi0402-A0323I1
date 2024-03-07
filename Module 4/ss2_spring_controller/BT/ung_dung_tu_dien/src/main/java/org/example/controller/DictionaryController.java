package org.example.controller;

import org.example.service.DicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller

public class DictionaryController {
    @Autowired
    private DicService dicService;



    @GetMapping("/")
    public String result(Model model, @RequestParam(value = "search",defaultValue = "")String word){
        model.addAttribute("result",dicService.result(word));
        return "dictionary/result";
    }
}
