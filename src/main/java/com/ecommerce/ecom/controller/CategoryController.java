package com.ecommerce.ecom.controller;

import com.ecommerce.ecom.model.Category;
import com.ecommerce.ecom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/public/categories")
    public List<Category> getCategoryList() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/admin/addCategory")
    public String addCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "Category added successfully";
    }

}
