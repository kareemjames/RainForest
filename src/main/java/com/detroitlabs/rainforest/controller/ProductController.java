package com.detroitlabs.rainforest.controller;

import com.detroitlabs.rainforest.data.CategoryRepository;
import com.detroitlabs.rainforest.data.ProductRepository;
import com.detroitlabs.rainforest.model.Category;
import com.detroitlabs.rainforest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String displayAllProducts(ModelMap modelMap) {
        List<Product> allProducts = productRepository.getAllProducts();
        modelMap.put("allProducts", allProducts);

        List<Category> allCategories = categoryRepository.returnAllCategories();
        modelMap.put("allCategories", allCategories);

        return "home";
    }

    @RequestMapping("/category/{id}")
    public String productsOfSameCategory(@PathVariable int id, ModelMap modelMap) {
        Product productById = productRepository.findByCategory(id);
        modelMap.put("product", productById);

        return "home";
    }


    @RequestMapping("/product/{name}")
        public String productDetails(@PathVariable String name, ModelMap modelMap) {
            Product product = productRepository.findProductByName(name);
            modelMap.put("product", product);
            return "product-details";
        }


}
