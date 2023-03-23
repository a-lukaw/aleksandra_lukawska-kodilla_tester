package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();                                          //stwórz kolekcję samochodów (typu ArrayList), której typem elementów będzie dowolna klasa implementująca interfejs Car

        Mazda mazda = new Mazda("3", "black");
        cars.add(mazda);                                                             //dodaj do kolekcji kilka różnych samochodów

        cars.add(new Mazda("6", "red"));
        cars.add(new Mazda("MX-5", "red"));

        System.out.println(cars.size());                           //wyświetl informację o rozmiarze kolekcji
        for(Car car : cars) {
            CarUtils.describeCar(car); }

        cars.remove(0);                                     //usuń jeden z samochodów z kolekcji, używając do tego metody remove(int index)
        cars.remove(mazda);                                      //usuń jeden z samochodów z kolekcji, używając do tego metody remove(Object o).

        System.out.println(cars.size());                          //wyświetl informację o rozmiarze kolekcji
        for(Car car: cars) {                                     //wyświetl w pętli for-each zawartość kolekcji, używając przygotowanej wcześniej metody describeCar z klasy CarUtils
            CarUtils.describeCar(car); }
         }
}
