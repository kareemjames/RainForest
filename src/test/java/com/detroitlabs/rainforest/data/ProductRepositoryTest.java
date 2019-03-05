package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ProductRepositoryTest {

    private ProductRepository productRepository = new ProductRepository();
    private List<Product> products;
    private List<String> photos;

    @Before
    public void create() {
        photos = Arrays.asList(
                "photo1", "photo2"
        );
        products = Arrays.asList(
                new Product("prod1", 10, "mini desc", 2, photos, "full description"),
                new Product("prod2", 20, "mini desc", 2, photos, "full description"),
                new Product("prod3", 30, "mini desc", 2, photos, "full description"),
                new Product("prod4", 40, "mini desc", 2, photos, "full description"),
                new Product("prod5", 50, "mini desc", 2, photos, "full description")
        );

        productRepository.setAllProducts(products);

    }

    @Test
    public void shouldFindProductByName() {
        Product expectedReturn = products.get(0);
        Product resultOfMethodCall = productRepository.findProductByName("prod1");

        assertThat(expectedReturn, equalTo(resultOfMethodCall));
    }

    @Test
    public void shouldDisplayFirstPhotoInArray() {
        String expectedReturn = "photo1";
        String resultOfMethodCall = productRepository.displayFirstPhotoInArray();

        assertThat(expectedReturn, equalTo(resultOfMethodCall));
    }

    @Test
    public void shouldReturnAllProductImages() {
        List<String> expectedReturn = photos;
        List<String> resultOfMethodCall = productRepository.returnAllProductImages(products.get(0));

        assertThat(expectedReturn, equalTo(resultOfMethodCall));
    }

    @Test
    public void splitSearchStringBySpace() {
        String[] expectedReturn = new String[]{"hello", "world", "bread"};
        String[] resultOfMethodCall = productRepository.splitSearchStringBySpace("hello world bread");
        assertThat(expectedReturn, equalTo(resultOfMethodCall));
    }
}