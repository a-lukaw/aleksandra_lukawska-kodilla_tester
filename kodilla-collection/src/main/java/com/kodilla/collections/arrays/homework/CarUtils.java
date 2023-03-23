package com.kodilla.collections.arrays.homework;        //zad. 4.2. losowanie wartości i iterowanie po tablicy

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;
public class CarUtils {

    public static void describeCar(Car car) {                                   //definiujemy metodę statyczną describeCar, która wyświetla informacje o samochodzie:
        System.out.println("-----------------------------");
        System.out.println("Car brand is: " + getCarBrand(car));
        System.out.println("Car model is: " + ((Mazda) car).getModel());
        System.out.println("Current car speed: "  + car.getSpeed()); }

    private static String getCarBrand(Car car) {                           //informację o nazwie samochodu uzyskujemy przy pomocy operatora instanceof, który zwraca wartość true lub false w zależności od tego, czy dany obiekt jest wskazanej klasy, czy też nie.
        if (car instanceof Ford)                                           //dla uproszczenia pominięto nawiasy klamrowe
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Mazda)
            return "Mazda";
        else
            return "Unknown";
    }
}