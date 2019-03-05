package com.detroitlabs.rainforest.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> cart;

    public Cart(){
        cart = new ArrayList<>();
    }

    public List<Product> viewAllItemsInCart() {

        return cart;
    }

    public void addItemToCart(Product product){

        cart.add(product);
    }

    public void removeItemFromCart(int id){
        int initialCartSize = cart.size();
        for(int i = 0; i < initialCartSize; i++){
            if(cart.get(i).getUniqueId() == id){
                cart.remove(i);
                break;
            }
        }

//        Product foundProduct = null;
//        for(Product product : cart){
//            if(product.getUniqueId() == id){
//                foundProduct = product;
//            }
//        }
//        cart.remove(foundProduct);

    }

    public int getSizeOfCart(){
        return cart.size();
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}
