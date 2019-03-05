package com.detroitlabs.rainforest.model;

import java.util.List;

public class Cart {

    private List<Product> cart;

    public Cart(List<Product> cart) {
        this.cart = cart;
    }

    public List<Product> viewAllItemsInCart() {
        return cart;
    }

    public void addItemToCart(Product product){
        cart.add(product);
    }

    public void removeItemFromCart(String name){
        for(Product product : cart){
            if(product.getName().equalsIgnoreCase(name)){
                cart.remove(product);
            }
        }

    }




}
