package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5, 5);
        System.out.println("Circle area: " + square.calculateArea());
        System.out.println("Circle perimeter: " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5, 5, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}