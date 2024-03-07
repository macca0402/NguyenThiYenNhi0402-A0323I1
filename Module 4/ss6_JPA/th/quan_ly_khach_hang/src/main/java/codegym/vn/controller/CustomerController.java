package codegym.vn.controller;

import codegym.vn.entity.Customer;
import codegym.vn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "/create";
    }


    @GetMapping("/update")
    public String update(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/update";
    }

    @PostMapping("/update-customer")
    public String update(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:/list";
    }

    @GetMapping("findAll")
    public String findAll(@PageableDefault(value = 5)Pageable pageable,Model model){
        Page<Customer> customerPage=customerService.findAll(pageable);
        model.addAttribute("customerList",customerPage);
        return "/list";
    }
}
