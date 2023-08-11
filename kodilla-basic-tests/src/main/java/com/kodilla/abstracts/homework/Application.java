package com.kodilla.abstracts.homework;

//Zad. 3.2. dziedziczenie i klasy abstrakcyjne

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Square square = new Square(5);
        square.calculateArea();
        square.calculatePerimeter();

        Triangle triangle = new Triangle(5,2,7,5);
        triangle.calculateArea();
        triangle.calculatePerimeter();

    }
}
