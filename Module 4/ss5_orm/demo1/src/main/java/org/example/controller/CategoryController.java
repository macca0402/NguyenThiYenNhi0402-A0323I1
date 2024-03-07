package org.example.controller;

import org.example.entity.Category;
import org.example.entity.Product;
import org.example.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/list")
    public String listCategory(Model model){
        model.addAttribute("list",categoryRepository.findAll());
        return "category/list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("category",new Category());
        return "category/create";
    }
    @PostMapping("/create")
    public String createCategory(Model model, @ModelAttribute("category") Category category){
        categoryRepository.create(category);
        model.addAttribute("list",categoryRepository.findAll());
        return "category/list";
    }
}
