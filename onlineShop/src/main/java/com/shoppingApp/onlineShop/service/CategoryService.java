package com.shoppingApp.onlineShop.service;

import com.shoppingApp.onlineShop.model.Category;
import com.shoppingApp.onlineShop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public void createCategory(Category category){
        categoryRepository.save(category);
    }

    public List<Category> listCategory(){
        return categoryRepository.findAll();
    }
}