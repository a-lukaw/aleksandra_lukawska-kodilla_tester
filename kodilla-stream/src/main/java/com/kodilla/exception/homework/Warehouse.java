//Zadanie 6.4. Obsługa błędów
//Klasę Warehouse, która będzie przechowywała kolekcję zamówień.
// Napisz metody addOrder(Order order) – dodającą zamówienie do kolekcji
// oraz metodę Order getOrder(String number), która wyszuka w kolekcji zamówienie o podanym numerze (użyj Stream) i je zwróci.
// W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.

package com.kodilla.exception.homework;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders;
    public Warehouse() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
