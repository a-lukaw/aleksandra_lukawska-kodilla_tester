//Zadanie 6.4. Obsługa błędów
//Klasę Order, posiadającą pole String number, oraz konstruktor i gettery.

package com.kodilla.exception.homework;

public class Order {
    String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
