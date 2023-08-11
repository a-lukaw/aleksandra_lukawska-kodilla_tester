package com.kodilla.abstracts.homework;

//Zad. 3.2. dziedziczenie i klasy abstrakcyjne

class Triangle extends Shape {

    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * h * a;
        System.out.println("Triangle area is: " + area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a + b + c;
        System.out.println("Triangle perimeter is: " + perimeter);
        return perimeter;
    }
}
