package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private static final List<String> beaniePhotos = Arrays.asList("beanie1","beanie2","beanie3");
    private static final List<String> headlampPhotos = Arrays.asList("headlamp1", "headlamp2", "headlamp3");
    private static final List<String> magicmousePhotos = Arrays.asList("magicmouse1", "magicmouse2","magicmouse3");
    private static final List<String> notebookPhotos = Arrays.asList("notebook1", "notebook2", "notebook3");
    private static final List<String> tabletPhotos = Arrays.asList("tablet1", "tablet2", "tablet3");

    public static List<Product> allProducts = Arrays.asList(
            new Product("beanie1", 15.00, "carhart beanie",1, beaniePhotos, "Comfortable Carhart beanie. Comes in various colors and sizes."),
            new Product("headlamp1", 50.00, "vehicle headlamp", 2, headlampPhotos, "LED headlamp for vehicle. Bright light for all conditions."),
            new Product("magicmouse1", 75.00, "magic mouse for computer", 3, magicmousePhotos,"Magic mouse perfect for your all of your apple products."),
            new Product("notebook1", 20.00, "moleskine notebook", 4, notebookPhotos, "Soft cover notebook with 240 pages. Comes in various colors"),
            new Product("tablet1", 70.00, "electronic drawing tablet", 5, tabletPhotos, "Electronic drawing tablet. Compatible with most electronic devices.")
    );

    public List<Product> getAllProducts(){
        return allProducts;
    }

    public void setAllProducts(List<Product> newListOfProducts) {
        allProducts = newListOfProducts;
    }


    public Product findProductByName(String name) {
        for(Product product: allProducts) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public String displayFirstPhotoInArray(){
        for(Product product : allProducts){
            product.getPhotos().indexOf(0);
        }
        return null;
    }


    public Product returnAllProductImages(){
        for(Product product : allProducts){
            product.getPhotos();
        }
        return null;
    }


}
