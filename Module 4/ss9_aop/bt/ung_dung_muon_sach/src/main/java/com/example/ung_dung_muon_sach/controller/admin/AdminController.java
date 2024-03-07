package com.example.ung_dung_muon_sach.controller.admin;
import com.example.ung_dung_muon_sach.entity.Book;
import com.example.ung_dung_muon_sach.service.IBookService;
import com.example.ung_dung_muon_sach.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IBookService service;
    @Autowired
    private IBorrowService borrowService;
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("book",new Book());
        return "admin/create";
    }
    @PostMapping("/create")
    public String create(Model model, @ModelAttribute(value = "book") Book book){
        service.create(book);
        model.addAttribute("message","tao thanh cong");
        return "admin/create";
    }
    @GetMapping("/list")
    public String findAll(Model model){
        model.addAttribute("list",service.getAll());
        return "admin/list";
    }
    @GetMapping("/list_borrow_user")
    public String listBorrow(Model model){
        model.addAttribute("borrowList",borrowService.getAll());
        return "admin/list_borrow_user";
    }
}
