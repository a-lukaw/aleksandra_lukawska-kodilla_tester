package com.kodilla.inheritance;

public class Car {
    //deklaracja dwóch prywatnych zmennych: liczby kół i liczby siedzeń; uwaga: zmienne typu private
    private int wheels;
    private int seats;

    //konstruktor Car - przypisanie wartości do zmiennych wheels i seats
    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    //tworzymy metodę włączającą światła
    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    //tworzymy metodę otwierającą drzwi
    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    //tworzymy gettery, aby dostać się do zmiennych prywatnych
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
    //metoda
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }
}