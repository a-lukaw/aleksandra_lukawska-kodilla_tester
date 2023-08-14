package com.kodilla.collections.interfaces.homework;

//Zad. 4.1. Wyścigi samochodowe

public class Opel implements Car {

    int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
        System.out.println("Opel current speed: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        System.out.println("Opel current speed: " + speed);
    }
}
