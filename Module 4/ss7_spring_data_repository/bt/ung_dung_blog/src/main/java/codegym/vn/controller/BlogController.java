package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public String display(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    ;

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, Model model) {
        blogService.save(blog);
        model.addAttribute("blogList", blogService.findAll());
        return "/list";
    }

    @GetMapping("/update")
    public String updateForm(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        blogService.remove(id);
        return "redirect:/list";
    }
    @GetMapping("/view")
    public String inf(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/view";
    }
}
