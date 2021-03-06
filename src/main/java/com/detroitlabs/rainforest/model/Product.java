package com.detroitlabs.rainforest.model;

import java.util.ArrayList;
import java.util.List;

public class Product {

    String name;
    double price;
    String miniDescription;
    int category;
    String fullDescription;
    int uniqueId;

    List<String> photos = new ArrayList<>();
    List<String> productReviews = new ArrayList<>();

    public Product(String name, double price, String miniDescription, int category, List<String> photos, String fullDescription,int uniqueId,List<String> productReviews) {
        this.name = name;
        this.price = price;
        this.miniDescription = miniDescription;
        this.category = category;
        this.photos = photos;
        this.fullDescription = fullDescription;
        this.uniqueId = uniqueId;
        this.productReviews = productReviews;
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

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public List<String> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(List<String> productReviews) {
        this.productReviews = productReviews;
    }
}
