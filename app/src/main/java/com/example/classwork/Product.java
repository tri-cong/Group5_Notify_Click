package com.example.classwork;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int price;
    private int imageResourceId;
    private String description;

    public Product(String name, int price, int imageResourceId, String description) {
        this.name = name;
        this.price = price;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
