package org.example.controller;

import org.example.entity.Calculate;
import org.example.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RequestMapping("/cal")
public class CalculateController {
    private CalculateService calculateService;
    @Autowired
    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/cal/index/USD")
    public String USD(@RequestParam(value = "value1",defaultValue = "0") float value,Model model) {
        model.addAttribute("result1", calculateService.USD(value));
        return "cal/index";
    }
    @GetMapping("/cal/index/VND")
    public String VND(@RequestParam(value = "value2",defaultValue = "0") float value,Model model) {
        model.addAttribute("result2", calculateService.VND(value));
        return "cal/index";
    }
}
