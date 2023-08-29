//Zadanie 6.4. Obsługa błędów
// Klasę WarehouseApp z metodą main.
// W metodzie main dodaj kilka zamówień do hurtowni przy pomocy metody addOrder(), a następnie spróbuj wyszukać jakieś nieistniejące zamówienie.
// Przygotuj odpowiednią obsługę błędów.

package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1/2023"));
        warehouse.addOrder(new Order("2/2023"));
        warehouse.addOrder(new Order("3/2023"));
        warehouse.addOrder(new Order("4/2023"));
        warehouse.addOrder(new Order("5/2023"));

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