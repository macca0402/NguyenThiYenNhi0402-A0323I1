package org.example.controller;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.example.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @Autowired
    private CalculateService calculateService;
    @GetMapping("/calculate")
    public String calculate(@RequestParam(value = "number1",defaultValue = "0") double number1,
                                @RequestParam(value = "number2",defaultValue = "0") double number2,
                                @RequestParam(value = "action",defaultValue = "") String action,
                                Model model){
        switch (action){
            case "+":
                model.addAttribute("result",calculateService.addition(number1,number2));
                break;
            case "-":
                model.addAttribute("result",calculateService.subtraction(number1,number2));
                break;
            case "*":
                model.addAttribute("result",calculateService.multiplication(number1,number2));
                break;
            case "/":
                model.addAttribute("result",calculateService.division(number1,number2));
                break;
            default:
                model.addAttribute("result","khong tim thay ket qua");

        }
        return "/calculate";
    }
}
