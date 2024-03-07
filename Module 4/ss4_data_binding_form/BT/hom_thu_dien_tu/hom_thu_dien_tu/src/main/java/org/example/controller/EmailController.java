package org.example.controller;

import org.example.model.Email;
import org.example.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;
    private static List<String> listLanguage;
    static {
        listLanguage=new ArrayList<>();
        listLanguage.add(new String("English"));
        listLanguage.add(new String("Vietnamese"));
        listLanguage.add(new String("Canada"));
        listLanguage.add(new String("Singapore"));
    }
    private static List<Integer> listSize;
    static {
        listSize=new ArrayList<>();
        listSize.add(new Integer(5));
        listSize.add(new Integer(10));
        listSize.add(new Integer(15));
        listSize.add(new Integer(20));
        listSize.add(new Integer(25));
    }

    @GetMapping("list")
    public String list(Model model){
        model.addAttribute("list",emailService.list());
        return "list";
    }
    @GetMapping("edit/{code}")
    public String showFormEdit(Model model, @PathVariable(value = "code") int code){
        model.addAttribute("email",emailService.displayInfo(code));
        model.addAttribute("listLanguage",listLanguage);
        model.addAttribute("listSize",listSize);
        return "edit";
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute Email email){
     emailService.update(email);
        return "redirect:/list";
    }

}
