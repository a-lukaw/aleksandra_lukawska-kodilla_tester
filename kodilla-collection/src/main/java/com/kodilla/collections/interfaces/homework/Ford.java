package com.kodilla.collections.interfaces.homework;

//Zad. 4.1. Wyścigi samochodowe

public class Ford implements Car {
    int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 30;
        System.out.println("Ford current speed: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 10;
        System.out.println("Ford current speed: " + speed);
    }
}