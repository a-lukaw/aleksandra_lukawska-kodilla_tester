package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
        System.out.println("Ford current speed : " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        System.out.println("Ford current speed : " + speed);
    }
}