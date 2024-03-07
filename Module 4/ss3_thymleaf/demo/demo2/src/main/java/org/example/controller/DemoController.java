package org.example.controller;

import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private StudentService service;
    @RequestMapping("demo")
    public ModelAndView demo(){
        ModelAndView model= new ModelAndView("demo");
        String name="Hà ú";
        model.addObject("name",name);
        List<Student> list=service.getAll();
        model.addObject("studentList",list);

        return model;
    }
    @GetMapping("/create")
    public String showCreatePage(Model model){
        model.addAttribute("student",new Student());
        return "/create";
    }
    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        service.save(student);
        return "redirect:/demo";
    }


}
