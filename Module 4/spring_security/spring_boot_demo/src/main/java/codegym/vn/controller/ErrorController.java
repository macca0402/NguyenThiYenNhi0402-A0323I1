package codegym.vn.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(Exception.class)
    public String error(Exception e, Model model) {
        model.addAttribute("errorMessage", "Error Controller : " + e.getMessage());
        return "product/error";
    }
}
