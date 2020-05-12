package com.emart.category.controller;

import com.emart.category.entity.Category;
import com.emart.category.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "category")
public class CategoryController {
        
    @Autowired
    CategoryService categoryService;

    @PostMapping(value = "/save")
    public Category saveBuyer(@RequestBody Category category) {
        return this.categoryService.saveCategory(category);
    }

}