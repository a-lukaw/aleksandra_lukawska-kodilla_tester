package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {

    public MacOS(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Starting MacOS...");
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down MacOS...");
    }
}