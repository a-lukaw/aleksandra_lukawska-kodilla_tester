package com.kodilla.collections.sets;

//4.4. - zbiory

//4.4. Kolekcje - zbiory
//Naszym celem będzie napisanie kolekcji przechowującej zamówienia.
// W związku z tym, że dane zamówienie może przypadkowo zostać przesłane więcej niż jeden raz, użyjemy kolekcji HashSet, aby zagwarantować, że poszczególne zamówienia są w niej zapamiętane tylko jeden raz
// (aby na przykład dwukrotnie nie wysłać do klienta tego samego towaru).

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productName;
    private double quantity;

    public Order(String orderNumber, String productName, double quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(quantity, order.quantity) == 0 && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productName, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
