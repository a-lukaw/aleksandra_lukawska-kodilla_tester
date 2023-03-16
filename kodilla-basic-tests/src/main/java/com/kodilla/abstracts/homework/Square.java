package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double side1;

    public Square(double side1) {
        this.side1 = side1;
    }

    @Override
    public double calculateArea() {
        return side1 * side1;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side1;
    }
}
