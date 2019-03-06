package com.detroitlabs.rainforest.model;

import com.detroitlabs.rainforest.data.ProductRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CartTest {
    private ProductRepository productRepository = new ProductRepository();
    private List<Product> products;
    private List<String> photos;
    private Cart cart;

    @Before
    public void create() {
        photos = Arrays.asList(
                "photo1", "photo2"
        );
        products = Arrays.asList(
                new Product("prod1", 10, "mini desc", 2, photos, "full description",1001),
                new Product("prod2", 20, "mini desc", 2, photos, "full description",1002),
                new Product("prod3", 30, "mini desc", 2, photos, "full description",1003),
                new Product("prod4", 40, "mini desc", 2, photos, "full description",1004),
                new Product("prod5", 50, "mini desc", 2, photos, "full description",1005)
        );

        productRepository.setAllProducts(products);


        cart = new Cart();
    }


    @Test
    public void addItemToCart() {

        cart.addItemToCart(products.get(0));
        cart.addItemToCart(products.get(1));

        int expectedCartSize = 2;
        int resultOfMethodCall = cart.getSizeOfCart();

        assertThat(expectedCartSize, equalTo(resultOfMethodCall));


    }

    @Test
    public void shouldRemoveItemFromCart() {
        List<Product> itemsInCart = new ArrayList<>();
        itemsInCart.add(new Product("prod1", 10, "mini desc", 2, photos, "full description",1001));
        itemsInCart.add(new Product("prod2", 20, "mini desc", 2, photos, "full description",1002));
        cart.setCart(itemsInCart);

        cart.removeItemFromCart(1002);

        int expectedCartSize = 1;
        int resultOfMethodCall = cart.getSizeOfCart();

        assertThat(expectedCartSize, equalTo(resultOfMethodCall));

    }


}