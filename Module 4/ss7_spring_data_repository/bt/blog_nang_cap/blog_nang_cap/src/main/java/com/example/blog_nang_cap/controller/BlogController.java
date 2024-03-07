package com.example.blog_nang_cap.controller;
import com.example.blog_nang_cap.entity.Blog;
import com.example.blog_nang_cap.entity.Category;
import com.example.blog_nang_cap.service.BlogService;
import com.example.blog_nang_cap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
@RequestMapping("/view")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String display(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "view/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryService.findAll());
        return "view/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute Blog blog) {
        blogService.create(blog);
        return "redirect:/view/list";
    }

    @GetMapping("/update")
    public String showFormUpdate(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "view/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute Blog blog) {
        blogService.update(blog);
        return "redirect:/view/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        blogService.deleteById(id);
        return "redirect:/view/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view/view";
    }

    @GetMapping("/list_paging")
    public String listPaging(@PageableDefault(value = 2) Pageable pageable, Model model) {
        Page<Blog> blogPage = blogService.findAll(pageable);
        model.addAttribute("blogList", blogPage);
        return "/view/list_paging";
    }
    @GetMapping("/sort")
    public String sort(Model model){
        List<Blog> blogList=blogService.ascDate();
        model.addAttribute("blogList",blogList);
        return "/view/list";
    }
    @GetMapping("/title")
    public String title(@RequestParam(value = "title") String title,Model model){
        List<Blog> blogList=blogService.title(title);
        model.addAttribute("blogList",blogList);
        return "/view/list";

    }
    @GetMapping("/create-category")
    public String addCategory(Model model){
        model.addAttribute("category",new Category());
        return "view/category/create";
    }
    @GetMapping("/category/list")
    public String listCategory(Model model){
        model.addAttribute("categoryList",categoryService.findAll());
        return "view/category/list";
    }
    @PostMapping("/create-category")
    public String createCategory(@ModelAttribute(name = "category") Category category,Model model){
        categoryService.create(category);
        return "redirect:/view/category/list";
    }
    @GetMapping("/category/remove")
    public String removeCategory(@RequestParam(value = "id") int id){
        categoryService.deleteById(id);
        return "redirect:/view/category/list";
    }
}
