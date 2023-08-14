package com.kodilla.collections.interfaces.homework;

//Zad. 4.1. wyścigi samochodowe

public class CarRace {
    public static void main(String[] args) {

        Car ford = new Ford(0);
        doRace(ford);

        Car opel = new Opel(0);
        doRace(opel);

        Car mazda = new Mazda(0);
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
