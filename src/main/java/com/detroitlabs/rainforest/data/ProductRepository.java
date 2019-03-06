package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Category;
import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProductRepository {

    private static final List<String> beanieReviews = Arrays.asList(
            "\nbeanieman8080:\n This is the most comfortable beanie I own, and I own alot of beanies!\n",
            "hatwoman2980:\n Buy this beanie, you wont be disappointed!\n",
            "Brian N.:\n I dont like showing the top of my head, so this hat was a great addition to my collection!\n");
    private static final List<String> headlampReviews = Arrays.asList(
            "\ncarguy23:\n These LED lamps cut through thick fog and plenty of other weather conditions.These were a great buy.\n",
            "Lucy F. :\n I can see great when driving, but feel bad for the person in front of me, these are real blinders!\n",
            "John Y. :\n You can find better options elsewhere, these are not worth the money.\n");
    private static final List<String> magicmouseReviews = Arrays.asList(
            "\nGary R. :\n Way cheaper than the apple store.\n",
            "Gerald598746:\n My just came today and was broken. Will be contacting customer service for a replacment!\n",
            "Sue H. : \n This mouse looks soo cool on my brnad new Ikea desk. I feel like a true millennial now!\n");
    private static final List<String> notebookReviews = Arrays.asList(
            "\njournalgirl21: The best notebook on the market and the best price online. I wont buy anywhere else.\n",
            "Mike O. :\n This is the perfect work notebook. Perfect size for planning out my java projects.\n",
            "dickens25:\n This notebook is the perfect size to jot ideas for my next novel and Rainforest has a way better price than those other guys!\n");
    private static final List<String> tabletReviews = Arrays.asList(
            "\n Lizzie N. :\n This is such a great tablet for the price, much cheaper than Amazon and Best Buy.\n",
            "Todd N. :\n This is a nice tablet for beginners, but there are much better tablets on the market.\n",
            "artyparty12: \n The shipping on this tablet was so quick. I need this for a big project due next week so I'm glad it came so quickly!!\n"
    );


    private static final List<String> beaniePhotos = Arrays.asList("beanie1", "beanie2", "beanie3");
    private static final List<String> headlampPhotos = Arrays.asList("headlamp1", "headlamp2", "headlamp3");
    private static final List<String> magicmousePhotos = Arrays.asList("magicmouse1", "magicmouse2", "magicmouse3");
    private static final List<String> notebookPhotos = Arrays.asList("notebook1", "notebook2", "notebook3");
    private static final List<String> tabletPhotos = Arrays.asList("tablet1", "tablet2");

    public static List<Product> allProducts = Arrays.asList(
            new Product("beanie1", 15.00, "carhart beanie", 1, beaniePhotos, "Comfortable Carhart beanie. Comes in various colors and sizes.", 1001,beanieReviews),
            new Product("headlamp1", 50.00, "vehicle headlamp", 2, headlampPhotos, "LED headlamp for vehicle. Bright light for all conditions.", 1002,headlampReviews),
            new Product("magicmouse1", 75.00, "magic mouse for computer", 3, magicmousePhotos, "Magic mouse perfect for your all of your apple products.", 1003,magicmouseReviews),
            new Product("notebook1", 20.00, "moleskine notebook", 4, notebookPhotos, "Soft cover notebook with 240 pages. Comes in various colors", 1004, notebookReviews),
            new Product("tablet1", 70.00, "electronic drawing tablet", 5, tabletPhotos, "Electronic drawing tablet. Compatible with most electronic devices.", 1005,tabletReviews)
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

    public List<Product> findByCategory(int categoryId) {
        List<Product> foundProducts = new ArrayList<>();
        Product foundProduct;

        for (Product product : allProducts) {
            if (product.getCategory() == categoryId) {
                foundProduct = product;
                foundProducts.add(foundProduct);
            }
        }
        return foundProducts;
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
