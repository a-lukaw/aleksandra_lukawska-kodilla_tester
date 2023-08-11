package com.kodilla.inheritance.homework;

//Zad. 3.1 dziedziczenie w praktyce

public class Windows extends OperatingSystem {

    public Windows(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Turning Windows " + getYear() + " on...");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Turning Windows " + getYear() + " off...");
    }
}

