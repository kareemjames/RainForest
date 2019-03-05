package com.detroitlabs.rainforest.model;

public class Category {
    int id;
    String name;
    String uriName;

    public Category(int id, String name, String uriName) {
        this.id = id;
        this.name = name;
        this.uriName = uriName;
    }


    public String getUriName() {
        return uriName;
    }

    public void setUriName(String uriName) {
        this.uriName = uriName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
