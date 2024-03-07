package com.example.thi.controller;

import com.example.thi.entity.DuAn;
import com.example.thi.service.impl.DoanhNghiepService;
import com.example.thi.service.impl.DuAnService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/duAn")
public class DuAnController {
    @Autowired
    private DuAnService duAnService;
    @Autowired
    private DoanhNghiepService doanhNghiepService;
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",duAnService.findAll());
        return "/list";
    }
    @GetMapping("/list_paging")
    public String showListPaging(Model model, @RequestParam(name = "page", defaultValue = "1", required = false) int pageNumber,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Sort.Direction.DESC, "price"));
        Page<DuAn> duAn = duAnService.findAllAndPaging(pageable);
        int totalPage = duAn.getTotalPages();
        List<Integer> pageNumbers = new ArrayList<>();
        for (int i = 0; i < totalPage; i++) {
            pageNumbers.add(i + 1);
        }

        model.addAttribute("list", duAn);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageNumbers", pageNumbers);

        return "/list_paging";
    }
    @GetMapping("/update")
    public String updateForm(){
        return "/update";
    }

    @GetMapping("/detail/{id}")
    public String detailForm(@PathVariable("id") int id,Model model){
        model.addAttribute("duAn",duAnService.findById(id));
        return "/detail";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("duAn", new DuAn());
        model.addAttribute("doanhNghiep", doanhNghiepService.findAll());
        return "/create";
    }
    @PostMapping("/doCreate")
    public String create(@Validated @ModelAttribute DuAn duAn, BindingResult bindingResult){
        System.out.println(duAn.toString());
        if(bindingResult.hasErrors()){
//            model.addAttribute("duAn", new DuAn());
//            model.addAttribute("doanhNghiep", doanhNghiepService.findAll());
            return "/create";
        } else{

            duAnService.create(duAn);
            return "redirect:/duAn/list";
        }

    }
}
