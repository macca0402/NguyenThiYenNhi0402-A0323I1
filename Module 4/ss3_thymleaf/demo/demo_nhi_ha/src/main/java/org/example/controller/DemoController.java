package org.example.controller;

import org.example.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @RequestMapping("demo")
    public ModelAndView demo(){
        ModelAndView modelAndView=new ModelAndView("demo");
        String name="Hà ú ";
        modelAndView.addObject("name",name);
        Customer customer=new Customer(1l,"Codegym Đà Nẵng");
        modelAndView.addObject("cust",customer);
        return modelAndView;
    }
}
