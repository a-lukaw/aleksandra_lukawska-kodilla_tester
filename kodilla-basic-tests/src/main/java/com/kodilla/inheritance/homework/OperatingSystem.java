package com.kodilla.inheritance.homework;

//Zad. 3.1 dziedziczenie w praktyce

public class OperatingSystem {

    int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void turnOn() {
        System.out.println("Turning the system on...");
    }

    public void turnOff() {
        System.out.println("Turning the system off...");
    }
}

