package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public ModelAndView dsiplay() {
        ModelAndView model = new ModelAndView("list");
        List<Product> list = productService.getAll();
        model.addObject("productList", list);
        return model;
    }

    @GetMapping("view")
    public String view(Model model, @RequestParam(value = "code") int id) {
        Product product = productService.view(id);
        model.addAttribute("product", product);
        return "view";
    }

    @GetMapping("edit/{code}")
    public String editForm(Model model, @PathVariable(value = "code") int code) {
        Product product = productService.view(code);
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product, Model model) {
//        List<Product> list =
        productService.edit(product);
//        model.addAttribute("productList", list);
        return "redirect:/list";
    }

    @GetMapping("delete/{code}")
    public String delete(@PathVariable(value = "code") int code, Model model) {
//        List<Product> list=
        productService.delete(code);
//        model.addAttribute("productList",list);
        return "redirect:/list";
    }

    @GetMapping("search")
    public String search(@RequestParam(value = "search") String search, Model model) {
        Product product = productService.search(search);
        if(product!=null){
            model.addAttribute("product", product);
        } else{
            model.addAttribute("message","Khong tim thay");
        }
        return "view";
    }


}
