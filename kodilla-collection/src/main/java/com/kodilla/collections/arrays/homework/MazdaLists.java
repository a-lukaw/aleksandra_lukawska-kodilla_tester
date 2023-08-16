package com.kodilla.collections.arrays.homework;                                                    ////Zad. 4.4. operacje na listach

public class MazdaLists implements CarLists {

    String model;
    String color;
    String brand;

    public MazdaLists(String model, String color) {
        this.model = model;
        this.color = color;
        this.brand = "Mazda";
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