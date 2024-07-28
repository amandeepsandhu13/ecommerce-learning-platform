package com.ecommerce.ecom.service;

import com.ecommerce.ecom.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAllCategories();
    void createCategory(Category category);
}
