package com.detroitlabs.rainforest.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Product {

    String name;
    double price;
    String miniDescription;
    int category;

    List<String> photos = new ArrayList<>();

    public Product(String name, double price, String miniDescription, int category, List<String> photos) {
        this.name = name;
        this.price = price;
        this.miniDescription = miniDescription;
        this.category = category;
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", miniDescription='" + miniDescription + '\'' +
                ", category=" + category +
                ", photos=" + photos +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMiniDescription() {
        return miniDescription;
    }

    public void setMiniDescription(String miniDescription) {
        this.miniDescription = miniDescription;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

}
