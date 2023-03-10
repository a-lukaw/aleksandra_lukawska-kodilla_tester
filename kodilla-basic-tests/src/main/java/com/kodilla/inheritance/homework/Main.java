package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        //tworzymy obiekt typu Car z wykorzystaniem getterów z klasy Car
        OperatingSystem windows = new Windows(1985);
        OperatingSystem mac = new MacOS(2001);


        //wywołanie metod
        windows.turnOn();
        windows.turnOff();
        System.out.println("Windows release year : " + windows.getReleaseYear());


        mac.turnOn();
        mac.turnOff();
        System.out.println("MacOS release year : " + mac.getReleaseYear());
    }
}