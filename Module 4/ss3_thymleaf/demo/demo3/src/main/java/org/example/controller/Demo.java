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
import java.util.List;
@Controller
public class Demo {
    @Autowired
    private StudentService studentService;
    @RequestMapping("demo")
    public ModelAndView modelAndView(){
        ModelAndView model=new ModelAndView("demo");
        List<Student> list=studentService.getAll();
        model.addObject("studentList",list);
        return model;
    }
   @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("student",new Student());
        return "/create";
   }
   @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        studentService.add(student);
        redirectAttributes.addFlashAttribute("message","Them moi thanh cong");
        return "redirect:/demo";
   }

}
