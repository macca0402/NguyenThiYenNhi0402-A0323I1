package com.example.adding_cart.controller;

import com.example.adding_cart.entity.Cart;
import com.example.adding_cart.entity.Product;
import com.example.adding_cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }

    @GetMapping("/list")
    public String showListProduct(Model model){
        model.addAttribute("listProduct",productService.findAll());
        return "Product/list";
    }
    @GetMapping("/add-to-cart/{id}")
    public String addToCart(@PathVariable("id") int id, Model model,@ModelAttribute("cart")Cart cart) {
        Product product=productService.findById(id);
        cart.addProduct(product);
        return "redirect:/cart/list-demo";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model,@ModelAttribute("cart")Cart cart) {
Product product=productService.findById(id);
model.addAttribute("product",product);
        return "Product/detail";
    }
    @GetMapping("")
    public String demo(Model model){
        model.addAttribute("listProduct",productService.findAll());
        return "Product/demo_list";
    }

}
