package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private static final List<String> beaniePhotos = Arrays.asList("beanie1","beanie2","beanie3");
    private static final List<String> headlampPhotos = Arrays.asList("headlamp1", "headlamp2", "headlamp3");
    private static final List<String> magicmousePhotos = Arrays.asList("magicmouse1", "magicmouse2","magicmouse3");
    private static final List<String> notebookPhotos = Arrays.asList("notebook1", "notebook2", "notebook3");
    private static final List<String> tabletPhotos = Arrays.asList("tablet1", "tablet2", "tablet3");

    public static final List<Product> ALL_PRODUCTS = Arrays.asList(
            new Product("beanie1", 15.00, "carhart beanie",1, beaniePhotos),
            new Product("headlamp1", 50.00, "vehicle headlamp", 2, headlampPhotos),
            new Product("magicmouse1", 75.00, "magic mouse for computer", 3, magicmousePhotos),
            new Product("notebook1", 20.00, "moleskine notebook", 4, notebookPhotos),
            new Product("tablet1", 70.00, "electronic drawing tablet", 5, tabletPhotos)
    );

    public List<Product> getAllProducts(){
        return ALL_PRODUCTS;
    }

}
