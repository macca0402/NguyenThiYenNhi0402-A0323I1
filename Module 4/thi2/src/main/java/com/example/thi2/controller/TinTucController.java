package com.example.thi2.controller;


import com.example.thi2.entity.TinTuc;
import com.example.thi2.service.IDanhMucService;
import com.example.thi2.service.ITinTucService;
import com.example.thi2.service.impl.DanhMucService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class TinTucController {
    @Autowired
    private IDanhMucService danhMucService;
    @Autowired
    private ITinTucService tinTucService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", tinTucService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("tinTuc", new TinTuc());
        model.addAttribute("danhMuc", danhMucService.findAll());
        return "/create";
    }

    @PostMapping("/doCreate")
    public String create(@Valid @ModelAttribute TinTuc tinTuc, BindingResult bindingResult) {
//        System.out.println(duAn.toString());
        if (bindingResult.hasErrors()) {
//            model.addAttribute("tinTuc", new TinTuc());
//            model.addAttribute("danhMuc", danhMucService.findAll());
            return "/create";
        } else {
            tinTucService.create(tinTuc);
            return "redirect:/list";
        }

    }


    @GetMapping("/detail/{id}")
    public String detailForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("tinTuc", tinTucService.findById(id));
        return "/detail";
    }

    @GetMapping("/searchtieude")
    public String searchTieuDe(@RequestParam("tieuDe") String tieuDe, Model model) {
        model.addAttribute("list", tinTucService.findAllByName(tieuDe));
        return "/list";
    }

    @GetMapping("/searchdanhmuc")
    public String searchDanhMuc(@RequestParam("danhMuc") String danhMuc, Model model) {
        model.addAttribute("list", tinTucService.findAllByDanhMuc(danhMuc));
        return "/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteList(@PathVariable("id") int id, Model model) {
        tinTucService.deleteById(id);
        return "redirect:/list";
    }



    @GetMapping("/list2")
    public String list2(){
        return "/list2";
    }
//    @GetMapping("/list_paging")
//    public String showListPaging(Model model, @RequestParam(name = "page", defaultValue = "1", required = false) int pageNumber,
//                                 @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
//        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Sort.Direction.DESC, "price"));
//        Page<DuAn> duAn = duAnService.findAllAndPaging(pageable);
//        int totalPage = duAn.getTotalPages();
//        List<Integer> pageNumbers = new ArrayList<>();
//        for (int i = 0; i < totalPage; i++) {
//            pageNumbers.add(i + 1);
//        }
//
//        model.addAttribute("list", duAn);
//        model.addAttribute("pageSize", pageSize);
//        model.addAttribute("pageNumbers", pageNumbers);
//
//        return "/list_paging";
//    }
//    @GetMapping("/update")
//    public String updateForm(){
//        return "/update";
//    }
//


}
