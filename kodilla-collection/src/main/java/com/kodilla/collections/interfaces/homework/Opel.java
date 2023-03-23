package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
        System.out.println("Opel current speed : " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
        System.out.println("Opel current speed : " + speed);
    }
}