package com.kodilla.inheritance.homework;

public class OperatingSystem {

    //prywatne pole releaseYear typu int
    private int releaseYear;

    //konstruktor, który przyjmuje argument rok wydania systemu operacyjnego i przypisuje go do wartości pola releaseYear
    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("Operating system is turning on...");
    }

    public void turnOff() {
        System.out.println("Operating system is turning off...");
    }

    //tworzymy getter, aby dostać się do zmiennych prywatnych
    public int getReleaseYear () {
       return releaseYear;
        }
    }