package codegym.vn.repository.controller;

import codegym.vn.entity.Product;
import codegym.vn.service.CategoryService;
import codegym.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "product/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute Product product) {
        productService.create(product);
        return "redirect:/product/list";
    }

    @GetMapping("/list")
    public String display(Model model) {
        model.addAttribute("list", productService.findAll());
        return "product/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "search") String name, Model model) {
        model.addAttribute("list", productService.findAllByName(name));
        return "product/list";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdate(Model model, @PathVariable(value = "id") int id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        model.addAttribute("categories", categoryService.findAll());
        return "product/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute Product product) {
        productService.update(product);
        return "redirect:/product/list";
    }

    @GetMapping("/view")
    public String showView(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product/view";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam(value = "delete") int id) {
        productService.deleteById(id);
        return "redirect:/product/list";
    }

    @GetMapping("/list_paging")
    public String showListPaging(
            Model model,
            @RequestParam(name = "page", defaultValue = "1", required = false) int pageNumber,
            @RequestParam(name = "pageSize",required = false,defaultValue = "5") int pageSize )
    {
        Pageable pageable= PageRequest.of(pageNumber-1,pageSize, Sort.by(Sort.Direction.DESC,"price"));
        Page<Product> products=productService.findAllAndPaging(pageable);
        int totalPage=products.getTotalPages();
        List<Integer> pageNumbers=new ArrayList<>();
        for(int i=0;i<totalPage;i++){
            pageNumbers.add(i+1);
        }
        model.addAttribute("products",products);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("pageNumbers",pageNumbers);

        return "product/list_paging";
    }

    @GetMapping("/list_slice")
    public String showListPagingSlice(Model model, @RequestParam(name = "page", defaultValue = "1", required = false) int pageNumber,
                                      @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Sort.Direction.DESC, "price"));
        Slice<Product> products = productService.findAllSlice(pageable);
        model.addAttribute("products", products);
        model.addAttribute("pageSize", pageSize);

        return "product/list_slice";
    }
}
