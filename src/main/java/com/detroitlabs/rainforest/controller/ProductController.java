package com.detroitlabs.rainforest.controller;

import com.detroitlabs.rainforest.data.ProductRepository;
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

    @RequestMapping("/")
    public String displayAllProducts(ModelMap modelMap) {
        List<Product> allProducts = productRepository.getAllProducts();
        modelMap.put("allProducts", allProducts);
        return "home";
    }

    @RequestMapping("/product/{name}")
        public String productDetails(@PathVariable String name, ModelMap modelMap) {
            Product product = productRepository.findByName(name);
            modelMap.put("product", product);
            return "product-details";
        }
}
