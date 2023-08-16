package com.kodilla.collections.arrays.homework;

//Zad. 4.4.

public class FordLists implements CarLists {
    String model;
    String color;
    String brand;

    public FordLists(String model, String color) {
        this.model = model;
        this.color = color;
        this.brand = "Ford";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}