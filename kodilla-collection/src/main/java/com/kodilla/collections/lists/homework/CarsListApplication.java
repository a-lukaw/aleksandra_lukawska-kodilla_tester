package com.kodilla.collections.lists.homework;             //Zad. 4.4. operacje na listach

import com.kodilla.collections.arrays.homework.*;
import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<CarLists> cars = new ArrayList<>();

        cars.add(new MazdaLists("3", "black"));
        cars.add(new MazdaLists("6", "red"));
        cars.add(new OpelLists("Vectra", "silver"));
        cars.add(new OpelLists("Astra", "white"));
        cars.add(new FordLists("Fiesta", "black"));


        for (CarLists carLists : cars) {
            CarUtilsLists.describeCar(carLists);
        }
    }
}
