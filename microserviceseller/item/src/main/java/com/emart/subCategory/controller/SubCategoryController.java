package com.emart.subCategory.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emart.category.service.CategoryService;
import com.emart.category.entity.Category;
import com.emart.subCategory.entity.SubCategory;
import com.emart.subCategory.service.SubCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "subCategory")
public class SubCategoryController {
        
    @Autowired
    SubCategoryService subCategoryService;
    
    @Autowired
    CategoryService categoryService;

    @PostMapping(value = "/save")
    public SubCategory saveSubCategory(@RequestBody SubCategory subCategory) {
        return this.subCategoryService.saveSubCategory(subCategory);
    }

    // @GetMapping(value = "/findcategorys")
    // public Map<String,List<Category>> findAllCategory() {
    //     List<Category> categoryList = this.categoryService.findAllCategory();
    //     Map<String,List<Category>> map = new HashMap<>();
    //     if  (categoryList.size() > 0){
    //         map.put("key", categoryList);
    //     }
    //     return map;
    // }

}