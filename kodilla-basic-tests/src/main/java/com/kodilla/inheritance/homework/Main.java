package com.kodilla.inheritance.homework;

//Zad. 3.1 dziedziczenie w praktyce

public class Main {
    public static void main(String[] args) {

        MacOS macOS = new MacOS(2022);
        macOS.turnOn();
        macOS.turnOff();

        Windows windows = new Windows(2007);
        windows.turnOn();
        windows.turnOff();
    }
}