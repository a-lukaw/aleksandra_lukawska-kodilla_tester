package com.kodilla.abstracts.homework;

class Triangle extends Shape {
    private double base;
    private double side1;
    private double side2;
    private double side3;
    private double height;

    public Triangle(double base, double side1, double side2, double side3, double height) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
