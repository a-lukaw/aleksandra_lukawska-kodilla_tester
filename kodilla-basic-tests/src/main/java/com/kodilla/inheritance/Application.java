package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        //tworzymy obiekt typu Car z wykorzystaniem getterów z klasy Car
        Car car = new Car(4,5);
        //wywołanie metody
        car.turnOnLights();                                                     //metoda odziedziczona z nadklasy Object


        //tworzymy obiekt typu Convertible
        Convertible convertible = new Convertible(4,2);
        convertible.displayNumberOfSeats();
    }
}
