package codegym.vn.controller;

import codegym.vn.entity.Product;
import codegym.vn.repository.CategoryRepository;
import codegym.vn.repository.ProductRepository;
import codegym.vn.service.CategoryService;
import codegym.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OrderBy;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/list";
    }


    @GetMapping("/search")
    public String showSearch(Model model,
                             @RequestParam("product_name") String name) {
        model.addAttribute("products", productService.findAllByName(name));
        return "product/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "product/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("product") Product product) {
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.create(product);
        return "redirect:/product/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(Model model,
                             @PathVariable("id") int id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "product/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.update(product);
        return "redirect:/product/list";
    }




    @GetMapping("/list_paging")
    public String showListPaging(Model model,
                                 @RequestParam(name = "page", defaultValue = "1", required = false) int pageNumber,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.by(Sort.Direction.DESC, "price"));
        Page<Product> products = productService.findAllAndPaging(pageable);
        int totalPage = products.getTotalPages();
        List<Integer> pageNumbers = new ArrayList<>();
        for (int i = 0; i < totalPage; i++) {
            pageNumbers.add(i + 1);
        }

        model.addAttribute("products", products);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageNumbers", pageNumbers);

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
