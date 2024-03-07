package com.example.adding_cart.controller;


import com.example.adding_cart.entity.Cart;
import com.example.adding_cart.entity.Product;
import com.example.adding_cart.service.ProductService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Cart setUpCart() {
        return new Cart();
    }

//    @GetMapping("/list")
//    public String listCart(Model model, @SessionAttribute("cart") Cart cart) {
//        model.addAttribute("cart", cart);
//        return "Cart/listCart";
//    }
    @GetMapping("/list-demo")
    public String cart(Model model, @SessionAttribute("cart") Cart cart){
        model.addAttribute("cart", cart);
        return "Cart/listCartDemo";
    }


    @GetMapping("/pum")
    public String payment(@RequestParam("product") int[] id, Model model, @SessionAttribute("cart") Cart cart) {
        int sum = 0;

        for (int i : id) {
            Product product = productService.findById(i);
            sum = sum + (product.getPrice() * cart.selectItems(product).getValue());
        }
        model.addAttribute("cart", cart);
        model.addAttribute("result", sum);
        return  "Cart/listCartDemo";
    }
    @GetMapping("updateUp/{id}")
    public String increase(Model model, @SessionAttribute("cart") Cart cart,@PathVariable("id") int id){
        int quantity=cart.selectItems(productService.findById(id)).getValue()+1;
        cart.selectItems(productService.findById(id)).setValue(quantity);
        return "redirect:/cart/list-demo";

    }
    @GetMapping("updateDown/{id}")
    public String decrease(Model model, @SessionAttribute("cart") Cart cart,@PathVariable("id") int id){
        int quantity=cart.selectItems(productService.findById(id)).getValue()-1;
        if(quantity<0){
            cart.selectItems(productService.findById(id)).setValue(0);
            return "redirect:/cart/list-demo";
        }
        cart.selectItems(productService.findById(id)).setValue(quantity);
        return "redirect:/cart/list-demo";
    }
    @GetMapping("/delete")
    public String deleteCart(@RequestParam("id") int key,@SessionAttribute("cart") Cart cart){
        cart.deleteItems(key);
        return "redirect:/cart/list-demo";


    }

}

