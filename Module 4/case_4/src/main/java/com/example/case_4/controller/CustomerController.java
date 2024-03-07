package com.example.case_4.controller;

import com.example.case_4.entity.Customer;
import com.example.case_4.service.impl.CustomerCategoryService;
import com.example.case_4.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerCategoryService customerCategoryService;
    @GetMapping("/list")
    public String listCustomer(Model model){
        model.addAttribute("list",customerService.findAll());

        return "/customer/list";
    }
    @GetMapping("/create")
    public String showFormCustomer(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("categories",customerCategoryService.findAll());
        return"/customer/create";
    }
    @PostMapping("/doCreate")
    public String doCreate(@ModelAttribute("customer")Customer customer,Model model){
        customerService.create(customer);
        model.addAttribute("result","Khởi tạo thành công");
        return "redirect:/customer/list";

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id,Model model){
        customerService.deleteById(id);
        model.addAttribute("result","Khởi tạo thành công");
        return "redirect:/customer/list";
    }
}
