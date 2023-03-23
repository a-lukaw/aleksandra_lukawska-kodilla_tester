package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Car ford = new Ford();
        doRace(ford);

        Car opel = new Opel();
        doRace(opel);

        Car mazda = new Mazda();
        doRace(mazda);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("current speed : " + car.getSpeed());
    }
}
