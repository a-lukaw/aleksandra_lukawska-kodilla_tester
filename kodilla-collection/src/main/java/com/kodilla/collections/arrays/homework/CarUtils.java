package com.kodilla.collections.arrays.homework;
//zad. 4.2. losowanie wartości i iterowanie po tablicy

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand is: " + getCarBrand(car));
        //System.out.println("Car model is: " + ((Mazda) car).getModel());
        System.out.println("Current car speed: " + car.getSpeed());
    }

    public static String getCarBrand(Car car) {
        if (car instanceof Ford) {
            return "Ford";
        } else if (car instanceof Mazda) {
            return "Mazda";
        } else if (car instanceof Opel) {
            return "Opel";
        } else {
            return "Unknown car brand";
        }
    }
}