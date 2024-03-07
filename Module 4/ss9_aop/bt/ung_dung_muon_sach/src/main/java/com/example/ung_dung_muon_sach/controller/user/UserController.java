package com.example.ung_dung_muon_sach.controller.user;

import com.example.ung_dung_muon_sach.entity.Book;
import com.example.ung_dung_muon_sach.entity.Borrow;
import com.example.ung_dung_muon_sach.service.IBookService;
import com.example.ung_dung_muon_sach.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBorrowService borrowService;
    @GetMapping("borrow/list")
    public String listBook(Model model) {
        model.addAttribute("list", bookService.getAll());
        return "user/borrow/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "user/borrow/detail";
    }

    @GetMapping("borrow/borrow")
    public String formBorrow(@ModelAttribute Book book, Model model) {
        model.addAttribute("borrow", new Borrow(book));
        return "user/borrow/borrow";
    }

    @PostMapping("/do_borrow")
    public String doBorrow(@ModelAttribute Borrow borrow,Model model){
        if(borrowService.create(borrow)){
            model.addAttribute("message","Mượn thành công");
            return "user/borrow/borrow";
        }
        model.addAttribute("message","Mượn không thành công");
        return "user/borrow/borrow";
    }
    @GetMapping("/return_book")
    public String returnBookForm(Model model){
        return "user/return_book/searchUser";
    }
    @GetMapping("return_book/do_return_book")
    public String doReturnBook(@RequestParam(value = "codeBorrow") int id,Model model){
        if(borrowService.doReturnBook(id)){
            model.addAttribute("message","Trả thành công");
            return "user/return_book/searchUser";
        }
        model.addAttribute("message","Trả không thành công, không có mã này nhé bạn ơi");
        return "user/return_book/searchUser";

    }

}
