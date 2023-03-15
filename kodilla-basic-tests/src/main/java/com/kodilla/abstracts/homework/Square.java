package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double side1;
    private double side2;

    public Square(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (2 *side1) + (2 *side2);
    }
}
