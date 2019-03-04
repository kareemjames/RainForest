package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private static final List<String> photo = Arrays.asList("photo name");


    public static final List<Product> ALL_PRODUCTS = Arrays.asList(
            new Product("name ", 0.0, "mini description",1, photo),
            new Product("name", 0.0, "mini description", 2, photo),
            new Product("name", 0.0, "mini description", 3, photo),
            new Product("name", 0.0, "mini description", 4, photo),
            new Product("name", 0.0, "mini description", 5, photo)
    );

    public List<Product> getAllProducts(){
        return ALL_PRODUCTS;
    }

}
