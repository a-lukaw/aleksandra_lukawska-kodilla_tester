package com.kodilla.collections.arrays.homework;                                        //Zad. 4.4. operacje na listach


public class CarUtilsLists {
    public static void describeCar(CarLists carLists) {

        System.out.println("-----------------------------");
        System.out.println("Car brand is: " + (carLists.getBrand()));
        System.out.println("Car model is: " + (carLists.getModel()));
        System.out.println("Car color is: " + (carLists.getColor()));
    }
}