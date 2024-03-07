package com.example.demo.codegym.vn.api;

import com.example.demo.codegym.vn.entity.Product;
import com.example.demo.codegym.vn.service.CategoryService;
import com.example.demo.codegym.vn.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api/v1/product")
public class ProductRestController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResponseEntity<List<Product>> getList(){
        List<Product> productList=productService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<Product>> showSearch(
            Model model,
            @RequestParam("product_name") String name){
        List<Product> products=productService.findAllByName(name);
        return new ResponseEntity<>(products,HttpStatus.OK);
    }
}
