package com.kodilla.abstracts.homework;

//Zad. 3.2. dziedziczenie i klasy abstrakcyjne

public class Square extends Shape {

    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        int result = a * a;
        System.out.println("Square area is: " + result);
        return result;
    }

    @Override
    public double calculatePerimeter() {
        double result = 2 * a;
        System.out.println("Square perimeter is: " + result);

        return result;
    }
}

