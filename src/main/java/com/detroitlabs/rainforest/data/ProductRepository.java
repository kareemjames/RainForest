package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private static final List<String> tag1 = Arrays.asList("tag1");
    private static final List<String> tag2 = Arrays.asList("tag2");
    private static final List<String> tag3 = Arrays.asList("tag3");


    public static final List<Product> ALL_PRODUCTS = Arrays.asList(
            new Product(),
            new Product(),
            new Product(),
            new Product(),
            new Product()
    );
}
