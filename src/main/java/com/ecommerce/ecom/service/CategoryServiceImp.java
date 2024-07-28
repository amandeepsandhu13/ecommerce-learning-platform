package com.ecommerce.ecom.service;

import com.ecommerce.ecom.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImp implements CategoryService{

    private List<Category> categoryList = new ArrayList<>();


    @Override
    public List<Category> getAllCategories() {
        return categoryList;
    }

    @Override
    public void createCategory(Category category) {
        categoryList.add(category);
    }
}
