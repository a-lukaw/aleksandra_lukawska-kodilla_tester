package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25;
        System.out.println("Mazda current speed : " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 8;
        System.out.println("Mazda current speed : " + speed);
    }
}