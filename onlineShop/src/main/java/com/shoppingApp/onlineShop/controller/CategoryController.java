package com.shoppingApp.onlineShop.controller;

import com.shoppingApp.onlineShop.model.Category;
import com.shoppingApp.onlineShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/create")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Success";
    }
    @GetMapping("/list")
    public List<Category> listCategory(){
        return categoryService.listCategory();

    }
}
