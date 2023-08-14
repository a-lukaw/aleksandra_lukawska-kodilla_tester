package com.kodilla.collections.interfaces.homework;

//Zad. 4.1. Wyścigi samochodowe

public class Mazda implements Car {

    int speed;

    public Mazda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;
        System.out.println("Mazda current speed: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        System.out.println("Mazda current speed: " + speed);
    }
}