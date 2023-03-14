package com.kodilla.inheritance;

public class Convertible extends Car {
    public void openRoof() {
        System.out.println("Opening roof...");
    }
    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override             //adnotacja, dzięki której kompilator zweryfikuje poprawność metody względem metody z nadklasy

    //nadpisujemy metodę openDoors z klasy Car (kabriolet ma tylko dwoje drzwi)
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
    public Convertible(int wheels, int seats) {
        super(wheels, seats);
        System.out.println("Convertible constructor");
    }
}