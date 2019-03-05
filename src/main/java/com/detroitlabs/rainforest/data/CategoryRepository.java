package com.detroitlabs.rainforest.data;

import com.detroitlabs.rainforest.model.Category;
import com.detroitlabs.rainforest.model.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> CATEGORY_LIST = Arrays.asList(
            new Category(1,"Beanies", "beanies"),
            new Category(2,"Car Parts", "carparts"),
            new Category(3, "Computer Accessories", "computeraccessories"),
            new Category(4, "Notebooks", "notebooks")
    );

    public List<Category> returnAllCategories() {
        return CATEGORY_LIST;
    }






}


