package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Category;
import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProductRepository {

    private static final List<String> beaniePhotos = Arrays.asList("beanie1", "beanie2", "beanie3");
    private static final List<String> headlampPhotos = Arrays.asList("headlamp1", "headlamp2", "headlamp3");
    private static final List<String> magicmousePhotos = Arrays.asList("magicmouse1", "magicmouse2", "magicmouse3");
    private static final List<String> notebookPhotos = Arrays.asList("notebook1", "notebook2", "notebook3");
    private static final List<String> tabletPhotos = Arrays.asList("tablet1", "tablet2", "tablet3");

    public static List<Product> allProducts = Arrays.asList(
            new Product("beanie1", 15.00, "carhart beanie", 1, beaniePhotos, "Comfortable Carhart beanie. Comes in various colors and sizes.",1001),
            new Product("headlamp1", 50.00, "vehicle headlamp", 2, headlampPhotos, "LED headlamp for vehicle. Bright light for all conditions.",1002),
            new Product("magicmouse1", 75.00, "magic mouse for computer", 3, magicmousePhotos, "Magic mouse perfect for your all of your apple products.",1003),
            new Product("notebook1", 20.00, "moleskine notebook", 4, notebookPhotos, "Soft cover notebook with 240 pages. Comes in various colors",1004),
            new Product("tablet1", 70.00, "electronic drawing tablet", 5, tabletPhotos, "Electronic drawing tablet. Compatible with most electronic devices.",1005)
    );

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<Product> newListOfProducts) {
        allProducts = newListOfProducts;
    }


    public Product findProductByName(String name) {
        for (Product product : allProducts) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public String displayFirstPhotoInArray() {
        for (Product product : allProducts) {
            String firstPhoto = product.getPhotos().get(0);
            return firstPhoto;
        }
        return null;
    }


    public List<String> returnAllProductImages(Product product) {

        List<String> photos = product.getPhotos();
        return photos;
    }



    public Product findByCategory(int categoryId) {
        for (Product product: allProducts) {
            if (product.getCategory() == categoryId) {
                return product;
            }

        }return null;
    }


    public String[] splitSearchStringBySpace(String searchValue) {
        String[] words = searchValue.split(" ");
        return words;
    }

    public List<Product> searchForProductsBySearchValue(String[] searchWords) {
        List<Product> foundProducts = new ArrayList<>();

        for (int i = 0; i < searchWords.length; i++) {

            for (Product product : allProducts) {
                if (product.getName().contains(searchWords[i].toLowerCase())) {
                    foundProducts.add(product);
                }
                if (product.getFullDescription().toLowerCase().contains(searchWords[i].toLowerCase())) {
                    foundProducts.add(product);
                }
            }
        }
        HashSet<Product> set = new HashSet<>(foundProducts);
        ArrayList<Product> result = new ArrayList<>(set);

        return sortProductsByName(result);
    }

    public List<Product> sortProductsByName(List<Product> products) {
        Comparator.comparing(Product::getName).thenComparing(Product::getName);
        Collections.sort(products, Comparator.comparing(Product::getName));
        return products;
    }


}
