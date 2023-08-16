package com.kodilla.collections.sets;

//4.4. - zbiory

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {

        Set<Order> orders = new HashSet<>();                                                  //tworzymy kolekcję orderstypu HashSet
        orders.add(new Order("1/2019", "Iron", 1.0));           //do kolekcji dodajemy 4 obiekty (tu zamówienia) klasy Order
        orders.add(new Order("2/2019", "Cutlery", 6.0));
        orders.add(new Order("3/2019", "Chair", 2.0));
        orders.add(new Order("1/2019", "Iron", 1.0));           //celowo powtórzone zamówieniem numer jeden; program powinien wyświetlić rozmiar zbioru bez tego zamówienia

        System.out.println(orders.size());
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
