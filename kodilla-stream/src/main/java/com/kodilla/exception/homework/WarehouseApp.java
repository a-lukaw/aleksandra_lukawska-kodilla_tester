//Zadanie 6.4. Obsługa błędów
// Klasę WarehouseApp z metodą main.
// W metodzie main dodaj kilka zamówień do hurtowni przy pomocy metody addOrder(), a następnie spróbuj wyszukać jakieś nieistniejące zamówienie.
// Przygotuj odpowiednią obsługę błędów.

package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        //dodawanie zamówień
        Order order1 = new Order("001");
        Order order2 = new Order("002");
        Order order3 = new Order("003");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        //wyszukiwanie zamówienia
        String searchOrderNumber = "004";

        try {
            Order foundOrder = warehouse.getOrder(searchOrderNumber);
            System.out.println("Znaleziono zamówienie nr: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie znaleziono zamówienia o numerze: " + searchOrderNumber);
        }

    }
}