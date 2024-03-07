package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/accessdenied")
    public String denied() {
        return "denied";
    }
}
