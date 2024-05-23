package com.example.example.animal;

public class Animal {

    private  int resourceImg;
    private  String name;

    public int getResourceImg() {
        return resourceImg;
    }

    public void setResourceImg(int resourceImg) {
        this.resourceImg = resourceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int resourceImg, String name) {
        this.resourceImg = resourceImg;
        this.name = name;
    }
}
