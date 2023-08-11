package com.kodilla.inheritance.homework;

//Zad. 3.1 dziedziczenie w praktyce

public class MacOS extends OperatingSystem {

    public MacOS(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Turning MacOS " + getYear() + " on...");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Turning MacOS " + getYear() + " off...");
    }
}
