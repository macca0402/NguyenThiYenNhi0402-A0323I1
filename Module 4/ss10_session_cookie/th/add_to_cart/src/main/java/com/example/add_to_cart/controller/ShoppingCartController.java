package com.example.add_to_cart.controller;

import com.example.add_to_cart.entity.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ShoppingCartController {
    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }
    @GetMapping("/shopping-cart")
    public String showCart(@SessionAttribute("cart") Cart cart, Model model){
        model.addAttribute("cart",cart);
        return "/cart";

    }
}
