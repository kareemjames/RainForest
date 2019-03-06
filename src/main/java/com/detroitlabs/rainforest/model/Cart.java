package com.detroitlabs.rainforest.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    public List<Product> viewAllItemsInCart() {

        return cart;
    }

    public void addItemToCart(Product product) {

        cart.add(product);
    }

    public void removeItemFromCart(int id) {
        int initialCartSize = cart.size();
        for (int i = 0; i < initialCartSize; i++) {
            if (cart.get(i).getUniqueId() == id) {
                cart.remove(i);
                break;

            }
        }
    }

    public int getSizeOfCart() {
        return cart.size();
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }


    public double totalPriceOfProductInCart() {
        double checkoutTotal = 0;
        List<Double> pricesOfItemsInCart = new ArrayList<>();
        for(Product product : cart){
           pricesOfItemsInCart.add(product.getPrice());
        }
        for(Double priceOfItem : pricesOfItemsInCart){
            checkoutTotal += priceOfItem;
        }
        return checkoutTotal;
    }

}
