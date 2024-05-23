package com.example.example.category;

import com.example.example.animal.Animal;

import java.util.List;

public class Category {
    String nameCategory;
    List<Animal> animalList;

    public Category(String nameCategory, List<Animal> animalList) {
        this.nameCategory = nameCategory;
        this.animalList = animalList;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}
