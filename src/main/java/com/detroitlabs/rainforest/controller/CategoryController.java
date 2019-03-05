package com.detroitlabs.rainforest.controller;

import com.detroitlabs.rainforest.data.CategoryRepository;
import com.detroitlabs.rainforest.data.ProductRepository;
import com.detroitlabs.rainforest.model.Category;
import com.detroitlabs.rainforest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class CategoryController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;



}
