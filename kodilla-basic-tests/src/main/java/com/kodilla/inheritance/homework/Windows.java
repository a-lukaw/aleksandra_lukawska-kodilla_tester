package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    //nadpisujemy metody turnOn i turnOff z klasy OperatingSystem (rok wydania systemu Windows)

    public void turnOn() {
        System.out.println("Starting Windows...");
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down Windows...");
    }
}